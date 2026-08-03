package com.conferenceroomscheduler.patterns;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.time.LocalDateTime;

import com.conferenceroomscheduler.model.PaymentMethod;
import com.conferenceroomscheduler.model.Reservation;
import com.conferenceroomscheduler.patterns.EditBookingCommand;
import com.conferenceroomscheduler.service.RoomSchedulerService;

public class EditBookingCommandTest {

    private String uniqueRoomId() {
        return "EDITROOM" + System.nanoTime();
    }

    private String uniqueReservationId() {
        return "EDITRES" + System.nanoTime();
    }

    private Reservation buildReservationWithRoom(RoomSchedulerService service, String roomId,
                                                  LocalDateTime start, LocalDateTime end,
                                                  double hourlyRate) {
        service.createRoom(roomId, "Room " + roomId, 10, "Main", "1");
        return new Reservation(uniqueReservationId(), roomId, "USER1", "Meeting",
                start, end, "student", hourlyRate, hourlyRate, hourlyRate, PaymentMethod.CREDIT_CARD);
    }

    @Test
    public void testExecuteEditsFutureBooking() {
        RoomSchedulerService service = new RoomSchedulerService();
        Reservation reservation = buildReservationWithRoom(service, uniqueRoomId(),
                LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(3), 20.0);
        LocalDateTime newStart = LocalDateTime.now().plusHours(4);
        LocalDateTime newEnd = LocalDateTime.now().plusHours(5);

        new EditBookingCommand(service, reservation, newStart, newEnd).execute();

        assertEquals(newStart, reservation.getStartTime());
        assertEquals(newEnd, reservation.getEndTime());
    }

    @Test
    public void testExecuteReturnsTrueOnSuccess() {
        RoomSchedulerService service = new RoomSchedulerService();
        Reservation reservation = buildReservationWithRoom(service, uniqueRoomId(),
                LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(3), 20.0);

        EditBookingCommand command = new EditBookingCommand(service, reservation,
                LocalDateTime.now().plusHours(4), LocalDateTime.now().plusHours(5));
        command.execute();

        assertTrue(command.wasSuccessful());
    }

    @Test
    public void testExecuteFailsWhenAlreadyCanceled() {
        RoomSchedulerService service = new RoomSchedulerService();
        Reservation reservation = buildReservationWithRoom(service, uniqueRoomId(),
                LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(3), 20.0);
        reservation.setCanceled(true);

        EditBookingCommand command = new EditBookingCommand(service, reservation,
                LocalDateTime.now().plusHours(4), LocalDateTime.now().plusHours(5));
        command.execute();

        assertFalse(command.wasSuccessful());
    }

    @Test
    public void testExecuteFailsWhenPastStartTime() {
        RoomSchedulerService service = new RoomSchedulerService();
        Reservation reservation = buildReservationWithRoom(service, uniqueRoomId(),
                LocalDateTime.now().minusHours(3), LocalDateTime.now().minusHours(2), 20.0);

        EditBookingCommand command = new EditBookingCommand(service, reservation,
                LocalDateTime.now().plusHours(4), LocalDateTime.now().plusHours(5));
        command.execute();

        assertFalse(command.wasSuccessful());
    }

    @Test
    public void testExecuteKeepsOriginalTimesWhenCanceled() {
        RoomSchedulerService service = new RoomSchedulerService();
        LocalDateTime originalStart = LocalDateTime.now().plusHours(2);
        LocalDateTime originalEnd = LocalDateTime.now().plusHours(3);
        Reservation reservation = buildReservationWithRoom(service, uniqueRoomId(),
                originalStart, originalEnd, 20.0);
        reservation.setCanceled(true);

        new EditBookingCommand(service, reservation,
                LocalDateTime.now().plusHours(4), LocalDateTime.now().plusHours(5)).execute();

        assertEquals(originalStart, reservation.getStartTime());
        assertEquals(originalEnd, reservation.getEndTime());
    }

    @Test
    public void testExecuteRecalculatesFinalAmountAfterExtendingDuration() {
        RoomSchedulerService service = new RoomSchedulerService();
        LocalDateTime start = LocalDateTime.now().plusHours(2);
        Reservation reservation = buildReservationWithRoom(service, uniqueRoomId(),
                start, start.plusHours(1), 20.0);

        LocalDateTime newStart = LocalDateTime.now().plusHours(4);
        LocalDateTime newEnd = newStart.plusHours(2);
        new EditBookingCommand(service, reservation, newStart, newEnd).execute();

        assertEquals(40.0, reservation.getFinalAmount(), 0.001);
    }

    @Test
    public void testExecuteFinalAmountSubtractsDepositWhenCheckedInAndNotLost() {
        RoomSchedulerService service = new RoomSchedulerService();
        LocalDateTime start = LocalDateTime.now().plusHours(2);
        Reservation reservation = buildReservationWithRoom(service, uniqueRoomId(),
                start, start.plusHours(1), 20.0);
        reservation.setCheckedIn(true);
        reservation.setDepositLost(false);

        LocalDateTime newStart = LocalDateTime.now().plusHours(4);
        LocalDateTime newEnd = newStart.plusHours(2);
        new EditBookingCommand(service, reservation, newStart, newEnd).execute();

        assertEquals(20.0, reservation.getFinalAmount(), 0.001);
    }

    @Test
    public void testExecuteFinalAmountKeepsFullChargeWhenDepositLost() {
        RoomSchedulerService service = new RoomSchedulerService();
        LocalDateTime start = LocalDateTime.now().plusHours(2);
        Reservation reservation = buildReservationWithRoom(service, uniqueRoomId(),
                start, start.plusHours(1), 20.0);
        reservation.setCheckedIn(true);
        reservation.setDepositLost(true);

        LocalDateTime newStart = LocalDateTime.now().plusHours(4);
        LocalDateTime newEnd = newStart.plusHours(2);
        new EditBookingCommand(service, reservation, newStart, newEnd).execute();

        assertEquals(40.0, reservation.getFinalAmount(), 0.001);
    }

    @Test
    public void testWasSuccessfulDefaultsFalseBeforeExecute() {
        RoomSchedulerService service = new RoomSchedulerService();
        Reservation reservation = buildReservationWithRoom(service, uniqueRoomId(),
                LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(3), 20.0);

        EditBookingCommand command = new EditBookingCommand(service, reservation,
                LocalDateTime.now().plusHours(4), LocalDateTime.now().plusHours(5));

        assertFalse(command.wasSuccessful());
    }

    @Test
    public void testExecuteChangesBothStartAndEndTimeTogether() {
        RoomSchedulerService service = new RoomSchedulerService();
        Reservation reservation = buildReservationWithRoom(service, uniqueRoomId(),
                LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(3), 30.0);
        LocalDateTime newStart = LocalDateTime.now().plusDays(1);
        LocalDateTime newEnd = newStart.plusHours(1);

        new EditBookingCommand(service, reservation, newStart, newEnd).execute();

        assertEquals(newStart, reservation.getStartTime());
        assertEquals(newEnd, reservation.getEndTime());
    }
}