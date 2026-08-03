import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.conferenceroomscheduler.model.Reservation;
import com.conferenceroomscheduler.patterns.BookingContext;
import com.conferenceroomscheduler.patterns.BookingState;
import com.conferenceroomscheduler.patterns.CancelledBookingState;
import com.conferenceroomscheduler.patterns.CheckedInBookingState;
import com.conferenceroomscheduler.patterns.CompletedBookingState;
import com.conferenceroomscheduler.patterns.ConfirmedBookingState;
import com.conferenceroomscheduler.patterns.PendingBookingState;

class AiStateTests {

	// ============================================================
	// AI Generated Tests
	// BookingContext.java
	// ============================================================


	@Test
	void aiTestNewContextAlwaysStartsPending() {

	    BookingContext context =
	            new BookingContext(new Reservation());

	    assertInstanceOf(
	            PendingBookingState.class,
	            context.getState()
	    );
	}



	@Test
	void aiTestContextKeepsOriginalReservationReference() {

	    Reservation reservation = new Reservation();

	    BookingContext context =
	            new BookingContext(reservation);


	    assertSame(
	            reservation,
	            context.getReservation()
	    );
	}



	@Test
	void aiTestSuccessfulBookingFlowFromPendingToConfirmed() {

	    Reservation reservation = new Reservation();
	    reservation.setDepositAmount(200);


	    BookingContext context =
	            new BookingContext(reservation);


	    context.request();


	    assertInstanceOf(
	            ConfirmedBookingState.class,
	            context.getState()
	    );
	}



	@Test
	void aiTestRequestDoesNotProgressWithoutPayment() {

	    Reservation reservation = new Reservation();

	    reservation.setDepositAmount(0);


	    BookingContext context =
	            new BookingContext(reservation);


	    context.request();


	    assertEquals(
	            "Pending",
	            context.getStatus()
	    );
	}



	@Test
	void aiTestChangingStateUpdatesReturnedStatus() {

	    BookingContext context =
	            new BookingContext(new Reservation());


	    context.setState(
	            new CancelledBookingState()
	    );


	    assertEquals(
	            "Cancelled",
	            context.getStatus()
	    );
	}



	@Test
	void aiTestTwoContextsDoNotShareState() {

	    BookingContext first =
	            new BookingContext(new Reservation());

	    BookingContext second =
	            new BookingContext(new Reservation());


	    first.setState(
	            new CompletedBookingState()
	    );


	    assertEquals(
	            "Pending",
	            second.getStatus()
	    );
	}



	@Test
	void aiTestContextCanRestartWorkflowAfterManualStateChange() {

	    Reservation reservation = new Reservation();
	    reservation.setDepositAmount(50);


	    BookingContext context =
	            new BookingContext(reservation);


	    context.setState(
	            new PendingBookingState()
	    );


	    context.request();


	    assertInstanceOf(
	            ConfirmedBookingState.class,
	            context.getState()
	    );
	}



	@Test
	void aiTestConfirmedStateCanContinueUsingSameContext() {

	    BookingContext context =
	            new BookingContext(new Reservation());


	    context.setState(
	            new ConfirmedBookingState()
	    );


	    context.request();


	    assertEquals(
	            "Checked in.",
	            context.getStatus()
	    );
	}



	@Test
	void aiTestCompletedStateIsFinalForContext() {

	    BookingContext context =
	            new BookingContext(new Reservation());


	    context.setState(
	            new CompletedBookingState()
	    );


	    context.request();


	    assertEquals(
	            "Booking complete",
	            context.getStatus()
	    );
	}



	@Test
	void aiTestCancelledStatePreventsFurtherTransitions() {

	    BookingContext context =
	            new BookingContext(new Reservation());


	    context.setState(
	            new CancelledBookingState()
	    );


	    context.request();


	    assertInstanceOf(
	            CancelledBookingState.class,
	            context.getState()
	    );
	}
	
	// ============================================================
	// AI Generated Tests
	// PendingBookingState.java
	// ============================================================


	@Test
	void aiTestPendingStateNameIsCorrect() {

	    PendingBookingState state =
	            new PendingBookingState();


	    assertEquals(
	            "Pending",
	            state.getName()
	    );
	}



	@Test
	void aiTestPendingBookingMovesForwardWithDeposit() {

	    Reservation reservation =
	            new Reservation();

	    reservation.setDepositAmount(100);


	    BookingContext context =
	            new BookingContext(reservation);


	    context.request();


	    assertInstanceOf(
	            ConfirmedBookingState.class,
	            context.getState()
	    );
	}



	@Test
	void aiTestPendingBookingDoesNotMoveForwardWithNoDeposit() {

	    Reservation reservation =
	            new Reservation();

	    reservation.setDepositAmount(0);


	    BookingContext context =
	            new BookingContext(reservation);


	    new PendingBookingState()
	            .handle(context);


	    assertInstanceOf(
	            PendingBookingState.class,
	            context.getState()
	    );
	}



	@Test
	void aiTestPendingBookingRejectsNegativePayment() {

	    Reservation reservation =
	            new Reservation();

	    reservation.setDepositAmount(-500);


	    BookingContext context =
	            new BookingContext(reservation);


	    context.request();


	    assertEquals(
	            "Pending",
	            context.getStatus()
	    );
	}



	@Test
	void aiTestPendingBookingAcceptsSmallPositiveDeposit() {

	    Reservation reservation =
	            new Reservation();

	    reservation.setDepositAmount(0.01);


	    BookingContext context =
	            new BookingContext(reservation);


	    context.request();


	    assertInstanceOf(
	            ConfirmedBookingState.class,
	            context.getState()
	    );
	}



	@Test
	void aiTestPendingBookingHandlesLargeDeposit() {

	    Reservation reservation =
	            new Reservation();

	    reservation.setDepositAmount(999999);


	    BookingContext context =
	            new BookingContext(reservation);


	    context.request();


	    assertEquals(
	            "Booking confirmed.",
	            context.getStatus()
	    );
	}



	@Test
	void aiTestPendingStateObjectsAreIndependent() {

	    PendingBookingState first =
	            new PendingBookingState();

	    PendingBookingState second =
	            new PendingBookingState();


	    assertNotSame(
	            first,
	            second
	    );


	    assertEquals(
	            first.getName(),
	            second.getName()
	    );
	}



	@Test
	void aiTestPendingHandleUsesReservationDepositValue() {

	    Reservation reservation =
	            new Reservation();


	    reservation.setDepositAmount(250);


	    BookingContext context =
	            new BookingContext(reservation);


	    PendingBookingState state =
	            new PendingBookingState();


	    state.handle(context);


	    assertEquals(
	            "Booking confirmed.",
	            context.getStatus()
	    );
	}



	@Test
	void aiTestPendingStateRemainsAfterRepeatedZeroDeposits() {

	    Reservation reservation =
	            new Reservation();

	    reservation.setDepositAmount(0);


	    BookingContext context =
	            new BookingContext(reservation);


	    context.request();
	    context.request();


	    assertInstanceOf(
	            PendingBookingState.class,
	            context.getState()
	    );
	}



	@Test
	void aiTestPendingStateTransitionsOnlyAfterDeposit() {

	    Reservation reservation =
	            new Reservation();

	    reservation.setDepositAmount(100);


	    BookingContext context =
	            new BookingContext(reservation);


	    assertInstanceOf(
	            PendingBookingState.class,
	            context.getState()
	    );


	    context.request();


	    assertInstanceOf(
	            ConfirmedBookingState.class,
	            context.getState()
	    );
	}
	
	// ============================================================
	// AI Generated Tests
	// ConfirmedBookingState.java
	// ============================================================


	@Test
	void aiTestConfirmedStateReturnsCorrectName() {

	    ConfirmedBookingState state =
	            new ConfirmedBookingState();


	    assertEquals(
	            "Booking confirmed.",
	            state.getName()
	    );
	}



	@Test
	void aiTestConfirmedBookingMovesToCheckedIn() {

	    BookingContext context =
	            new BookingContext(new Reservation());


	    ConfirmedBookingState state =
	            new ConfirmedBookingState();


	    state.handle(context);


	    assertInstanceOf(
	            CheckedInBookingState.class,
	            context.getState()
	    );
	}



	@Test
	void aiTestConfirmedStateChangesContextStatusAfterRequest() {

	    BookingContext context =
	            new BookingContext(new Reservation());


	    context.setState(
	            new ConfirmedBookingState()
	    );


	    context.request();


	    assertEquals(
	            "Checked in.",
	            context.getStatus()
	    );
	}



	@Test
	void aiTestConfirmedStateDoesNotSkipCheckedInStage() {

	    BookingContext context =
	            new BookingContext(new Reservation());


	    context.setState(
	            new ConfirmedBookingState()
	    );


	    context.request();


	    assertFalse(
	            context.getState()
	            instanceof CompletedBookingState
	    );


	    assertInstanceOf(
	            CheckedInBookingState.class,
	            context.getState()
	    );
	}



	@Test
	void aiTestConfirmedStateWorksWithEmptyReservation() {

	    Reservation reservation =
	            new Reservation();


	    BookingContext context =
	            new BookingContext(reservation);


	    new ConfirmedBookingState()
	            .handle(context);


	    assertInstanceOf(
	            CheckedInBookingState.class,
	            context.getState()
	    );
	}



	@Test
	void aiTestConfirmedStateWorksRegardlessOfDepositValue() {

	    Reservation reservation =
	            new Reservation();


	    reservation.setDepositAmount(0);


	    BookingContext context =
	            new BookingContext(reservation);


	    context.setState(
	            new ConfirmedBookingState()
	    );


	    context.request();


	    assertInstanceOf(
	            CheckedInBookingState.class,
	            context.getState()
	    );
	}



	@Test
	void aiTestMultipleConfirmedObjectsHaveSameBehaviour() {

	    ConfirmedBookingState first =
	            new ConfirmedBookingState();

	    ConfirmedBookingState second =
	            new ConfirmedBookingState();


	    assertEquals(
	            first.getName(),
	            second.getName()
	    );
	}



	@Test
	void aiTestConfirmedStateCanBeAssignedToContext() {

	    BookingContext context =
	            new BookingContext(new Reservation());


	    BookingState state =
	            new ConfirmedBookingState();


	    context.setState(state);


	    assertSame(
	            state,
	            context.getState()
	    );
	}



	@Test
	void aiTestConfirmedStateTransitionCanBeRepeatedOnDifferentContexts() {

	    BookingContext first =
	            new BookingContext(new Reservation());

	    BookingContext second =
	            new BookingContext(new Reservation());


	    first.setState(
	            new ConfirmedBookingState()
	    );

	    second.setState(
	            new ConfirmedBookingState()
	    );


	    first.request();
	    second.request();


	    assertInstanceOf(
	            CheckedInBookingState.class,
	            first.getState()
	    );


	    assertInstanceOf(
	            CheckedInBookingState.class,
	            second.getState()
	    );
	}



	@Test
	void aiTestConfirmedStateObjectCanBeCreated() {

	    ConfirmedBookingState state =
	            new ConfirmedBookingState();


	    assertNotNull(state);
	}
	
	// ============================================================
	// AI Generated Tests
	// CheckedInBookingState.java
	// ============================================================


	@Test
	void aiTestCheckedInStateReturnsCorrectName() {

	    CheckedInBookingState state =
	            new CheckedInBookingState();


	    assertEquals(
	            "Checked in.",
	            state.getName()
	    );
	}



	@Test
	void aiTestCheckedInBookingMovesToCompleted() {

	    BookingContext context =
	            new BookingContext(new Reservation());


	    CheckedInBookingState state =
	            new CheckedInBookingState();


	    state.handle(context);


	    assertInstanceOf(
	            CompletedBookingState.class,
	            context.getState()
	    );
	}



	@Test
	void aiTestCheckedInRequestUpdatesStatusToCompleted() {

	    BookingContext context =
	            new BookingContext(new Reservation());


	    context.setState(
	            new CheckedInBookingState()
	    );


	    context.request();


	    assertEquals(
	            "Booking complete",
	            context.getStatus()
	    );
	}



	@Test
	void aiTestCheckedInStateDoesNotRemainAfterHandling() {

	    BookingContext context =
	            new BookingContext(new Reservation());


	    context.setState(
	            new CheckedInBookingState()
	    );


	    context.request();


	    assertFalse(
	            context.getState()
	            instanceof CheckedInBookingState
	    );
	}



	@Test
	void aiTestCheckedInStateWorksWithDifferentReservations() {

	    Reservation firstReservation =
	            new Reservation();

	    Reservation secondReservation =
	            new Reservation();


	    BookingContext first =
	            new BookingContext(firstReservation);

	    BookingContext second =
	            new BookingContext(secondReservation);


	    first.setState(
	            new CheckedInBookingState()
	    );

	    second.setState(
	            new CheckedInBookingState()
	    );


	    first.request();
	    second.request();


	    assertInstanceOf(
	            CompletedBookingState.class,
	            first.getState()
	    );


	    assertInstanceOf(
	            CompletedBookingState.class,
	            second.getState()
	    );
	}



	@Test
	void aiTestCheckedInStateIgnoresReservationDetails() {

	    Reservation reservation =
	            new Reservation();


	    reservation.setDepositAmount(1000);


	    BookingContext context =
	            new BookingContext(reservation);


	    context.setState(
	            new CheckedInBookingState()
	    );


	    context.request();


	    assertEquals(
	            "Booking complete",
	            context.getStatus()
	    );
	}



	@Test
	void aiTestCheckedInStateCanBeStoredAsBookingState() {

	    BookingState state =
	            new CheckedInBookingState();


	    assertEquals(
	            "Checked in.",
	            state.getName()
	    );
	}



	@Test
	void aiTestMultipleCheckedInStatesBehaveTheSame() {

	    CheckedInBookingState first =
	            new CheckedInBookingState();

	    CheckedInBookingState second =
	            new CheckedInBookingState();


	    assertEquals(
	            first.getName(),
	            second.getName()
	    );
	}



	@Test
	void aiTestCheckedInStateObjectIsCreatedSuccessfully() {

	    CheckedInBookingState state =
	            new CheckedInBookingState();


	    assertNotNull(state);
	}



	@Test
	void aiTestCheckedInStateTransitionIsTerminalForNextState() {

	    BookingContext context =
	            new BookingContext(new Reservation());


	    context.setState(
	            new CheckedInBookingState()
	    );


	    context.request();


	    BookingState result =
	            context.getState();


	    assertTrue(
	            result instanceof CompletedBookingState
	    );
	}
	
	// ============================================================
	// AI Generated Tests
	// CompletedBookingState.java
	// ============================================================


	@Test
	void aiTestCompletedStateReturnsCorrectName() {

	    CompletedBookingState state =
	            new CompletedBookingState();


	    assertEquals(
	            "Booking complete",
	            state.getName()
	    );
	}



	@Test
	void aiTestCompletedStateDoesNotChangeAfterRequest() {

	    BookingContext context =
	            new BookingContext(new Reservation());


	    context.setState(
	            new CompletedBookingState()
	    );


	    context.request();


	    assertInstanceOf(
	            CompletedBookingState.class,
	            context.getState()
	    );
	}



	@Test
	void aiTestCompletedStateRemainsCompletedAfterMultipleRequests() {

	    BookingContext context =
	            new BookingContext(new Reservation());


	    context.setState(
	            new CompletedBookingState()
	    );


	    context.request();
	    context.request();
	    context.request();


	    assertEquals(
	            "Booking complete",
	            context.getStatus()
	    );
	}



	@Test
	void aiTestCompletedStateWorksWithEmptyReservation() {

	    Reservation reservation =
	            new Reservation();


	    BookingContext context =
	            new BookingContext(reservation);


	    context.setState(
	            new CompletedBookingState()
	    );


	    context.request();


	    assertInstanceOf(
	            CompletedBookingState.class,
	            context.getState()
	    );
	}



	@Test
	void aiTestCompletedStateWorksWithPaidReservation() {

	    Reservation reservation =
	            new Reservation();


	    reservation.setDepositAmount(500);


	    BookingContext context =
	            new BookingContext(reservation);


	    context.setState(
	            new CompletedBookingState()
	    );


	    context.request();


	    assertEquals(
	            "Booking complete",
	            context.getStatus()
	    );
	}



	@Test
	void aiTestCompletedStateDoesNotMoveToAnotherState() {

	    BookingContext context =
	            new BookingContext(new Reservation());


	    context.setState(
	            new CompletedBookingState()
	    );


	    context.request();


	    assertFalse(
	            context.getState()
	            instanceof PendingBookingState
	    );


	    assertFalse(
	            context.getState()
	            instanceof CancelledBookingState
	    );
	}



	@Test
	void aiTestCompletedStateCanBeAssignedThroughInterface() {

	    BookingState state =
	            new CompletedBookingState();


	    assertEquals(
	            "Booking complete",
	            state.getName()
	    );
	}



	@Test
	void aiTestDifferentCompletedObjectsHaveSameBehaviour() {

	    CompletedBookingState first =
	            new CompletedBookingState();

	    CompletedBookingState second =
	            new CompletedBookingState();


	    assertEquals(
	            first.getName(),
	            second.getName()
	    );
	}



	@Test
	void aiTestCompletedStateObjectCreation() {

	    CompletedBookingState state =
	            new CompletedBookingState();


	    assertNotNull(state);
	}



	@Test
	void aiTestCompletedStateActsAsFinalBookingStage() {

	    BookingContext context =
	            new BookingContext(new Reservation());


	    context.setState(
	            new CompletedBookingState()
	    );


	    String before =
	            context.getStatus();


	    context.request();


	    String after =
	            context.getStatus();


	    assertEquals(
	            before,
	            after
	    );


	    assertEquals(
	            "Booking complete",
	            after
	    );
	}
	
	// ============================================================
	// AI Generated Tests
	// CancelledBookingState.java
	// ============================================================


	@Test
	void aiTestCancelledStateReturnsCorrectName() {

	    CancelledBookingState state =
	            new CancelledBookingState();


	    assertEquals(
	            "Cancelled",
	            state.getName()
	    );
	}



	@Test
	void aiTestCancelledStateDoesNotMoveAfterRequest() {

	    BookingContext context =
	            new BookingContext(new Reservation());


	    context.setState(
	            new CancelledBookingState()
	    );


	    context.request();


	    assertInstanceOf(
	            CancelledBookingState.class,
	            context.getState()
	    );
	}



	@Test
	void aiTestCancelledStateRemainsCancelledAfterMultipleRequests() {

	    BookingContext context =
	            new BookingContext(new Reservation());


	    context.setState(
	            new CancelledBookingState()
	    );


	    context.request();
	    context.request();
	    context.request();


	    assertEquals(
	            "Cancelled",
	            context.getStatus()
	    );
	}



	@Test
	void aiTestCancelledStateWorksWithEmptyReservation() {

	    Reservation reservation =
	            new Reservation();


	    BookingContext context =
	            new BookingContext(reservation);


	    context.setState(
	            new CancelledBookingState()
	    );


	    context.request();


	    assertInstanceOf(
	            CancelledBookingState.class,
	            context.getState()
	    );
	}



	@Test
	void aiTestCancelledStateWorksWithReservationContainingDeposit() {

	    Reservation reservation =
	            new Reservation();


	    reservation.setDepositAmount(500);


	    BookingContext context =
	            new BookingContext(reservation);


	    context.setState(
	            new CancelledBookingState()
	    );


	    context.request();


	    assertEquals(
	            "Cancelled",
	            context.getStatus()
	    );
	}



	@Test
	void aiTestCancelledStateCannotContinueBookingWorkflow() {

	    BookingContext context =
	            new BookingContext(new Reservation());


	    context.setState(
	            new CancelledBookingState()
	    );


	    context.request();


	    assertFalse(
	            context.getState()
	            instanceof ConfirmedBookingState
	    );


	    assertFalse(
	            context.getState()
	            instanceof CheckedInBookingState
	    );
	}



	@Test
	void aiTestCancelledStateCanBeStoredAsBookingStateInterface() {

	    BookingState state =
	            new CancelledBookingState();


	    assertEquals(
	            "Cancelled",
	            state.getName()
	    );
	}



	@Test
	void aiTestMultipleCancelledStatesHaveSameBehaviour() {

	    CancelledBookingState first =
	            new CancelledBookingState();

	    CancelledBookingState second =
	            new CancelledBookingState();


	    assertEquals(
	            first.getName(),
	            second.getName()
	    );
	}



	@Test
	void aiTestCancelledStateObjectCreation() {

	    CancelledBookingState state =
	            new CancelledBookingState();


	    assertNotNull(state);
	}



	@Test
	void aiTestCancelledStateIsIndependentFromOtherContexts() {

	    BookingContext cancelledContext =
	            new BookingContext(new Reservation());

	    BookingContext pendingContext =
	            new BookingContext(new Reservation());


	    cancelledContext.setState(
	            new CancelledBookingState()
	    );


	    cancelledContext.request();


	    assertEquals(
	            "Cancelled",
	            cancelledContext.getStatus()
	    );


	    assertEquals(
	            "Pending",
	            pendingContext.getStatus()
	    );
	}
}
