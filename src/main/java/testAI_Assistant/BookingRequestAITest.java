package testAI_Assistant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import com.conferenceroomscheduler.model.BookingRequest;

public class BookingRequestAITest {

    private BookingRequest request;

    @Before
    public void setUp() {
        request = new BookingRequest("REQ1", "ROOM1", "ORG1", "Standup",
                8, LocalDateTime.now(), LocalDateTime.now().plusHours(1));
    }

    @Test
    public void should_ReturnCorrectRequestId() {
        assertEquals("REQ1", request.getRequestId());
    }

    @Test
    public void should_ReturnCorrectAttendeeCount() {
        assertEquals(8, request.getAttendeeCount());
    }

    @Test
    public void should_StoreNegativeAttendeeCountWithoutValidation() {
        BookingRequest badRequest = new BookingRequest("REQ2", "ROOM2", "ORG2", "Bad",
                -5, LocalDateTime.now(), LocalDateTime.now().plusHours(1));
        assertTrue(badRequest.getAttendeeCount() < 0);
    }

    @Test
    public void should_StoreEndTimeBeforeStartTimeWithoutValidation() {
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.minusHours(1);
        BookingRequest invalid = new BookingRequest("REQ3", "ROOM3", "ORG3", "Invalid",
                5, start, end);
        assertTrue(invalid.getEndTime().isBefore(invalid.getStartTime()));
    }

    @Test
    public void should_HandleNullOrganizerIdGracefully() {
        BookingRequest request = new BookingRequest("REQ4", "ROOM4", null, "Title",
                3, LocalDateTime.now(), LocalDateTime.now().plusHours(1));
        assertNull(request.getOrganizerId());
    }
}