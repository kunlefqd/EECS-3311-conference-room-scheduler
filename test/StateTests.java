import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.conferenceroomscheduler.model.Reservation;
import com.conferenceroomscheduler.patterns.BookingContext;
import com.conferenceroomscheduler.patterns.CancelledBookingState;
import com.conferenceroomscheduler.patterns.CheckedInBookingState;
import com.conferenceroomscheduler.patterns.CompletedBookingState;
import com.conferenceroomscheduler.patterns.ConfirmedBookingState;
import com.conferenceroomscheduler.patterns.PendingBookingState;

public class StateTests {


    // ============================================================
    // BookingContext Tests
    // Tests for: BookingContext.java
    // ============================================================
	
    @Test
    void testConstructorSetsPendingState() {
        Reservation reservation = new Reservation();
        BookingContext context = new BookingContext(reservation);

        assertTrue(context.getState() instanceof PendingBookingState);
        assertEquals("Pending", context.getStatus());
    }

    @Test
    void testConstructorStoresReservation() {
        Reservation reservation = new Reservation();
        BookingContext context = new BookingContext(reservation);

        assertSame(reservation, context.getReservation());
    }

    @Test
    void testSetStateConfirmed() {
        BookingContext context = new BookingContext(new Reservation());

        context.setState(new ConfirmedBookingState());

        assertTrue(context.getState() instanceof ConfirmedBookingState);
    }

    @Test
    void testSetStateCheckedIn() {
        BookingContext context = new BookingContext(new Reservation());

        context.setState(new CheckedInBookingState());

        assertTrue(context.getState() instanceof CheckedInBookingState);
    }

    @Test
    void testSetStateCompleted() {
        BookingContext context = new BookingContext(new Reservation());

        context.setState(new CompletedBookingState());

        assertTrue(context.getState() instanceof CompletedBookingState);
    }

    @Test
    void testSetStateCancelled() {
        BookingContext context = new BookingContext(new Reservation());

        context.setState(new CancelledBookingState());

        assertTrue(context.getState() instanceof CancelledBookingState);
    }

    @Test
    void testPendingRequestWithoutDepositStaysPending() {
        Reservation reservation = new Reservation();
        reservation.setDepositAmount(0);

        BookingContext context = new BookingContext(reservation);

        context.request();

        assertTrue(context.getState() instanceof PendingBookingState);
        assertEquals("Pending", context.getStatus());
    }

    @Test
    void testPendingRequestWithDepositBecomesConfirmed() {
        Reservation reservation = new Reservation();
        reservation.setDepositAmount(100);

        BookingContext context = new BookingContext(reservation);

        context.request();

        assertTrue(context.getState() instanceof ConfirmedBookingState);
        assertEquals("Booking confirmed.", context.getStatus());
    }

    @Test
    void testConfirmedRequestBecomesCheckedIn() {
        BookingContext context = new BookingContext(new Reservation());

        context.setState(new ConfirmedBookingState());

        context.request();

        assertTrue(context.getState() instanceof CheckedInBookingState);
        assertEquals("Checked in.", context.getStatus());
    }

    @Test
    void testCheckedInRequestBecomesCompleted() {
        BookingContext context = new BookingContext(new Reservation());

        context.setState(new CheckedInBookingState());

        context.request();

        assertTrue(context.getState() instanceof CompletedBookingState);
        assertEquals("Booking complete", context.getStatus());
    }

    @Test
    void testCompletedRequestRemainsCompleted() {
        BookingContext context = new BookingContext(new Reservation());

        context.setState(new CompletedBookingState());

        context.request();

        assertTrue(context.getState() instanceof CompletedBookingState);
    }

    @Test
    void testCancelledRequestRemainsCancelled() {
        BookingContext context = new BookingContext(new Reservation());

        context.setState(new CancelledBookingState());

        context.request();

        assertTrue(context.getState() instanceof CancelledBookingState);
        assertEquals("Cancelled", context.getStatus());
    }
    
    // ============================================================
    // PendingBooking Tests
    // Tests for: PendingBookingState.java
    // ============================================================
	
    @Test
    void testGetNameReturnsPending() {
        PendingBookingState state = new PendingBookingState();

        assertEquals("Pending", state.getName());
    }


    @Test
    void testHandleWithPositiveDepositChangesToConfirmed() {
        Reservation reservation = new Reservation();
        reservation.setDepositAmount(100);

        BookingContext context = new BookingContext(reservation);

        PendingBookingState state = new PendingBookingState();

        state.handle(context);

        assertTrue(context.getState() instanceof ConfirmedBookingState);
    }


    @Test
    void testHandleWithSmallPositiveDepositChangesToConfirmed() {
        Reservation reservation = new Reservation();
        reservation.setDepositAmount(0.01);

        BookingContext context = new BookingContext(reservation);

        PendingBookingState state = new PendingBookingState();

        state.handle(context);

        assertTrue(context.getState() instanceof ConfirmedBookingState);
    }


    @Test
    void testHandleWithZeroDepositRemainsPending() {
        Reservation reservation = new Reservation();
        reservation.setDepositAmount(0);

        BookingContext context = new BookingContext(reservation);

        PendingBookingState state = new PendingBookingState();

        state.handle(context);

        assertTrue(context.getState() instanceof PendingBookingState);
    }


    @Test
    void testHandleWithNegativeDepositRemainsPending() {
        Reservation reservation = new Reservation();
        reservation.setDepositAmount(-50);

        BookingContext context = new BookingContext(reservation);

        PendingBookingState state = new PendingBookingState();

        state.handle(context);

        assertTrue(context.getState() instanceof PendingBookingState);
    }


    @Test
    void testHandleWithLargeDepositChangesToConfirmed() {
        Reservation reservation = new Reservation();
        reservation.setDepositAmount(100000);

        BookingContext context = new BookingContext(reservation);

        PendingBookingState state = new PendingBookingState();

        state.handle(context);

        assertTrue(context.getState() instanceof ConfirmedBookingState);
    }


    @Test
    void testStateAfterMultipleHandlesWithDeposit() {
        Reservation reservation = new Reservation();
        reservation.setDepositAmount(100);

        BookingContext context = new BookingContext(reservation);

        PendingBookingState state = new PendingBookingState();

        state.handle(context);
        state.handle(context);

        assertTrue(context.getState() instanceof ConfirmedBookingState);
    }


    @Test
    void testStateDoesNotChangeWhenDepositIsZero() {
        Reservation reservation = new Reservation();
        reservation.setDepositAmount(0);

        BookingContext context = new BookingContext(reservation);

        PendingBookingState state = new PendingBookingState();

        state.handle(context);

        assertEquals("Pending", context.getStatus());
    }


    @Test
    void testHandleUsesReservationDepositAmount() {
        Reservation reservation = new Reservation();
        reservation.setDepositAmount(500);

        BookingContext context = new BookingContext(reservation);

        PendingBookingState state = new PendingBookingState();

        state.handle(context);

        assertEquals("Booking confirmed.", context.getStatus());
    }


    @Test
    void testPendingStateCanBeCreatedMultipleTimes() {
        PendingBookingState state1 = new PendingBookingState();
        PendingBookingState state2 = new PendingBookingState();

        assertNotSame(state1, state2);
        assertEquals(state1.getName(), state2.getName());
    }

    // ============================================================
    // ComfirmedBooking Tests
    // Tests for: ConfirmedBookingState.java
    // ============================================================

    @Test
    void testGetNameReturnsConfirmedMessage() {
        ConfirmedBookingState state = new ConfirmedBookingState();

        assertEquals("Booking confirmed.", state.getName());
    }

    @Test
    void testHandleChangesStateToCheckedIn() {
        BookingContext context = new BookingContext(new Reservation());

        ConfirmedBookingState state = new ConfirmedBookingState();

        state.handle(context);

        assertTrue(context.getState() instanceof CheckedInBookingState);
    }

    @Test
    void testHandleUpdatesContextStatus1() {
        BookingContext context = new BookingContext(new Reservation());

        ConfirmedBookingState state = new ConfirmedBookingState();

        state.handle(context);

        assertEquals("Checked in.", context.getStatus());
    }

    @Test
    void testHandleDoesNotRemainConfirmed() {
        BookingContext context = new BookingContext(new Reservation());

        ConfirmedBookingState state = new ConfirmedBookingState();

        state.handle(context);

        assertFalse(context.getState() instanceof ConfirmedBookingState);
    }

    @Test
    void testHandleWorksWithEmptyReservation1() {
        BookingContext context = new BookingContext(new Reservation());

        new ConfirmedBookingState().handle(context);

        assertTrue(context.getState() instanceof CheckedInBookingState);
    }

    @Test
    void testHandleWorksWithReservationHavingDeposit1() {
        Reservation reservation = new Reservation();
        reservation.setDepositAmount(200);

        BookingContext context = new BookingContext(reservation);

        new ConfirmedBookingState().handle(context);

        assertTrue(context.getState() instanceof CheckedInBookingState);
    }

    @Test
    void testMultipleConfirmedStateObjectsHaveSameName() {
        ConfirmedBookingState state1 = new ConfirmedBookingState();
        ConfirmedBookingState state2 = new ConfirmedBookingState();

        assertEquals(state1.getName(), state2.getName());
    }

    @Test
    void testConfirmedStateObjectCreation() {
        ConfirmedBookingState state = new ConfirmedBookingState();

        assertNotNull(state);
    }

    @Test
    void testContextRequestFromConfirmedMovesToCheckedIn() {
        BookingContext context = new BookingContext(new Reservation());
        context.setState(new ConfirmedBookingState());

        context.request();

        assertTrue(context.getState() instanceof CheckedInBookingState);
    }

    @Test
    void testCheckedInStatusAfterRequest() {
        BookingContext context = new BookingContext(new Reservation());
        context.setState(new ConfirmedBookingState());

        context.request();

        assertEquals("Checked in.", context.getStatus());
    }
 // ============================================================
    // CheckedInBooking Tests
    // Tests for: CheckedInBookingState.java
    // ============================================================


    @Test
    void testGetNameReturnsCheckedIn() {
        CheckedInBookingState state = new CheckedInBookingState();

        assertEquals("Checked in.", state.getName());
    }

    @Test
    void testHandleChangesStateToCompleted() {
        BookingContext context = new BookingContext(new Reservation());
        CheckedInBookingState state = new CheckedInBookingState();

        state.handle(context);

        assertTrue(context.getState() instanceof CompletedBookingState);
    }

    @Test
    void testHandleUpdatesContextStatus() {
        BookingContext context = new BookingContext(new Reservation());
        CheckedInBookingState state = new CheckedInBookingState();

        state.handle(context);

        assertEquals("Booking complete", context.getStatus());
    }

    @Test
    void testHandleDoesNotRemainCheckedIn() {
        BookingContext context = new BookingContext(new Reservation());
        CheckedInBookingState state = new CheckedInBookingState();

        state.handle(context);

        assertFalse(context.getState() instanceof CheckedInBookingState);
    }

    @Test
    void testHandleWorksWithEmptyReservation() {
        BookingContext context = new BookingContext(new Reservation());

        new CheckedInBookingState().handle(context);

        assertTrue(context.getState() instanceof CompletedBookingState);
    }

    @Test
    void testHandleWorksWithReservationHavingDeposit() {
        Reservation reservation = new Reservation();
        reservation.setDepositAmount(250);

        BookingContext context = new BookingContext(reservation);

        new CheckedInBookingState().handle(context);

        assertTrue(context.getState() instanceof CompletedBookingState);
    }

    @Test
    void testMultipleCheckedInStateObjectsHaveSameName() {
        CheckedInBookingState state1 = new CheckedInBookingState();
        CheckedInBookingState state2 = new CheckedInBookingState();

        assertEquals(state1.getName(), state2.getName());
    }

    @Test
    void testCheckedInStateObjectCreation() {
        CheckedInBookingState state = new CheckedInBookingState();

        assertNotNull(state);
    }

    @Test
    void testContextRequestFromCheckedInMovesToCompleted() {
        BookingContext context = new BookingContext(new Reservation());
        context.setState(new CheckedInBookingState());

        context.request();

        assertTrue(context.getState() instanceof CompletedBookingState);
    }

    @Test
    void testCompletedStatusAfterRequest() {
        BookingContext context = new BookingContext(new Reservation());
        context.setState(new CheckedInBookingState());

        context.request();

        assertEquals("Booking complete", context.getStatus());
    }
    
 // ============================================================
    // CompletedBooking Tests
    // Tests for: CompletedBookingState.java
    // ============================================================
    
    @Test
    void testGetNameReturnsBookingComplete() {
        CompletedBookingState state = new CompletedBookingState();

        assertEquals("Booking complete", state.getName());
    }

    @Test
    void testHandleDoesNotChangeState() {
        BookingContext context = new BookingContext(new Reservation());
        context.setState(new CompletedBookingState());

        CompletedBookingState state = new CompletedBookingState();

        state.handle(context);

        assertTrue(context.getState() instanceof CompletedBookingState);
    }

    @Test
    void testContextStatusRemainsBookingComplete() {
        BookingContext context = new BookingContext(new Reservation());
        context.setState(new CompletedBookingState());

        context.request();

        assertEquals("Booking complete", context.getStatus());
    }

    @Test
    void testHandleCanBeCalledMultipleTimes() {
        BookingContext context = new BookingContext(new Reservation());
        context.setState(new CompletedBookingState());

        CompletedBookingState state = new CompletedBookingState();

        state.handle(context);
        state.handle(context);

        assertTrue(context.getState() instanceof CompletedBookingState);
    }

    @Test
    void testCompletedStateObjectCreation() {
        CompletedBookingState state = new CompletedBookingState();

        assertNotNull(state);
    }

    @Test
    void testMultipleCompletedStatesHaveSameName() {
        CompletedBookingState state1 = new CompletedBookingState();
        CompletedBookingState state2 = new CompletedBookingState();

        assertEquals(state1.getName(), state2.getName());
    }

    @Test
    void testCompletedStateRemainsCompletedAfterRequest() {
        BookingContext context = new BookingContext(new Reservation());
        context.setState(new CompletedBookingState());

        context.request();

        assertTrue(context.getState() instanceof CompletedBookingState);
    }

    @Test
    void testCompletedStateWithReservationHavingDeposit() {
        Reservation reservation = new Reservation();
        reservation.setDepositAmount(100);

        BookingContext context = new BookingContext(reservation);
        context.setState(new CompletedBookingState());

        context.request();

        assertTrue(context.getState() instanceof CompletedBookingState);
    }

    @Test
    void testCompletedStateWithEmptyReservation() {
        BookingContext context = new BookingContext(new Reservation());
        context.setState(new CompletedBookingState());

        context.request();

        assertEquals("Booking complete", context.getStatus());
    }

    @Test
    void testCompletedStateStatusMatchesGetName() {
        CompletedBookingState state = new CompletedBookingState();

        assertEquals(state.getName(), "Booking complete");
    }
    
    // ============================================================
    // CancelledBooking Tests
    // Tests for: CancelledBookingState.java
    // ============================================================
    


        @Test
        void testGetNameReturnsCancelled() {
            CancelledBookingState state = new CancelledBookingState();

            assertEquals("Cancelled", state.getName());
        }

        @Test
        void testHandleDoesNotChangeState1() {
            BookingContext context = new BookingContext(new Reservation());
            context.setState(new CancelledBookingState());

            CancelledBookingState state = new CancelledBookingState();

            state.handle(context);

            assertTrue(context.getState() instanceof CancelledBookingState);
        }

        @Test
        void testContextStatusRemainsCancelled() {
            BookingContext context = new BookingContext(new Reservation());
            context.setState(new CancelledBookingState());

            context.request();

            assertEquals("Cancelled", context.getStatus());
        }

        @Test
        void testHandleCanBeCalledMultipleTimes1() {
            BookingContext context = new BookingContext(new Reservation());
            context.setState(new CancelledBookingState());

            CancelledBookingState state = new CancelledBookingState();

            state.handle(context);
            state.handle(context);

            assertTrue(context.getState() instanceof CancelledBookingState);
        }

        @Test
        void testCancelledStateObjectCreation() {
            CancelledBookingState state = new CancelledBookingState();

            assertNotNull(state);
        }

        @Test
        void testMultipleCancelledStatesHaveSameName() {
            CancelledBookingState state1 = new CancelledBookingState();
            CancelledBookingState state2 = new CancelledBookingState();

            assertEquals(state1.getName(), state2.getName());
        }

        @Test
        void testCancelledStateWithEmptyReservation() {
            BookingContext context = new BookingContext(new Reservation());
            context.setState(new CancelledBookingState());

            context.request();

            assertTrue(context.getState() instanceof CancelledBookingState);
        }

        @Test
        void testCancelledStateWithReservationHavingDeposit() {
            Reservation reservation = new Reservation();
            reservation.setDepositAmount(100);

            BookingContext context = new BookingContext(reservation);
            context.setState(new CancelledBookingState());

            context.request();

            assertTrue(context.getState() instanceof CancelledBookingState);
        }

        @Test
        void testCancelledStateStatusMatchesGetName() {
            CancelledBookingState state = new CancelledBookingState();

            assertEquals(state.getName(), "Cancelled");
        }

        @Test
        void testContextStateAfterRepeatedRequests() {
            BookingContext context = new BookingContext(new Reservation());
            context.setState(new CancelledBookingState());

            context.request();
            context.request();
            context.request();

            assertTrue(context.getState() instanceof CancelledBookingState);
            assertEquals("Cancelled", context.getStatus());
        }

    }




