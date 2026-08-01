package testAI_Assistant;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.time.LocalDateTime;

import com.conferenceroomscheduler.model.PaymentMethod;
import com.conferenceroomscheduler.model.Reservation;
import com.conferenceroomscheduler.patterns.CancelBookingCommand;
import com.conferenceroomscheduler.service.RoomSchedulerService;

public class CancelBookingCommandAITest {

    @Test
    public void should_CancelFutureReservation() {
        RoomSchedulerService service = new RoomSchedulerService();
        Reservation reservation = new Reservation("AIRES3", "AIROOM3", "USER1", "Meeting",
                LocalDateTime.now().plusHours(1), LocalDateTime.now().plusHours(2),
                "student", 20.0, 20.0, 20.0, PaymentMethod.CREDIT_CARD);

        new CancelBookingCommand(service, reservation).execute();

        assertTrue(reservation.isCanceled());
    }

    @Test
    public void should_NotCancelPastReservation() {
        RoomSchedulerService service = new RoomSchedulerService();
        Reservation reservation = new Reservation("AIRES4", "AIROOM4", "USER1", "Meeting",
                LocalDateTime.now().minusHours(1), LocalDateTime.now().plusHours(1),
                "student", 20.0, 20.0, 20.0, PaymentMethod.CREDIT_CARD);

        new CancelBookingCommand(service, reservation).execute();

        assertFalse(reservation.isCanceled());
    }
}