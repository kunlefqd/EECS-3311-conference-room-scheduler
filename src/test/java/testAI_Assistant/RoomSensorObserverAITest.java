package testAI_Assistant;

import com.conferenceroomscheduler.patterns.RoomSensorObserver;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * AI-Generated Test Suite for RoomSensorObserver Interface
 * EECS 3311 Deliverable 3 - Task 3
 */
public class RoomSensorObserverAITest {

    private TestConcreteRoomSensorObserver observer;

    /**
     * Concrete implementation stub to test the behavior contracts of the interface.
     */
    private static class TestConcreteRoomSensorObserver implements RoomSensorObserver {
        private String lastMessage = null;
        private int updateCount = 0;

        @Override
        public void update(String message) {
            this.lastMessage = message;
            this.updateCount++;
        }

        public String getLastMessage() {
            return lastMessage;
        }

        public int getUpdateCount() {
            return updateCount;
        }
    }

    @Before
    public void setUp() {
        observer = new TestConcreteRoomSensorObserver();
    }

    // --- Interface Contract & Implementation Tests ---

    @Test
    public void testConcreteImplementationIsInstanceOfInterface() {
        assertNotNull("Observer instance should not be null", observer);
        assertTrue("Concrete stub must implement RoomSensorObserver interface",
                observer instanceof RoomSensorObserver);
    }

    @Test
    public void testUpdateStoresStandardMessage() {
        observer.update("Sensor Activated: Room 101");

        assertEquals("Sensor Activated: Room 101", observer.getLastMessage());
        assertEquals(1, observer.getUpdateCount());
    }

    @Test
    public void testUpdateWithEmptyString() {
        observer.update("");

        assertEquals("", observer.getLastMessage());
        assertEquals(1, observer.getUpdateCount());
    }

    @Test
    public void testUpdateWithNullMessage() {
        observer.update(null);

        assertNull(observer.getLastMessage());
        assertEquals(1, observer.getUpdateCount());
    }

    @Test
    public void testUpdateSequentialOverwritesPreviousMessage() {
        observer.update("Initial Motion Detected");
        assertEquals("Initial Motion Detected", observer.getLastMessage());

        observer.update("Room Clear");
        assertEquals("Room Clear", observer.getLastMessage());
        assertEquals(2, observer.getUpdateCount());
    }

    @Test
    public void testUpdateWithSpecialCharactersAndNumbers() {
        String complexMsg = "[ALERT] Room #404-B: Capacity Exceeded > 100%!";
        observer.update(complexMsg);

        assertEquals(complexMsg, observer.getLastMessage());
    }

    @Test
    public void testUpdateWithLongPayload() {
        StringBuilder longMsg = new StringBuilder();
        for (int i = 0; i < 500; i++) {
            longMsg.append("LOG_DATA_");
        }
        observer.update(longMsg.toString());

        assertEquals(longMsg.toString(), observer.getLastMessage());
    }

    @Test
    public void testMultipleObserverInstancesAreIndependent() {
        TestConcreteRoomSensorObserver observer2 = new TestConcreteRoomSensorObserver();

        observer.update("Msg 1");
        observer2.update("Msg 2");

        assertEquals("Msg 1", observer.getLastMessage());
        assertEquals("Msg 2", observer2.getLastMessage());
        assertEquals(1, observer.getUpdateCount());
        assertEquals(1, observer2.getUpdateCount());
    }

    @Test
    public void testAnonymousClassImplementationOfInterface() {
        final String[] captured = new String[1];
        RoomSensorObserver anonObserver = new RoomSensorObserver() {
            @Override
            public void update(String message) {
                captured[0] = message;
            }
        };

        anonObserver.update("Anonymous Test Message");
        assertEquals("Anonymous Test Message", captured[0]);
    }

    @Test
    public void testLambdaImplementationOfInterface() {
        // Since RoomSensorObserver is a single-method functional interface, test lambda invocation
        final String[] captured = new String[1];
        RoomSensorObserver lambdaObserver = msg -> captured[0] = msg;

        lambdaObserver.update("Lambda Test Message");
        assertEquals("Lambda Test Message", captured[0]);
    }
}