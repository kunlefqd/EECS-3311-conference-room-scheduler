package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.time.LocalDateTime;

import com.conferenceroomscheduler.model.PaymentMethod;
import com.conferenceroomscheduler.model.Reservation;

public class ReservationTest {

    @Test
    public void testDefaultConstructorCreatesEmptyObject() {
        Reservation reservation = new Reservation();
        assertNull(reservation.getReservationId());
        assertFalse(reservation.isCanceled());
    }

    @Test
    public void testFullConstructorSetsAllFields() {
        LocalDateTime start = LocalDateTime.of(2026, 8, 1, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 8, 1, 11, 0);
        Reservation reservation = new Reservation("RES1", "R100", "ACC1", "Meeting",
                start, end, "student", 20.0, 20.0, 20.0, PaymentMethod.CREDIT_CARD);
        assertEquals("RES1", reservation.getReservationId());
        assertEquals("R100", reservation.getRoomId());
        assertEquals("ACC1", reservation.getUserId());
        assertEquals("Meeting", reservation.getTitle());
        assertEquals(start, reservation.getStartTime());
        assertEquals(end, reservation.getEndTime());
        assertEquals("student", reservation.getAccountType());
        assertEquals(20.0, reservation.getHourlyRate(), 0.001);
        assertEquals(20.0, reservation.getDepositAmount(), 0.001);
        assertEquals(20.0, reservation.getFinalAmount(), 0.001);
        assertEquals(PaymentMethod.CREDIT_CARD, reservation.getPaymentMethod());
    }

    @Test
    public void testDefaultBooleanFlagsAreFalse() {
        Reservation reservation = new Reservation("RES2", "R200", "ACC2", "Title",
                LocalDateTime.now(), LocalDateTime.now().plusHours(1), "faculty",
                30.0, 30.0, 30.0, PaymentMethod.DEBIT_CARD);
        assertFalse(reservation.isCheckedIn());
        assertFalse(reservation.isCanceled());
        assertFalse(reservation.isExtended());
        assertFalse(reservation.isDepositLost());
    }

    @Test
    public void testSetCanceled() {
        Reservation reservation = new Reservation();
        reservation.setCanceled(true);
        assertTrue(reservation.isCanceled());
    }

    @Test
    public void testSetCheckedIn() {
        Reservation reservation = new Reservation();
        reservation.setCheckedIn(true);
        assertTrue(reservation.isCheckedIn());
    }

    @Test
    public void testSetExtended() {
        Reservation reservation = new Reservation();
        reservation.setExtended(true);
        assertTrue(reservation.isExtended());
    }

    @Test
    public void testSetDepositLost() {
        Reservation reservation = new Reservation();
        reservation.setDepositLost(true);
        assertTrue(reservation.isDepositLost());
    }

    @Test
    public void testSetStartTimeAndEndTime() {
        Reservation reservation = new Reservation();
        LocalDateTime start = LocalDateTime.of(2026, 10, 1, 9, 0);
        LocalDateTime end = LocalDateTime.of(2026, 10, 1, 10, 0);
        reservation.setStartTime(start);
        reservation.setEndTime(end);
        assertEquals(start, reservation.getStartTime());
        assertEquals(end, reservation.getEndTime());
    }

    @Test
    public void testSetFinalAmount() {
        Reservation reservation = new Reservation();
        reservation.setFinalAmount(45.5);
        assertEquals(45.5, reservation.getFinalAmount(), 0.001);
    }

    @Test
    public void testSetPaymentMethod() {
        Reservation reservation = new Reservation();
        reservation.setPaymentMethod(PaymentMethod.INSTITUTIONAL_BILLING);
        assertEquals(PaymentMethod.INSTITUTIONAL_BILLING, reservation.getPaymentMethod());
    }

    @Test
    public void testSetReservationIdAndRoomId() {
        Reservation reservation = new Reservation();
        reservation.setReservationId("RES99");
        reservation.setRoomId("R999");
        assertEquals("RES99", reservation.getReservationId());
        assertEquals("R999", reservation.getRoomId());
    }
}