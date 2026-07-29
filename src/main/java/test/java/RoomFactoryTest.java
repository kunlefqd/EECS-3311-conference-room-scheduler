package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.conferenceroomscheduler.model.Room;
import com.conferenceroomscheduler.patterns.RoomFactory;

public class RoomFactoryTest {

    private RoomFactory factory;

    @Before
    public void setUp() {
        factory = new RoomFactory();
    }

    @Test
    public void testCreateRoomNotNull() {
        assertNotNull(factory.createRoom("R1","Conference A",20,"Lassonde","1001"));
    }

    @Test
    public void testRoomId() {
        Room room = factory.createRoom("R1","Conference A",20,"Lassonde","1001");
        assertEquals("R1", room.getRoomId());
    }

    @Test
    public void testName() {
        Room room = factory.createRoom("R1","Conference A",20,"Lassonde","1001");
        assertEquals("Conference A", room.getName());
    }

    @Test
    public void testCapacity() {
        Room room = factory.createRoom("R1","Conference A",20,"Lassonde","1001");
        assertEquals(20, room.getCapacity());
    }

    @Test
    public void testBuilding() {
        Room room = factory.createRoom("R1","Conference A",20,"Lassonde","1001");
        assertEquals("Lassonde", room.getBuilding());
    }

    @Test
    public void testRoomNumber() {
        Room room = factory.createRoom("R1","Conference A",20,"Lassonde","1001");
        assertEquals("1001", room.getRoomNumber());
    }

    @Test
    public void testEnabledByDefault() {
        Room room = factory.createRoom("R1","Conference A",20,"Lassonde","1001");
        assertTrue(room.isEnabled());
    }

    @Test
    public void testOccupancySensorCreated() {
        Room room = factory.createRoom("R1","Conference A",20,"Lassonde","1001");
        assertNotNull(room.getOccupancySensor());
    }

    @Test
    public void testZeroCapacity() {
        Room room = factory.createRoom("R2","Small",0,"Bergeron","B101");
        assertEquals(0, room.getCapacity());
    }

    @Test
    public void testLargeCapacity() {
        Room room = factory.createRoom("R3","Auditorium",500,"Vari","V100");
        assertEquals(500, room.getCapacity());
    }
}
