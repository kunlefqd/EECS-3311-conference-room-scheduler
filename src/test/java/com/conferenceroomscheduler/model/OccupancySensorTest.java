package com.conferenceroomscheduler.model;

import com.conferenceroomscheduler.model.Account;
import com.conferenceroomscheduler.model.OccupancySensor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccupancySensorTest {

    private OccupancySensor sensor;
    private Account verifiedAccount;
    private Account unverifiedAccount;

    @Before
    public void setUp() {
        sensor = new OccupancySensor("R101", true, false);

        verifiedAccount = new Account(
                "1",
                "verified@test.com",
                "password",
                "student",
                true,
                true,
                "1001"
        );

        unverifiedAccount = new Account(
                "2",
                "unverified@test.com",
                "password",
                "student",
                true,
                false,
                "1002"
        );
    }

    @Test
    public void testConstructorInitializesRoomId() {
        assertEquals("R101", sensor.getRoomId());
    }

    @Test
    public void testConstructorInitializesOccupied() {
        assertTrue(sensor.isOccupied());
    }

    @Test
    public void testConstructorInitializesDetected() {
        assertFalse(sensor.isDetected());
    }

    @Test
    public void testDetectOccupancyReturnsTrueWhenOccupied() {
        assertTrue(sensor.detectOccupancy(verifiedAccount));
    }

    @Test
    public void testDetectOccupancySetsDetectedFlag() {
        sensor.detectOccupancy(verifiedAccount);

        assertTrue(sensor.isDetected());
    }

    @Test
    public void testDetectOccupancyUpdatesLastEvent() {
        sensor.detectOccupancy(verifiedAccount);

        assertNotNull(sensor.getLastEvent());
        assertTrue(sensor.getLastEvent().contains("Occupancy verified"));
    }

    @Test
    public void testScanVerifiedBadgeReturnsTrue() {
        assertTrue(sensor.scanIdBadge(verifiedAccount.getBadge()));
    }

    @Test
    public void testScanUnverifiedBadgeReturnsFalse() {
        assertFalse(sensor.scanIdBadge(unverifiedAccount.getBadge()));
    }

    @Test
    public void testScanBadgeUpdatesLastEvent() {
        sensor.scanIdBadge(verifiedAccount.getBadge());

        assertTrue(sensor.getLastEvent().contains("Verified badge detected"));
    }

    @Test
    public void testDetectOccupancyWhenRoomNotOccupied() {
        OccupancySensor emptyRoom =
                new OccupancySensor("R102", false, false);

        assertFalse(emptyRoom.detectOccupancy(verifiedAccount));
        assertFalse(emptyRoom.isDetected());
    }
}