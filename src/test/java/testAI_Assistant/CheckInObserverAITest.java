package testAI_Assistant;

import com.conferenceroomscheduler.model.Account;
import com.conferenceroomscheduler.patterns.CheckInObserver;
import com.conferenceroomscheduler.patterns.CheckInPublisher;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * AI-Generated Test Suite for CheckInObserver
 * EECS 3311 Deliverable 3 - Task 3
 */
public class CheckInObserverAITest {

    private TestConcreteObserver observer;
    private CheckInPublisher publisher;

    /**
     * Concrete inner class created to instantiate and test the abstract CheckInObserver.
     */
    private static class TestConcreteObserver extends CheckInObserver {

        public TestConcreteObserver(String roomId, boolean occupied, boolean isDetected) {
            super(roomId, occupied, isDetected);
        }

        @Override
        public boolean detectOccupancy(Account account) {
            if (account != null && isOccupied()) {
                setDetected(true);
                return true;
            }
            setDetected(false);
            return false;
        }
    }

    @Before
    public void setUp() {
        observer = new TestConcreteObserver("ROOM_101", false, false);
        publisher = new CheckInPublisher();
    }

    // --- Constructor & Initial State Tests ---

    @Test
    public void testConstructorInitialization() {
        assertEquals("ROOM_101", observer.getRoomId());
        assertFalse("Initial occupied state should be false", observer.isOccupied());
        assertFalse("Initial isDetected state should be false", observer.isDetected());
        assertNull("Subject should initially be null", observer.getSubject());
    }

    @Test
    public void testConstructorWithTrueFlags() {
        TestConcreteObserver activeObserver = new TestConcreteObserver("ROOM_202", true, true);
        assertEquals("ROOM_202", activeObserver.getRoomId());
        assertTrue(activeObserver.isOccupied());
        assertTrue(activeObserver.isDetected());
    }

    // --- Getter and Setter Boundary Tests ---

    @Test
    public void testSetAndGetSubject() {
        observer.setSubject(publisher);
        assertEquals(publisher, observer.getSubject());
    }

    @Test
    public void testSetSubjectNull() {
        observer.setSubject(publisher);
        assertEquals(publisher, observer.getSubject());

        observer.setSubject(null);
        assertNull(observer.getSubject());
    }

    @Test
    public void testSetAndGetRoomId() {
        observer.setRoomId("ROOM_303");
        assertEquals("ROOM_303", observer.getRoomId());
    }

    @Test
    public void testSetAndGetRoomIdNullAndEmpty() {
        observer.setRoomId("");
        assertEquals("", observer.getRoomId());

        observer.setRoomId(null);
        assertNull(observer.getRoomId());
    }

    @Test
    public void testSetAndGetOccupiedToggle() {
        observer.setOccupied(true);
        assertTrue(observer.isOccupied());

        observer.setOccupied(false);
        assertFalse(observer.isOccupied());
    }

    @Test
    public void testSetAndGetDetectedToggle() {
        observer.setDetected(true);
        assertTrue(observer.isDetected());

        observer.setDetected(false);
        assertFalse(observer.isDetected());
    }

    // --- Concrete Method & Concrete Stub Implementation Tests ---

    @Test
    public void testDetectOccupancyWhenOccupiedWithAccount() {
        observer.setOccupied(true);
        Account account = new Account();

        boolean result = observer.detectOccupancy(account);

        assertTrue("detectOccupancy should return true when room is occupied and account is non-null", result);
        assertTrue("isDetected state should be set to true", observer.isDetected());
    }

    @Test
    public void testDetectOccupancyWhenUnoccupied() {
        observer.setOccupied(false);
        Account account = new Account();

        boolean result = observer.detectOccupancy(account);

        assertFalse("detectOccupancy should return false when room is unoccupied", result);
        assertFalse("isDetected state should remain false", observer.isDetected());
    }

    @Test
    public void testDetectOccupancyWithNullAccount() {
        observer.setOccupied(true);

        boolean result = observer.detectOccupancy(null);

        assertFalse("detectOccupancy should return false when account is null", result);
        assertFalse("isDetected state should be false", observer.isDetected());
    }
}