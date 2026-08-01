package testAI_Assistant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import java.time.LocalDateTime;

import com.conferenceroomscheduler.model.PaymentMethod;
import com.conferenceroomscheduler.model.Reservation;

public class ReservationAITest {

    @Test
    public void should_AllowNegativeHourlyRateWithoutValidation() {
        Reservation reservation = new Reservation();
        reservation.setHourlyRate(-10.0);
        assertEquals(-10.0, reservation.getHourlyRate(), 0.001);
    }

    @Test
    public void should_AllowNullTitleOnDefaultConstructor() {
        Reservation reservation = new Reservation();
        assertNull(reservation.getTitle());
    }

    @Test
    public void should_AllowEndTimeBeforeStartTimeWithoutValidation() {
        Reservation reservation = new Reservation();
        LocalDateTime start = LocalDateTime.now();
        reservation.setStartTime(start);
        reservation.setEndTime(start.minusHours(1));
        assertFalse(reservation.getEndTime().isAfter(reservation.getStartTime()));
    }

    @Test
    public void should_OverwritePaymentMethodWhenSetTwice() {
        Reservation reservation = new Reservation();
        reservation.setPaymentMethod(PaymentMethod.CREDIT_CARD);
        reservation.setPaymentMethod(PaymentMethod.DEBIT_CARD);
        assertEquals(PaymentMethod.DEBIT_CARD, reservation.getPaymentMethod());
    }

    @Test
    public void should_KeepIndependentBooleanFlags() {
        Reservation reservation = new Reservation();
        reservation.setCanceled(true);
        reservation.setCheckedIn(false);
        assertFalse(reservation.isCheckedIn());
    }
}