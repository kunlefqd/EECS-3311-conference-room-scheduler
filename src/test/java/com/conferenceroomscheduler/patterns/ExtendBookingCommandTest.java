package com.conferenceroomscheduler.patterns;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.time.LocalDateTime;

import com.conferenceroomscheduler.model.PaymentMethod;
import com.conferenceroomscheduler.model.Reservation;
import com.conferenceroomscheduler.patterns.ExtendBookingCommand;
import com.conferenceroomscheduler.service.RoomSchedulerService;

public class ExtendBookingCommandTest {

    private String uniqueRoomId() {
        return "EXTENDROOM" + System.nanoTime();
    }

    private String uniqueReservationId() {
        return "EXTENDRES" + System.nanoTime();
    }

    private Reservation buildReservationWithRoom(RoomSchedulerService service,
                                                  LocalDateTime start, LocalDateTime end,
                                                  double hourlyRate) {
        String roomId = uniqueRoomId();
        service.createRoom(roomId, "Room " + roomId, 10, "Main", "1");
        return new Reservation(uniqueReservationId(), roomId, "USER1", "Meeting",
                start, end, "student", hourlyRate, hourlyRate, hourlyRate, PaymentMethod.CREDIT_CARD);
    }

    @Test
    public void testExecuteExtendsEndTimeForward() {
        RoomSchedulerService service = new RoomSchedulerService();
        Reservation reservation = buildReservationWithRoom(service,
                LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(3), 20.0);
        LocalDateTime newEnd = LocalDateTime.now().plusHours(5);

        new ExtendBookingCommand(service, reservation, newEnd).execute();

        assertEquals(newEnd, reservation.getEndTime());
    }

    @Test
    public void testExecuteSetsExtendedFlagTrue() {
        RoomSchedulerService service = new RoomSchedulerService();
        Reservation reservation = buildReservationWithRoom(service,
                LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(3), 20.0);

        new ExtendBookingCommand(service, reservation, LocalDateTime.now().plusHours(5)).execute();

        assertTrue(reservation.isExtended());
    }

    @Test
    public void testExecuteReturnsTrueOnSuccess() {
        RoomSchedulerService service = new RoomSchedulerService();
        Reservation reservation = buildReservationWithRoom(service,
                LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(3), 20.0);

        ExtendBookingCommand command = new ExtendBookingCommand(service, reservation,
                LocalDateTime.now().plusHours(5));
        command.execute();

        assertTrue(command.wasSuccessful());
    }

    @Test
    public void testExecuteFailsWhenAlreadyCanceled() {
        RoomSchedulerService service = new RoomSchedulerService();
        Reservation reservation = buildReservationWithRoom(service,
                LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(3), 20.0);
        reservation.setCanceled(true);

        ExtendBookingCommand command = new ExtendBookingCommand(service, reservation,
                LocalDateTime.now().plusHours(5));
        command.execute();

        assertFalse(command.wasSuccessful());
    }

    @Test
    public void testExecuteFailsWhenNewEndTimeIsEarlier() {
        RoomSchedulerService service = new RoomSchedulerService();
        LocalDateTime start = LocalDateTime.now().plusHours(2);
        LocalDateTime end = LocalDateTime.now().plusHours(3);
        Reservation reservation = buildReservationWithRoom(service, start, end, 20.0);

        ExtendBookingCommand command = new ExtendBookingCommand(service, reservation,
                end.minusMinutes(30));
        command.execute();

        assertFalse(command.wasSuccessful());
    }

    @Test
    public void testExecuteFailsWhenNewEndTimeEqualsCurrentEndTime() {
        RoomSchedulerService service = new RoomSchedulerService();
        LocalDateTime start = LocalDateTime.now().plusHours(2);
        LocalDateTime end = LocalDateTime.now().plusHours(3);
        Reservation reservation = buildReservationWithRoom(service, start, end, 20.0);

        ExtendBookingCommand command = new ExtendBookingCommand(service, reservation, end);
        command.execute();

        assertFalse(command.wasSuccessful());
    }

    @Test
    public void testExecuteKeepsOriginalEndTimeWhenRejected() {
        RoomSchedulerService service = new RoomSchedulerService();
        LocalDateTime start = LocalDateTime.now().plusHours(2);
        LocalDateTime originalEnd = LocalDateTime.now().plusHours(3);
        Reservation reservation = buildReservationWithRoom(service, start, originalEnd, 20.0);
        reservation.setCanceled(true);

        new ExtendBookingCommand(service, reservation, originalEnd.plusHours(2)).execute();

        assertEquals(originalEnd, reservation.getEndTime());
    }

    @Test
    public void testExecuteRecalculatesFinalAmountAfterExtension() {
        RoomSchedulerService service = new RoomSchedulerService();
        LocalDateTime start = LocalDateTime.now().plusHours(2);
        Reservation reservation = buildReservationWithRoom(service, start, start.plusHours(1), 20.0);

        new ExtendBookingCommand(service, reservation, start.plusHours(3)).execute();

        assertEquals(60.0, reservation.getFinalAmount(), 0.001);
    }

    @Test
    public void testWasSuccessfulDefaultsFalseBeforeExecute() {
        RoomSchedulerService service = new RoomSchedulerService();
        Reservation reservation = buildReservationWithRoom(service,
                LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(3), 20.0);

        ExtendBookingCommand command = new ExtendBookingCommand(service, reservation,
                LocalDateTime.now().plusHours(5));

        assertFalse(command.wasSuccessful());
    }

    @Test
    public void testExecuteDoesNotModifyStartTime() {
        RoomSchedulerService service = new RoomSchedulerService();
        LocalDateTime start = LocalDateTime.now().plusHours(2);
        Reservation reservation = buildReservationWithRoom(service, start, start.plusHours(1), 20.0);

        new ExtendBookingCommand(service, reservation, start.plusHours(4)).execute();

        assertEquals(start, reservation.getStartTime());
    }
}