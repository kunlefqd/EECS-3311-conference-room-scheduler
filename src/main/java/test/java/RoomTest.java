package com.conferenceroomscheduler.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoomTest {

    private Room room;

    @Before
    public void setUp() {
        room = new Room(
                "R101",
                "Conference Room",
                20,
                true,
                "Building A",
                "101"
        );
    }

    @Test
    public void testConstructorInitializesRoomId() {
        assertEquals("R101", room.getRoomId());
    }

    @Test
    public void testConstructorInitializesName() {
        assertEquals("Conference Room", room.getName());
    }

    @Test
    public void testConstructorInitializesCapacity() {
        assertEquals(20, room.getCapacity());
    }

    @Test
    public void testSetAndGetRoomId() {
        room.setRoomId("R202");

        assertEquals("R202", room.getRoomId());
    }

    @Test
    public void testSetAndGetName() {
        room.setName("Meeting Room");

        assertEquals("Meeting Room", room.getName());
    }

    @Test
    public void testSetAndGetCapacity() {
        room.setCapacity(50);

        assertEquals(50, room.getCapacity());
    }

    @Test
    public void testEnableAndDisableRoom() {
        room.setEnabled(false);
        assertFalse(room.isEnabled());

        room.setEnabled(true);
        assertTrue(room.isEnabled());
    }

    @Test
    public void testMaintenanceFlag() {
        room.setClosedForMaintenance(true);
        assertTrue(room.isClosedForMaintenance());

        room.setClosedForMaintenance(false);
        assertFalse(room.isClosedForMaintenance());
    }

    @Test
    public void testSetAndGetOccupancySensor() {
        OccupancySensor sensor = new OccupancySensor("R999", false, false);

        room.setOccupancySensor(sensor);

        assertEquals(sensor, room.getOccupancySensor());
    }

    @Test
    public void testCheckInMarksRoomOccupied() {
        Account account = new Account(
                "1",
                "student@test.com",
                "password",
                "student",
                true,
                true,
                "1001"
        );

        room.checkIn(account);

        assertTrue(room.getOccupancySensor().isOccupied());
    }
}