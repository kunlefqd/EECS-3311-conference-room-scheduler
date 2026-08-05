package testAI_Assistant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import java.time.LocalDateTime;

import com.conferenceroomscheduler.model.PaymentMethod;
import com.conferenceroomscheduler.model.Reservation;
import com.conferenceroomscheduler.patterns.ExtendBookingCommand;
import com.conferenceroomscheduler.service.RoomSchedulerService;

public class ExtendBookingCommandAITest {

    @Test
    public void should_ExtendEndTime() {
        RoomSchedulerService service = new RoomSchedulerService();
        service.createRoom("AIROOM7", "AI Room 7", 10, "Main", "1");
        Reservation reservation = new Reservation("AIRES7", "AIROOM7", "USER1", "Meeting",
                LocalDateTime.now().plusHours(1), LocalDateTime.now().plusHours(2),
                "student", 20.0, 20.0, 20.0, PaymentMethod.CREDIT_CARD);

        LocalDateTime newEnd = LocalDateTime.now().plusHours(3);
        new ExtendBookingCommand(service, reservation, newEnd).execute();

        assertEquals(newEnd, reservation.getEndTime());
    }

    @Test
    public void should_RejectExtensionToEarlierTime() {
        RoomSchedulerService service = new RoomSchedulerService();
        service.createRoom("AIROOM8", "AI Room 8", 10, "Main", "1");
        Reservation reservation = new Reservation("AIRES8", "AIROOM8", "USER1", "Meeting",
                LocalDateTime.now().plusHours(1), LocalDateTime.now().plusHours(2),
                "student", 20.0, 20.0, 20.0, PaymentMethod.CREDIT_CARD);

        ExtendBookingCommand command = new ExtendBookingCommand(service, reservation,
                LocalDateTime.now().plusMinutes(30));
        command.execute();

        assertFalse(command.wasSuccessful());
    }
}