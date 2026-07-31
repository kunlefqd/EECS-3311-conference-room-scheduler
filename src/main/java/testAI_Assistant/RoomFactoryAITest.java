package testAI_Assistant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.conferenceroomscheduler.model.Room;
import com.conferenceroomscheduler.patterns.RoomFactory;

public class RoomFactoryAITest {

    private RoomFactory factory;

    @Before
    public void setUp() {
        factory = new RoomFactory();
    }

    @Test
    public void testCreateRoomNotNull() {
        Room room = factory.createRoom("R1", "Conference A", 20, "Lassonde", "1001");
        assertNotNull(room);
    }

    @Test
    public void testCreateRoomSetsRoomId() {
        Room room = factory.createRoom("R1", "Conference A", 20, "Lassonde", "1001");
        assertEquals("R1", room.getRoomId());
    }

    @Test
    public void testCreateRoomSetsName() {
        Room room = factory.createRoom("R1", "Conference A", 20, "Lassonde", "1001");
        assertEquals("Conference A", room.getName());
    }

    @Test
    public void testCreateRoomSetsCapacity() {
        Room room = factory.createRoom("R1", "Conference A", 20, "Lassonde", "1001");
        assertEquals(20, room.getCapacity());
    }

    @Test
    public void testCreateRoomSetsBuilding() {
        Room room = factory.createRoom("R1", "Conference A", 20, "Lassonde", "1001");
        assertEquals("Lassonde", room.getBuilding());
    }

    @Test
    public void testCreateRoomSetsRoomNumber() {
        Room room = factory.createRoom("R1", "Conference A", 20, "Lassonde", "1001");
        assertEquals("1001", room.getRoomNumber());
    }

    @Test
    public void testCreateRoomEnabledByDefault() {
        Room room = factory.createRoom("R1", "Conference A", 20, "Lassonde", "1001");
        assertTrue(room.isEnabled());
    }

    @Test
    public void testCreateRoomCreatesOccupancySensor() {
        Room room = factory.createRoom("R1", "Conference A", 20, "Lassonde", "1001");
        assertNotNull(room.getOccupancySensor());
    }

    @Test
    public void testCreateRoomNotClosedForMaintenanceByDefault() {
        Room room = factory.createRoom("R1", "Conference A", 20, "Lassonde", "1001");
        assertFalse(room.isClosedForMaintenance());
    }

    @Test
    public void testCreateRoomZeroCapacityBoundary() {
        Room room = factory.createRoom("R0", "Tiny", 0, "Bergeron", "B001");
        assertEquals(0, room.getCapacity());
    }

    @Test
    public void testCreateRoomLargeCapacityBoundary() {
        Room room = factory.createRoom("R9", "Auditorium", 500, "Vari", "V100");
        assertEquals(500, room.getCapacity());
    }

    @Test
    public void testCreateRoomEmptyNameBoundary() {
        Room room = factory.createRoom("R2", "", 10, "PSE", "200");
        assertEquals("", room.getName());
    }


    @Test
    public void testCreateRoomDisabledByDefault() {
        Room room = factory.createRoom("R1", "Conference A", 20, "Lassonde", "1001");
        assertFalse(room.isEnabled());
    }

    @Test
    public void testBuildRoomAlias() {
        Room room = factory.buildRoom("R2", "Lab", 15, "PSE", "200");
        assertNotNull(room);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeCapacityRejected() {
        factory.createRoom("R-NEG", "Broken", -5, "Lassonde", "999");
    }
}
