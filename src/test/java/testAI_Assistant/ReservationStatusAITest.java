package testAI_Assistant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.conferenceroomscheduler.model.ReservationStatus;

public class ReservationStatusAITest {

    @Test
    public void should_HaveFourEnumConstants() {
        assertEquals(4, ReservationStatus.values().length);
    }

    @Test
    public void should_ConvertToStringCorrectly() {
        assertEquals("CONFIRMED", ReservationStatus.CONFIRMED.toString());
    }

    @Test
    public void should_NotEqualDifferentConstants() {
        assertNotEquals(ReservationStatus.PENDING, ReservationStatus.CANCELLED);
    }

    @Test
    public void should_ReturnCorrectOrdinalForPending() {
        assertEquals(0, ReservationStatus.PENDING.ordinal());
    }

    @Test
    public void should_ReturnCorrectOrdinalForCancelled() {
        assertEquals(3, ReservationStatus.CANCELLED.ordinal());
    }
}