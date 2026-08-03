package test.java;

import com.conferenceroomscheduler.model.Account;
import com.conferenceroomscheduler.patterns.CheckInObserver;
import com.conferenceroomscheduler.patterns.CheckInPublisher;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckInObserverTest {

    private TestObserver observer;
    private CheckInPublisher publisher;

    /**
     * Simple concrete implementation used only for testing.
     */
    private static class TestObserver extends CheckInObserver {

        public TestObserver(String roomId, boolean occupied, boolean detected) {
            super(roomId, occupied, detected);
        }

        @Override
        public boolean detectOccupancy(Account account) {
            setDetected(account != null);
            return isDetected();
        }
    }

    @Before
    public void setUp() {
        observer = new TestObserver("R101", false, false);
        publisher = new CheckInPublisher();
    }

    @Test
    public void testConstructorInitializesRoomId() {
        assertEquals("R101", observer.getRoomId());
    }

    @Test
    public void testConstructorInitializesOccupied() {
        assertFalse(observer.isOccupied());
    }

    @Test
    public void testConstructorInitializesDetected() {
        assertFalse(observer.isDetected());
    }

    @Test
    public void testSetAndGetSubject() {
        observer.setSubject(publisher);

        assertEquals(publisher, observer.getSubject());
    }

    @Test
    public void testSetSubjectToNull() {
        observer.setSubject(publisher);
        observer.setSubject(null);

        assertNull(observer.getSubject());
    }

    @Test
    public void testSetAndGetRoomId() {
        observer.setRoomId("R202");

        assertEquals("R202", observer.getRoomId());
    }

    @Test
    public void testSetAndGetOccupied() {
        observer.setOccupied(true);

        assertTrue(observer.isOccupied());
    }

    @Test
    public void testSetAndGetDetected() {
        observer.setDetected(true);

        assertTrue(observer.isDetected());
    }

    @Test
    public void testDetectOccupancyWithAccount() {
        Account account = new Account();

        assertTrue(observer.detectOccupancy(account));
        assertTrue(observer.isDetected());
    }

    @Test
    public void testDetectOccupancyWithNullAccount() {
        assertFalse(observer.detectOccupancy(null));
        assertFalse(observer.isDetected());
    }
}