package com.conferenceroomscheduler.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import java.time.LocalDateTime;

import com.conferenceroomscheduler.model.BookingRequest;

public class BookingRequestTest {

    @Test
    public void testDefaultConstructorCreatesEmptyObject() {
        BookingRequest request = new BookingRequest();
        assertNull(request.getRequestId());
        assertNull(request.getRoomId());
    }

    @Test
    public void testFullConstructorSetsAllFields() {
        LocalDateTime start = LocalDateTime.of(2026, 8, 1, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 8, 1, 11, 0);
        BookingRequest request = new BookingRequest("REQ1", "R100", "ORG1", "Team Meeting", 5, start, end);
        assertEquals("REQ1", request.getRequestId());
        assertEquals("R100", request.getRoomId());
        assertEquals("ORG1", request.getOrganizerId());
        assertEquals("Team Meeting", request.getTitle());
        assertEquals(5, request.getAttendeeCount());
        assertEquals(start, request.getStartTime());
        assertEquals(end, request.getEndTime());
    }

    @Test
    public void testGetRequestId() {
        BookingRequest request = new BookingRequest("REQ2", "R200", "ORG2", "Title", 3,
                LocalDateTime.now(), LocalDateTime.now().plusHours(1));
        assertEquals("REQ2", request.getRequestId());
    }

    @Test
    public void testGetRoomId() {
        BookingRequest request = new BookingRequest("REQ3", "R300", "ORG3", "Title", 2,
                LocalDateTime.now(), LocalDateTime.now().plusHours(1));
        assertEquals("R300", request.getRoomId());
    }

    @Test
    public void testGetOrganizerId() {
        BookingRequest request = new BookingRequest("REQ4", "R400", "ORG4", "Title", 1,
                LocalDateTime.now(), LocalDateTime.now().plusHours(1));
        assertEquals("ORG4", request.getOrganizerId());
    }

    @Test
    public void testGetTitle() {
        BookingRequest request = new BookingRequest("REQ5", "R500", "ORG5", "Budget Review", 4,
                LocalDateTime.now(), LocalDateTime.now().plusHours(1));
        assertEquals("Budget Review", request.getTitle());
    }

    @Test
    public void testGetAttendeeCount() {
        BookingRequest request = new BookingRequest("REQ6", "R600", "ORG6", "Title", 10,
                LocalDateTime.now(), LocalDateTime.now().plusHours(1));
        assertEquals(10, request.getAttendeeCount());
    }

    @Test
    public void testGetStartTime() {
        LocalDateTime start = LocalDateTime.of(2026, 9, 1, 9, 0);
        BookingRequest request = new BookingRequest("REQ7", "R700", "ORG7", "Title", 6,
                start, start.plusHours(1));
        assertEquals(start, request.getStartTime());
    }

    @Test
    public void testGetEndTime() {
        LocalDateTime start = LocalDateTime.of(2026, 9, 1, 9, 0);
        LocalDateTime end = start.plusHours(2);
        BookingRequest request = new BookingRequest("REQ8", "R800", "ORG8", "Title", 6, start, end);
        assertEquals(end, request.getEndTime());
    }

    @Test
    public void testZeroAttendeeCount() {
        BookingRequest request = new BookingRequest("REQ9", "R900", "ORG9", "Title", 0,
                LocalDateTime.now(), LocalDateTime.now().plusHours(1));
        assertEquals(0, request.getAttendeeCount());
    }

    @Test
    public void testStartAndEndTimeAreDistinct() {
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusHours(1);
        BookingRequest request = new BookingRequest("REQ10", "R1000", "ORG10", "Title", 5, start, end);
        assertNotNull(request.getStartTime());
        assertNotNull(request.getEndTime());
        assertEquals(start, request.getStartTime());
        assertEquals(end, request.getEndTime());
    }
}