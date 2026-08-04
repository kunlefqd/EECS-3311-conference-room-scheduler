package testAI_Assistant;

import com.conferenceroomscheduler.model.Account;
import com.conferenceroomscheduler.patterns.CheckInObserver;
import com.conferenceroomscheduler.patterns.CheckInPublisher;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * AI-Generated Test Suite for CheckInPublisher
 * EECS 3311 Deliverable 3 - Task 3
 */
public class CheckInPublisherAITest {

    private CheckInPublisher publisher;
    private MockCheckInObserver observerA;
    private MockCheckInObserver observerB;
    private Account testAccount;

    /**
     * Concrete mock implementation of abstract CheckInObserver to track notifications.
     */
    private static class MockCheckInObserver extends CheckInObserver {
        private int notificationCount = 0;
        private Account lastReceivedAccount = null;

        public MockCheckInObserver(String roomId) {
            super(roomId, false, false);
        }

        @Override
        public boolean detectOccupancy(Account account) {
            this.notificationCount++;
            this.lastReceivedAccount = account;
            return true;
        }

        public int getNotificationCount() {
            return notificationCount;
        }

        public Account getLastReceivedAccount() {
            return lastReceivedAccount;
        }
    }

    @Before
    public void setUp() {
        publisher = new CheckInPublisher();
        observerA = new MockCheckInObserver("ROOM_101");
        observerB = new MockCheckInObserver("ROOM_102");
        testAccount = new Account();
    }

    // --- Observer Registration & Deregistration Tests ---

    @Test
    public void testRegisterSingleObserver() {
        publisher.registerObserver(observerA);

        assertEquals("Registering observer must link publisher as subject", publisher, observerA.getSubject());
    }

    @Test
    public void testRemoveObserverClearsSubjectLink() {
        publisher.registerObserver(observerA);
        assertEquals(publisher, observerA.getSubject());

        publisher.removeObserver(observerA);
        assertNull("Removing observer must clear subject link to null", observerA.getSubject());
    }

    @Test
    public void testRemoveNonExistentObserverDoesNotThrowException() {
        try {
            publisher.removeObserver(observerA);
            assertNull(observerA.getSubject());
        } catch (Exception e) {
            fail("Removing an unregistered observer should handle gracefully without exception: " + e.getMessage());
        }
    }

    @Test
    public void testRegisterSameObserverMultipleTimes() {
        publisher.registerObserver(observerA);
        publisher.registerObserver(observerA);

        assertEquals(publisher, observerA.getSubject());

        // Notify to check if invoked multiple times
        publisher.notifyObservers(testAccount);
        assertEquals("List-backed observers array will store duplicate references", 2, observerA.getNotificationCount());
    }

    @Test
    public void testReRegisteringAfterRemoval() {
        publisher.registerObserver(observerA);
        publisher.removeObserver(observerA);
        assertNull(observerA.getSubject());

        publisher.registerObserver(observerA);
        assertEquals(publisher, observerA.getSubject());

        publisher.notifyObservers(testAccount);
        assertEquals(1, observerA.getNotificationCount());
    }

    // --- Notification Mechanics Tests ---

    @Test
    public void testNotifySingleObserver() {
        publisher.registerObserver(observerA);
        publisher.notifyObservers(testAccount);

        assertEquals(1, observerA.getNotificationCount());
        assertEquals(testAccount, observerA.getLastReceivedAccount());
    }

    @Test
    public void testNotifyMultipleObservers() {
        publisher.registerObserver(observerA);
        publisher.registerObserver(observerB);

        publisher.notifyObservers(testAccount);

        assertEquals(1, observerA.getNotificationCount());
        assertEquals(1, observerB.getNotificationCount());
        assertEquals(testAccount, observerA.getLastReceivedAccount());
        assertEquals(testAccount, observerB.getLastReceivedAccount());
    }

    @Test
    public void testNotifyObserversWhenListIsEmpty() {
        try {
            publisher.notifyObservers(testAccount);
        } catch (Exception e) {
            fail("Notifying when no observers are registered should execute without exception: " + e.getMessage());
        }
    }

    @Test
    public void testNotifyObserversWithNullAccount() {
        publisher.registerObserver(observerA);
        publisher.notifyObservers(null);

        assertEquals(1, observerA.getNotificationCount());
        assertNull("Null account object should be passed through to observers", observerA.getLastReceivedAccount());
    }

    @Test
    public void testNotifyObserversMultipleTimesSequentially() {
        publisher.registerObserver(observerA);

        publisher.notifyObservers(testAccount);
        publisher.notifyObservers(testAccount);
        publisher.notifyObservers(testAccount);

        assertEquals(3, observerA.getNotificationCount());
    }

    @Test
    public void testDeregisteredObserverDoesNotReceiveNotifications() {
        publisher.registerObserver(observerA);
        publisher.registerObserver(observerB);

        publisher.removeObserver(observerA);

        publisher.notifyObservers(testAccount);

        assertEquals(0, observerA.getNotificationCount());
        assertEquals(1, observerB.getNotificationCount());
    }
}