package com.conferenceroomscheduler.patterns;

import com.conferenceroomscheduler.model.Account;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckInPublisherTest {

    private CheckInPublisher publisher;
    private TestObserver observer1;
    private TestObserver observer2;
    private Account account;

    /**
     * Test observer used only for unit testing.
     */
    private static class TestObserver extends CheckInObserver {

        int detectCalls = 0;
        Account lastAccount = null;

        public TestObserver(String roomId) {
            super(roomId, false, false);
        }

        @Override
        public boolean detectOccupancy(Account account) {
            detectCalls++;
            lastAccount = account;
            return true;
        }
    }

    @Before
    public void setUp() {
        publisher = new CheckInPublisher();
        observer1 = new TestObserver("R101");
        observer2 = new TestObserver("R102");
        account = new Account();
    }

    @Test
    public void testRegisterObserverSetsSubject() {
        publisher.registerObserver(observer1);

        assertEquals(publisher, observer1.getSubject());
    }

    @Test
    public void testRemoveObserverClearsSubject() {
        publisher.registerObserver(observer1);
        publisher.removeObserver(observer1);

        assertNull(observer1.getSubject());
    }

    @Test
    public void testNotifyObserverCallsDetectOccupancy() {
        publisher.registerObserver(observer1);

        publisher.notifyObservers(account);

        assertEquals(1, observer1.detectCalls);
    }

    @Test
    public void testNotifyObserverPassesCorrectAccount() {
        publisher.registerObserver(observer1);

        publisher.notifyObservers(account);

        assertEquals(account, observer1.lastAccount);
    }

    @Test
    public void testMultipleObserversAreNotified() {
        publisher.registerObserver(observer1);
        publisher.registerObserver(observer2);

        publisher.notifyObservers(account);

        assertEquals(1, observer1.detectCalls);
        assertEquals(1, observer2.detectCalls);
    }

    @Test
    public void testRemovedObserverIsNotNotified() {
        publisher.registerObserver(observer1);
        publisher.removeObserver(observer1);

        publisher.notifyObservers(account);

        assertEquals(0, observer1.detectCalls);
    }

    @Test
    public void testNotifyWithoutObservers() {
        publisher.notifyObservers(account);
    }

    @Test
    public void testObserverCanBeRegisteredAgain() {
        publisher.registerObserver(observer1);
        publisher.removeObserver(observer1);
        publisher.registerObserver(observer1);

        assertEquals(publisher, observer1.getSubject());
    }

    @Test
    public void testNotifyWithNullAccount() {
        publisher.registerObserver(observer1);

        publisher.notifyObservers(null);

        assertNull(observer1.lastAccount);
        assertEquals(1, observer1.detectCalls);
    }

    @Test
    public void testTwoNotificationsCallObserverTwice() {
        publisher.registerObserver(observer1);

        publisher.notifyObservers(account);
        publisher.notifyObservers(account);

        assertEquals(2, observer1.detectCalls);
    }
}