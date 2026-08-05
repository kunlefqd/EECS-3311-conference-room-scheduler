package com.conferenceroomscheduler.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.conferenceroomscheduler.model.ReservationStatus;

public class ReservationStatusTest {

    @Test
    public void testPendingExists() {
        assertNotNull(ReservationStatus.PENDING);
    }

    @Test
    public void testConfirmedExists() {
        assertNotNull(ReservationStatus.CONFIRMED);
    }

    @Test
    public void testCheckedInExists() {
        assertNotNull(ReservationStatus.CHECKED_IN);
    }

    @Test
    public void testCancelledExists() {
        assertNotNull(ReservationStatus.CANCELLED);
    }

    @Test
    public void testValueOfPending() {
        assertEquals(ReservationStatus.PENDING, ReservationStatus.valueOf("PENDING"));
    }

    @Test
    public void testValueOfConfirmed() {
        assertEquals(ReservationStatus.CONFIRMED, ReservationStatus.valueOf("CONFIRMED"));
    }

    @Test
    public void testValueOfCheckedIn() {
        assertEquals(ReservationStatus.CHECKED_IN, ReservationStatus.valueOf("CHECKED_IN"));
    }

    @Test
    public void testValueOfCancelled() {
        assertEquals(ReservationStatus.CANCELLED, ReservationStatus.valueOf("CANCELLED"));
    }

    @Test
    public void testValuesCount() {
        assertEquals(4, ReservationStatus.values().length);
    }

    @Test
    public void testEnumOrdering() {
        ReservationStatus[] values = ReservationStatus.values();
        assertEquals(ReservationStatus.PENDING, values[0]);
        assertEquals(ReservationStatus.CONFIRMED, values[1]);
        assertEquals(ReservationStatus.CHECKED_IN, values[2]);
        assertEquals(ReservationStatus.CANCELLED, values[3]);
    }
}