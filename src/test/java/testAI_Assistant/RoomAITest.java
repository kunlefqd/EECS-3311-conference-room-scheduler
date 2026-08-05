package testAI_Assistant;

import com.conferenceroomscheduler.model.Account;
import com.conferenceroomscheduler.model.OccupancySensor;
import com.conferenceroomscheduler.model.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * AI-Generated Test Suite for Room
 * EECS 3311 Deliverable 3 - Task 3
 */
public class RoomAITest {

    private Room standardRoom;
    private Room disabledRoom;
    private Account studentAccount;

    @Before
    public void setUp() {
        standardRoom = new Room("R101", "Lassonde Hall", 50, true, "Lassonde", "101");
        disabledRoom = new Room("R102", "Lab 200", 30, false, "Lassonde", "102");

        studentAccount = new Account(
                "ACC_201",
                "student@yorku.ca",
                "pass123",
                "student",
                true,
                true,
                "NUM_201"
        );
    }

    // --- Constructor & Default State Tests ---

    @Test
    public void testConstructorInitializesAllFieldsAndSensor() {
        assertEquals("R101", standardRoom.getRoomId());
        assertEquals("Lassonde Hall", standardRoom.getName());
        assertEquals(50, standardRoom.getCapacity());
        assertTrue(standardRoom.isEnabled());
        assertEquals("Lassonde", standardRoom.getBuilding());
        assertEquals("101", standardRoom.getRoomNumber());
        assertFalse("Default closedForMaintenance should be false", standardRoom.isClosedForMaintenance());

        assertNotNull("OccupancySensor should be automatically instantiated", standardRoom.getOccupancySensor());
        assertEquals("R101", standardRoom.getOccupancySensor().getRoomId());
        assertFalse("Sensor should initially be unoccupied", standardRoom.getOccupancySensor().isOccupied());
    }

    @Test
    public void testConstructorWithDisabledRoom() {
        assertFalse(disabledRoom.isEnabled());
    }

    // --- Getter and Setter Boundary Tests ---

    @Test
    public void testSetAndGetRoomId() {
        standardRoom.setRoomId("R999");
        assertEquals("R999", standardRoom.getRoomId());
    }

    @Test
    public void testSetAndGetName() {
        standardRoom.setName("Auditorium A");
        assertEquals("Auditorium A", standardRoom.getName());
    }

    @Test
    public void testSetAndGetCapacityZeroAndPositive() {
        standardRoom.setCapacity(0);
        assertEquals(0, standardRoom.getCapacity());

        standardRoom.setCapacity(150);
        assertEquals(150, standardRoom.getCapacity());
    }

    @Test
    public void testSetAndGetBuildingAndRoomNumber() {
        standardRoom.setBuilding("Dahdaleh");
        standardRoom.setRoomNumber("0001");

        assertEquals("Dahdaleh", standardRoom.getBuilding());
        assertEquals("0001", standardRoom.getRoomNumber());
    }

    @Test
    public void testSetAndGetEnabledToggle() {
        standardRoom.setEnabled(false);
        assertFalse(standardRoom.isEnabled());

        standardRoom.setEnabled(true);
        assertTrue(standardRoom.isEnabled());
    }

    @Test
    public void testSetAndGetClosedForMaintenanceToggle() {
        assertFalse(standardRoom.isClosedForMaintenance());
        standardRoom.setClosedForMaintenance(true);
        assertTrue(standardRoom.isClosedForMaintenance());

        standardRoom.setClosedForMaintenance(false);
        assertFalse(standardRoom.isClosedForMaintenance());
    }

    @Test
    public void testSetAndGetOccupancySensorCustom() {
        OccupancySensor customSensor = new OccupancySensor("R888", true, true);
        standardRoom.setOccupancySensor(customSensor);

        assertEquals(customSensor, standardRoom.getOccupancySensor());
        assertTrue(standardRoom.getOccupancySensor().isOccupied());
    }

    @Test
    public void testSetOccupancySensorNull() {
        standardRoom.setOccupancySensor(null);
        assertNull(standardRoom.getOccupancySensor());
    }

    // --- Domain Logic / Behavior Tests ---

    @Test
    public void testCheckInUpdatesOccupancySensorToOccupied() {
        assertFalse(standardRoom.getOccupancySensor().isOccupied());

        standardRoom.checkIn(studentAccount);

        assertTrue("checkIn should mark sensor as occupied", standardRoom.getOccupancySensor().isOccupied());
    }

    @Test
    public void testCheckInWithNullAccountDoesNotThrowException() {
        // Method currently only changes internal sensor state regardless of account
        standardRoom.checkIn(null);
        assertTrue(standardRoom.getOccupancySensor().isOccupied());
    }
}