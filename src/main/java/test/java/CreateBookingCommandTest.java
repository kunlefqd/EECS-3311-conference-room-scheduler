package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.List;

import com.conferenceroomscheduler.model.PaymentMethod;
import com.conferenceroomscheduler.model.Reservation;
import com.conferenceroomscheduler.patterns.CreateBookingCommand;
import com.conferenceroomscheduler.service.RoomSchedulerService;

public class CreateBookingCommandTest {

    @Test
    public void testExecuteAddsReservationWhenRoomIsOperational() {
        RoomSchedulerService service = new RoomSchedulerService();
        service.createRoom("TESTROOM1", "Test Room 1", 10, "Main", "101");
        Reservation reservation = new Reservation("TESTRES1", "TESTROOM1", "TESTUSER1", "Meeting",
                LocalDateTime.now().plusHours(1), LocalDateTime.now().plusHours(2),
                "student", 0, 0, 0, PaymentMethod.CREDIT_CARD);

        new CreateBookingCommand(service, reservation).execute();

        List<Reservation> results = service.getReservationsForAccount("TESTUSER1");
        assertTrue(results.stream().anyMatch(r -> r.getReservationId().equals("TESTRES1")));
    }

    @Test
    public void testExecuteDoesNothingWhenRoomDoesNotExist() {
        RoomSchedulerService service = new RoomSchedulerService();
        Reservation reservation = new Reservation("TESTRES2", "NONEXISTENT_ROOM", "TESTUSER2", "Meeting",
                LocalDateTime.now().plusHours(1), LocalDateTime.now().plusHours(2),
                "student", 0, 0, 0, PaymentMethod.CREDIT_CARD);

        new CreateBookingCommand(service, reservation).execute();

        List<Reservation> results = service.getReservationsForAccount("TESTUSER2");
        assertFalse(results.stream().anyMatch(r -> r.getReservationId().equals("TESTRES2")));
    }

    @Test
    public void testExecuteSetsHourlyRateWhenNotProvided() {
        RoomSchedulerService service = new RoomSchedulerService();
        service.createRoom("TESTROOM3", "Test Room 3", 10, "Main", "103");
        Reservation reservation = new Reservation("TESTRES3", "TESTROOM3", "TESTUSER3", "Meeting",
                LocalDateTime.now().plusHours(1), LocalDateTime.now().plusHours(2),
                "student", 0, 0, 0, PaymentMethod.CREDIT_CARD);

        new CreateBookingCommand(service, reservation).execute();

        assertEquals(20.0, reservation.getHourlyRate(), 0.001);
    }

    @Test
    public void testExecuteKeepsProvidedHourlyRateWhenPositive() {
        RoomSchedulerService service = new RoomSchedulerService();
        service.createRoom("TESTROOM4", "Test Room 4", 10, "Main", "104");
        Reservation reservation = new Reservation("TESTRES4", "TESTROOM4", "TESTUSER4", "Meeting",
                LocalDateTime.now().plusHours(1), LocalDateTime.now().plusHours(2),
                "student", 99.0, 0, 0, PaymentMethod.CREDIT_CARD);

        new CreateBookingCommand(service, reservation).execute();

        assertEquals(99.0, reservation.getHourlyRate(), 0.001);
    }

    @Test
    public void testExecuteSetsDepositAmountWhenNotProvided() {
        RoomSchedulerService service = new RoomSchedulerService();
        service.createRoom("TESTROOM5", "Test Room 5", 10, "Main", "105");
        Reservation reservation = new Reservation("TESTRES5", "TESTROOM5", "TESTUSER5", "Meeting",
                LocalDateTime.now().plusHours(1), LocalDateTime.now().plusHours(2),
                "faculty", 0, 0, 0, PaymentMethod.DEBIT_CARD);

        new CreateBookingCommand(service, reservation).execute();

        assertEquals(30.0, reservation.getDepositAmount(), 0.001);
    }

    @Test
    public void testExecuteCalculatesFinalAmountForOneHourBooking() {
        RoomSchedulerService service = new RoomSchedulerService();
        service.createRoom("TESTROOM6", "Test Room 6", 10, "Main", "106");
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        Reservation reservation = new Reservation("TESTRES6", "TESTROOM6", "TESTUSER6", "Meeting",
                start, start.plusHours(1), "student", 0, 0, 0, PaymentMethod.CREDIT_CARD);

        new CreateBookingCommand(service, reservation).execute();

        assertEquals(20.0, reservation.getFinalAmount(), 0.001);
    }

    @Test
    public void testExecuteCalculatesFinalAmountForTwoHourBooking() {
        RoomSchedulerService service = new RoomSchedulerService();
        service.createRoom("TESTROOM7", "Test Room 7", 10, "Main", "107");
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        Reservation reservation = new Reservation("TESTRES7", "TESTROOM7", "TESTUSER7", "Meeting",
                start, start.plusHours(2), "student", 0, 0, 0, PaymentMethod.CREDIT_CARD);

        new CreateBookingCommand(service, reservation).execute();

        assertEquals(40.0, reservation.getFinalAmount(), 0.001);
    }

    @Test
    public void testExecuteEnforcesMinimumOneHourDuration() {
        RoomSchedulerService service = new RoomSchedulerService();
        service.createRoom("TESTROOM8", "Test Room 8", 10, "Main", "108");
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        Reservation reservation = new Reservation("TESTRES8", "TESTROOM8", "TESTUSER8", "Meeting",
                start, start.plusMinutes(30), "student", 0, 0, 0, PaymentMethod.CREDIT_CARD);

        new CreateBookingCommand(service, reservation).execute();

        assertEquals(20.0, reservation.getFinalAmount(), 0.001);
    }

    @Test
    public void testExecuteWithNullReservationDoesNotThrow() {
        RoomSchedulerService service = new RoomSchedulerService();
        new CreateBookingCommand(service, null).execute();
    }

    @Test
    public void testExecuteAddsCorrectReservationDetails() {
        RoomSchedulerService service = new RoomSchedulerService();
        service.createRoom("TESTROOM10", "Test Room 10", 10, "Main", "110");
        Reservation reservation = new Reservation("TESTRES10", "TESTROOM10", "TESTUSER10", "Budget Review",
                LocalDateTime.now().plusHours(1), LocalDateTime.now().plusHours(2),
                "staff", 0, 0, 0, PaymentMethod.INSTITUTIONAL_BILLING);

        new CreateBookingCommand(service, reservation).execute();

        List<Reservation> results = service.getReservationsForAccount("TESTUSER10");
        Reservation saved = results.stream()
                .filter(r -> r.getReservationId().equals("TESTRES10"))
                .findFirst()
                .orElse(null);
        assertTrue(saved != null && "Budget Review".equals(saved.getTitle()));
    }
}