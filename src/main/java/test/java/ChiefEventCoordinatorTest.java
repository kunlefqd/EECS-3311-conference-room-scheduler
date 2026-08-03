package test.java;

import com.conferenceroomscheduler.model.Account;
import com.conferenceroomscheduler.patterns.ChiefEventCoordinator;
import com.conferenceroomscheduler.patterns.RoomSensorObserver;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChiefEventCoordinatorTest {

    private ChiefEventCoordinator coordinator;
    private TestObserver observer;

    private static class TestObserver implements RoomSensorObserver {
        String message;
        int updates = 0;

        @Override
        public void update(String message) {
            this.message = message;
            updates++;
        }
    }

    @Before
    public void setUp() {
        coordinator = ChiefEventCoordinator.getInstance();
        observer = new TestObserver();

        // Ensure observer isn't already registered
        coordinator.removeObserver(observer);
    }

    @Test
    public void getInstance() {
        assertNotNull(ChiefEventCoordinator.getInstance());
        assertSame(ChiefEventCoordinator.getInstance(),
                ChiefEventCoordinator.getInstance());
    }

    @Test
    public void generateAdminAccount() {
        Account admin = coordinator.generateAdminAccount(
                "A1",
                "admin@test.com",
                "password"
        );

        assertNotNull(admin);
        assertEquals("admin", admin.getAccountType());
        assertTrue(admin.getAccountNumber().startsWith("ADMIN-"));
    }

    @Test
    public void registerObserver() {
        coordinator.registerObserver(observer);

        coordinator.notifyObservers("Hello");

        assertEquals(1, observer.updates);
        assertEquals("Hello", observer.message);
    }

    @Test
    public void removeObserver() {
        coordinator.registerObserver(observer);
        coordinator.removeObserver(observer);

        coordinator.notifyObservers("Hello");

        assertEquals(0, observer.updates);
        assertNull(observer.message);
    }

    @Test
    public void notifyObservers() {
        coordinator.registerObserver(observer);

        coordinator.notifyObservers("Testing notification");

        assertEquals("Testing notification", observer.message);
        assertEquals(1, observer.updates);
    }

    @Test
    public void multipleObserversReceiveNotification() {
        TestObserver observer2 = new TestObserver();

        coordinator.registerObserver(observer);
        coordinator.registerObserver(observer2);

        coordinator.notifyObservers("Broadcast");

        assertEquals("Broadcast", observer.message);
        assertEquals("Broadcast", observer2.message);
    }

    @Test
    public void generateAdminAccountNotifiesObserver() {
        coordinator.registerObserver(observer);

        coordinator.generateAdminAccount(
                "A2",
                "test@test.com",
                "pass"
        );

        assertEquals(1, observer.updates);
        assertTrue(observer.message.contains("test@test.com"));
    }

    @Test
    public void generateAdminAccountsHaveDifferentNumbers() {
        Account a1 = coordinator.generateAdminAccount(
                "A3",
                "one@test.com",
                "pass"
        );

        Account a2 = coordinator.generateAdminAccount(
                "A4",
                "two@test.com",
                "pass"
        );

        assertNotEquals(a1.getAccountNumber(), a2.getAccountNumber());
    }

    @Test
    public void notifyObserversWithoutObservers() {
        coordinator.notifyObservers("No observers");
    }

    @Test
    public void removeUnregisteredObserver() {
        coordinator.removeObserver(observer);

        coordinator.notifyObservers("Still works");

        assertEquals(0, observer.updates);
    }
}