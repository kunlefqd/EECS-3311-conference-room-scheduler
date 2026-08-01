package com.conferenceroomscheduler.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BadgeScanTest {

    private BadgeScan badgeScan;

    @Before
    public void setUp() {
        badgeScan = new BadgeScan("BADGE001", "R101", true);
    }

    @Test
    public void testConstructorSetsBadgeId() {
        assertEquals("BADGE001", badgeScan.getBadgeId());
    }

    @Test
    public void testConstructorSetsRoomId() {
        assertEquals("R101", badgeScan.getRoomId());
    }

    @Test
    public void testConstructorSetsVerified() {
        assertTrue(badgeScan.isVerified());
    }

    @Test
    public void testDefaultConstructor() {
        BadgeScan scan = new BadgeScan();

        assertNull(scan.getBadgeId());
        assertNull(scan.getRoomId());
        assertFalse(scan.isVerified());
    }

    @Test
    public void testSetBadgeId() {
        badgeScan.setBadgeId("BADGE999");

        assertEquals("BADGE999", badgeScan.getBadgeId());
    }

    @Test
    public void testSetRoomId() {
        badgeScan.setRoomId("R202");

        assertEquals("R202", badgeScan.getRoomId());
    }

    @Test
    public void testSetVerifiedTrue() {
        badgeScan.setVerified(true);

        assertTrue(badgeScan.isVerified());
    }

    @Test
    public void testSetVerifiedFalse() {
        badgeScan.setVerified(false);

        assertFalse(badgeScan.isVerified());
    }

    @Test
    public void testSetBadgeIdNull() {
        badgeScan.setBadgeId(null);

        assertNull(badgeScan.getBadgeId());
    }

    @Test
    public void testSetRoomIdNull() {
        badgeScan.setRoomId(null);

        assertNull(badgeScan.getRoomId());
    }
}