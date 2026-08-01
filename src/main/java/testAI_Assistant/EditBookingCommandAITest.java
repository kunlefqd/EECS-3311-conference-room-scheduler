package testAI_Assistant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.time.LocalDateTime;

import com.conferenceroomscheduler.model.PaymentMethod;
import com.conferenceroomscheduler.model.Reservation;
import com.conferenceroomscheduler.patterns.EditBookingCommand;
import com.conferenceroomscheduler.service.RoomSchedulerService;

public class EditBookingCommandAITest {

    @Test
    public void should_UpdateStartAndEndTime() {
        RoomSchedulerService service = new RoomSchedulerService();
        service.createRoom("AIROOM5", "AI Room 5", 10, "Main", "1");
        Reservation reservation = new Reservation("AIRES5", "AIROOM5", "USER1", "Meeting",
                LocalDateTime.now().plusHours(1), LocalDateTime.now().plusHours(2),
                "student", 20.0, 20.0, 20.0, PaymentMethod.CREDIT_CARD);

        LocalDateTime newStart = LocalDateTime.now().plusHours(3);
        LocalDateTime newEnd = LocalDateTime.now().plusHours(4);
        new EditBookingCommand(service, reservation, newStart, newEnd).execute();

        assertEquals(newStart, reservation.getStartTime());
    }

    @Test
    public void should_RejectEditOnCancelledReservation() {
        RoomSchedulerService service = new RoomSchedulerService();
        service.createRoom("AIROOM6", "AI Room 6", 10, "Main", "1");
        Reservation reservation = new Reservation("AIRES6", "AIROOM6", "USER1", "Meeting",
                LocalDateTime.now().plusHours(1), LocalDateTime.now().plusHours(2),
                "student", 20.0, 20.0, 20.0, PaymentMethod.CREDIT_CARD);
        reservation.setCanceled(true);

        EditBookingCommand command = new EditBookingCommand(service, reservation,
                LocalDateTime.now().plusHours(3), LocalDateTime.now().plusHours(4));
        command.execute();

        assertFalse(command.wasSuccessful());
    }
}