package test.java;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.time.LocalDateTime;

import com.conferenceroomscheduler.model.PaymentMethod;
import com.conferenceroomscheduler.model.Reservation;
import com.conferenceroomscheduler.patterns.CancelBookingCommand;
import com.conferenceroomscheduler.service.RoomSchedulerService;

public class CancelBookingCommandTest {

    private Reservation buildFutureReservation(String id) {
        return new Reservation(id, "ROOM1", "USER1", "Meeting",
                LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(3),
                "student", 20.0, 20.0, 20.0, PaymentMethod.CREDIT_CARD);
    }

    private Reservation buildPastReservation(String id) {
        return new Reservation(id, "ROOM1", "USER1", "Meeting",
                LocalDateTime.now().minusHours(3), LocalDateTime.now().minusHours(2),
                "student", 20.0, 20.0, 20.0, PaymentMethod.CREDIT_CARD);
    }

    @Test
    public void testExecuteCancelsFutureBooking() {
        RoomSchedulerService service = new RoomSchedulerService();
        Reservation reservation = buildFutureReservation("CANCEL1");

        new CancelBookingCommand(service, reservation).execute();

        assertTrue(reservation.isCanceled());
    }

    @Test
    public void testExecuteReturnsTrueOnSuccess() {
        RoomSchedulerService service = new RoomSchedulerService();
        Reservation reservation = buildFutureReservation("CANCEL2");

        CancelBookingCommand command = new CancelBookingCommand(service, reservation);
        command.execute();

        assertTrue(command.wasSuccessful());
    }

    @Test
    public void testExecuteFailsWhenAlreadyCanceled() {
        RoomSchedulerService service = new RoomSchedulerService();
        Reservation reservation = buildFutureReservation("CANCEL3");
        reservation.setCanceled(true);

        CancelBookingCommand command = new CancelBookingCommand(service, reservation);
        command.execute();

        assertFalse(command.wasSuccessful());
    }

    @Test
    public void testExecuteFailsWhenPastStartTime() {
        RoomSchedulerService service = new RoomSchedulerService();
        Reservation reservation = buildPastReservation("CANCEL4");

        CancelBookingCommand command = new CancelBookingCommand(service, reservation);
        command.execute();

        assertFalse(command.wasSuccessful());
    }

    @Test
    public void testExecutePastBookingRemainsUncanceled() {
        RoomSchedulerService service = new RoomSchedulerService();
        Reservation reservation = buildPastReservation("CANCEL5");

        new CancelBookingCommand(service, reservation).execute();

        assertFalse(reservation.isCanceled());
    }

    @Test
    public void testExecuteAlreadyCanceledStaysCanceled() {
        RoomSchedulerService service = new RoomSchedulerService();
        Reservation reservation = buildFutureReservation("CANCEL6");
        reservation.setCanceled(true);

        new CancelBookingCommand(service, reservation).execute();

        assertTrue(reservation.isCanceled());
    }

    @Test
    public void testWasSuccessfulDefaultsFalseBeforeExecute() {
        RoomSchedulerService service = new RoomSchedulerService();
        Reservation reservation = buildFutureReservation("CANCEL7");

        CancelBookingCommand command = new CancelBookingCommand(service, reservation);

        assertFalse(command.wasSuccessful());
    }

    @Test
    public void testExecuteDoesNotModifyRoomId() {
        RoomSchedulerService service = new RoomSchedulerService();
        Reservation reservation = buildFutureReservation("CANCEL8");

        new CancelBookingCommand(service, reservation).execute();

        assertTrue("ROOM1".equals(reservation.getRoomId()));
    }

    @Test
    public void testExecuteDoesNotModifyUserId() {
        RoomSchedulerService service = new RoomSchedulerService();
        Reservation reservation = buildFutureReservation("CANCEL9");

        new CancelBookingCommand(service, reservation).execute();

        assertTrue("USER1".equals(reservation.getUserId()));
    }

    @Test
    public void testExecuteCancelsBookingFarInFuture() {
        RoomSchedulerService service = new RoomSchedulerService();
        Reservation reservation = new Reservation("CANCEL10", "ROOM1", "USER1", "Meeting",
                LocalDateTime.now().plusDays(30), LocalDateTime.now().plusDays(30).plusHours(1),
                "faculty", 30.0, 30.0, 30.0, PaymentMethod.DEBIT_CARD);

        CancelBookingCommand command = new CancelBookingCommand(service, reservation);
        command.execute();

        assertTrue(command.wasSuccessful() && reservation.isCanceled());
    }
}