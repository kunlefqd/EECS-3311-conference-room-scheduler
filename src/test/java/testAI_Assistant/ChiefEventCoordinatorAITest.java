package testAI_Assistant;

import com.conferenceroomscheduler.model.Account;
import com.conferenceroomscheduler.patterns.ChiefEventCoordinator;
import com.conferenceroomscheduler.patterns.RoomSensorObserver;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * AI-Generated Test Suite for ChiefEventCoordinator
 * EECS 3311 Deliverable 3 - Task 3
 */
public class ChiefEventCoordinatorAITest {

    private ChiefEventCoordinator coordinator;
    private MockRoomSensorObserver observer1;
    private MockRoomSensorObserver observer2;

    /**
     * Mock observer implementation to track update notifications and messages.
     */
    private static class MockRoomSensorObserver implements RoomSensorObserver {
        private int updateCount = 0;
        private String lastMessage = null;

        @Override
        public void update(String message) {
            this.updateCount++;
            this.lastMessage = message;
        }

        public int getUpdateCount() {
            return updateCount;
        }

        public String getLastMessage() {
            return lastMessage;
        }

        public void reset() {
            this.updateCount = 0;
            this.lastMessage = null;
        }
    }

    @Before
    public void setUp() {
        coordinator = ChiefEventCoordinator.getInstance();
        observer1 = new MockRoomSensorObserver();
        observer2 = new MockRoomSensorObserver();

        // Clean up any observers that might persist across tests due to Singleton state
        coordinator.removeObserver(observer1);
        coordinator.removeObserver(observer2);
    }

    // --- Singleton Pattern Verification ---

    @Test
    public void testGetInstanceReturnsNonNullSingletonInstance() {
        ChiefEventCoordinator instance1 = ChiefEventCoordinator.getInstance();
        ChiefEventCoordinator instance2 = ChiefEventCoordinator.getInstance();

        assertNotNull("getInstance should not return null", instance1);
        assertSame("getInstance must return the exact same object reference (Singleton)", instance1, instance2);
    }

    // --- Admin Account Generation Tests ---

    @Test
    public void testGenerateAdminAccountCreatesValidAdminAccount() {
        Account admin = coordinator.generateAdminAccount("ADM_001", "admin1@yorku.ca", "SecretPass123");

        assertNotNull("Generated admin account should not be null", admin);
        assertEquals("ADM_001", admin.getAccountId());
        assertEquals("admin1@yorku.ca", admin.getEmail());
        assertEquals("SecretPass123", admin.getPassword());
        assertEquals("admin", admin.getAccountType());
        assertTrue("Admin account should be verified", admin.isVerified());
        assertFalse("Admin account should not be a university account (based on factory flag)", admin.isUniversityAccount());
        assertTrue("Account number must begin with ADMIN- prefix", admin.getAccountNumber().startsWith("ADMIN-"));
    }

    @Test
    public void testGenerateAdminAccountIncrementsSequenceNumber() {
        Account admin1 = coordinator.generateAdminAccount("ADM_002", "admin2@yorku.ca", "Pass1");
        Account admin2 = coordinator.generateAdminAccount("ADM_003", "admin3@yorku.ca", "Pass2");

        assertNotEquals("Sequential admin accounts must have distinct account numbers",
                admin1.getAccountNumber(), admin2.getAccountNumber());

        int seq1 = Integer.parseInt(admin1.getAccountNumber().replace("ADMIN-", ""));
        int seq2 = Integer.parseInt(admin2.getAccountNumber().replace("ADMIN-", ""));
        assertEquals("Admin sequence must increment by 1", seq1 + 1, seq2);
    }

    @Test
    public void testGenerateAdminAccountTriggersObserverNotification() {
        coordinator.registerObserver(observer1);

        Account admin = coordinator.generateAdminAccount("ADM_004", "notify@yorku.ca", "Pass123");

        assertEquals("Generating admin account must trigger notification to registered observers", 1, observer1.getUpdateCount());
        assertEquals("Administrator account generated: notify@yorku.ca", observer1.getLastMessage());

        // Cleanup
        coordinator.removeObserver(observer1);
    }

    // --- Observer Management & Notification Tests ---

    @Test
    public void testRegisterObserverReceivesNotifications() {
        coordinator.registerObserver(observer1);
        coordinator.notifyObservers("Test broadcast message");

        assertEquals(1, observer1.getUpdateCount());
        assertEquals("Test broadcast message", observer1.getLastMessage());

        coordinator.removeObserver(observer1);
    }

    @Test
    public void testMultipleObserversReceiveNotifications() {
        coordinator.registerObserver(observer1);
        coordinator.registerObserver(observer2);

        coordinator.notifyObservers("Global alert");

        assertEquals(1, observer1.getUpdateCount());
        assertEquals("Global alert", observer1.getLastMessage());

        assertEquals(1, observer2.getUpdateCount());
        assertEquals("Global alert", observer2.getLastMessage());

        // Cleanup
        coordinator.removeObserver(observer1);
        coordinator.removeObserver(observer2);
    }

    @Test
    public void testRemoveObserverStopsNotifications() {
        coordinator.registerObserver(observer1);
        coordinator.notifyObservers("First message");
        assertEquals(1, observer1.getUpdateCount());

        coordinator.removeObserver(observer1);
        coordinator.notifyObservers("Second message");

        // Count should remain 1, message should remain "First message"
        assertEquals(1, observer1.getUpdateCount());
        assertEquals("First message", observer1.getLastMessage());
    }

    @Test
    public void testRemoveUnregisteredObserverDoesNotThrowException() {
        try {
            coordinator.removeObserver(observer1);
            coordinator.notifyObservers("Safe message");
        } catch (Exception e) {
            fail("Removing an unregistered observer should not throw an exception: " + e.getMessage());
        }
    }

    @Test
    public void testNotifyObserversWhenNoObserversRegistered() {
        try {
            coordinator.notifyObservers("Message with empty list");
        } catch (Exception e) {
            fail("Notifying with empty observer list should execute safely: " + e.getMessage());
        }
    }

    @Test
    public void testNotifyObserversWithNullOrEmptyMessage() {
        coordinator.registerObserver(observer1);

        coordinator.notifyObservers(null);
        assertNull(observer1.getLastMessage());
        assertEquals(1, observer1.getUpdateCount());

        coordinator.notifyObservers("");
        assertEquals("", observer1.getLastMessage());
        assertEquals(2, observer1.getUpdateCount());

        coordinator.removeObserver(observer1);
    }
}