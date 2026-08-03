package testAI_Assistant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.List;

import com.conferenceroomscheduler.model.PaymentMethod;
import com.conferenceroomscheduler.model.Reservation;
import com.conferenceroomscheduler.patterns.CreateBookingCommand;
import com.conferenceroomscheduler.service.RoomSchedulerService;

public class CreateBookingCommandAITest {

    @Test
    public void should_AddReservationWhenRoomExists() {
        RoomSchedulerService service = new RoomSchedulerService();
        service.createRoom("AIROOM1", "AI Room 1", 10, "Main", "1");
        Reservation reservation = new Reservation("AIRES1", "AIROOM1", "USER1", "Meeting",
                LocalDateTime.now().plusHours(1), LocalDateTime.now().plusHours(2),
                "student", 20.0, 20.0, 20.0, PaymentMethod.CREDIT_CARD);

        new CreateBookingCommand(service, reservation).execute();

        List<Reservation> results = service.getReservationsForAccount("USER1");
        assertTrue(results.stream().anyMatch(r -> r.getReservationId().equals("AIRES1")));
    }

    @Test
    public void should_UseDefaultHourlyRateWhenZeroProvided() {
        RoomSchedulerService service = new RoomSchedulerService();
        service.createRoom("AIROOM2", "AI Room 2", 10, "Main", "1");
        Reservation reservation = new Reservation("AIRES2", "AIROOM2", "USER2", "Meeting",
                LocalDateTime.now().plusHours(1), LocalDateTime.now().plusHours(2),
                "faculty", 0, 0, 0, PaymentMethod.DEBIT_CARD);

        new CreateBookingCommand(service, reservation).execute();

        assertEquals(30.0, reservation.getHourlyRate(), 0.001);
    }
}