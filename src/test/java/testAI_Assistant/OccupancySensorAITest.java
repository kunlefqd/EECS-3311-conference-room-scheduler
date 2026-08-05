package testAI_Assistant;

import com.conferenceroomscheduler.model.Account;
import com.conferenceroomscheduler.model.Badge;
import com.conferenceroomscheduler.model.OccupancySensor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * AI-Generated Test Suite for OccupancySensor
 * EECS 3311 Deliverable 3 - Task 3
 */
public class OccupancySensorAITest {

    private OccupancySensor sensorOccupiedNotDetected;
    private OccupancySensor sensorOccupiedAndDetected;
    private OccupancySensor sensorUnoccupied;
    private Account verifiedAccount;
    private Account unverifiedAccount;

    @Before
    public void setUp() {
        // Sensor states: roomId, occupied, isDetected
        sensorOccupiedNotDetected = new OccupancySensor("ROOM_A", true, false);
        sensorOccupiedAndDetected = new OccupancySensor("ROOM_B", true, true);
        sensorUnoccupied = new OccupancySensor("ROOM_C", false, false);

        verifiedAccount = new Account(
                "ACC_101",
                "valid.user@yorku.ca",
                "password123",
                "student",
                true,
                true,
                "NUM_101"
        );

        unverifiedAccount = new Account(
                "ACC_102",
                "guest.user@external.com",
                "password456",
                "guest",
                false,
                false,
                "NUM_102"
        );
    }

    // --- Constructor & Getter Tests ---

    @Test
    public void testConstructorAndInitialState() {
        assertEquals("ROOM_A", sensorOccupiedNotDetected.getRoomId());
        assertTrue(sensorOccupiedNotDetected.isOccupied());
        assertFalse(sensorOccupiedNotDetected.isDetected());
        assertNull(sensorOccupiedNotDetected.getLastEvent());
    }

    // --- detectOccupancy Method Branch Tests ---

    @Test
    public void testDetectOccupancyWhenOccupiedAndNotDetected() {
        boolean result = sensorOccupiedNotDetected.detectOccupancy(verifiedAccount);

        assertTrue("Should return true when room is occupied", result);
        assertTrue("Sensor state should switch to detected", sensorOccupiedNotDetected.isDetected());
        assertNotNull("Last event should be logged", sensorOccupiedNotDetected.getLastEvent());
        assertTrue("Last event should contain occupancy confirmation",
                sensorOccupiedNotDetected.getLastEvent().contains("Occupancy verified for room with ID ROOM_A."));
        assertTrue("Last event should append badge details",
                sensorOccupiedNotDetected.getLastEvent().contains("Verified badge detected for valid.user@yorku.ca."));
    }

    @Test
    public void testDetectOccupancyWhenOccupiedAndAlreadyDetected() {
        boolean result = sensorOccupiedAndDetected.detectOccupancy(verifiedAccount);

        assertTrue("Should return true for occupied room", result);
        assertTrue("Sensor state remains detected", sensorOccupiedAndDetected.isDetected());
        assertNull("Last event should remain null if branch conditions (isOccupied && !isDetected) aren't met",
                sensorOccupiedAndDetected.getLastEvent());
    }

    @Test
    public void testDetectOccupancyWhenUnoccupied() {
        boolean result = sensorUnoccupied.detectOccupancy(verifiedAccount);

        assertFalse("Should return false when room is unoccupied", result);
        assertFalse("Sensor state should remain undetected", sensorUnoccupied.isDetected());
        assertNull("Last event should remain null when unoccupied", sensorUnoccupied.getLastEvent());
    }

    @Test
    public void testDetectOccupancyWithUnverifiedAccount() {
        boolean result = sensorOccupiedNotDetected.detectOccupancy(unverifiedAccount);

        assertTrue("detectOccupancy returns isOccupied status regardless of badge verification", result);
        assertTrue("Sensor marks as detected", sensorOccupiedNotDetected.isDetected());
        assertTrue("Last event records unverified badge status",
                sensorOccupiedNotDetected.getLastEvent().contains("Unverified badge detected for guest.user@external.com."));
    }

    // --- scanIdBadge Method Tests ---

    @Test
    public void testScanIdBadgeVerified() {
        Badge badge = verifiedAccount.getBadge();
        boolean verified = sensorOccupiedNotDetected.scanIdBadge(badge);

        assertTrue("Should return true for verified badge", verified);
        assertTrue("Last event string contains verified badge message",
                sensorOccupiedNotDetected.getLastEvent().contains("Verified badge detected for valid.user@yorku.ca."));
    }

    @Test
    public void testScanIdBadgeUnverified() {
        Badge badge = unverifiedAccount.getBadge();
        boolean verified = sensorOccupiedNotDetected.scanIdBadge(badge);

        assertFalse("Should return false for unverified badge", verified);
        assertTrue("Last event string contains unverified badge message",
                sensorOccupiedNotDetected.getLastEvent().contains("Unverified badge detected for guest.user@external.com."));
    }

    @Test
    public void testScanIdBadgeAppendsToExistingLastEvent() {
        // Pre-populate lastEvent
        sensorOccupiedNotDetected.detectOccupancy(verifiedAccount);
        String initialEvent = sensorOccupiedNotDetected.getLastEvent();

        // Perform standard badge scan on top
        sensorOccupiedNotDetected.scanIdBadge(unverifiedAccount.getBadge());
        String secondEvent = sensorOccupiedNotDetected.getLastEvent();

        assertTrue("Second event output must contain initial event log", secondEvent.contains(initialEvent));
        assertTrue("Second event output must append second scan info on new line",
                secondEvent.contains("Unverified badge detected for guest.user@external.com."));
    }

    // --- File Creation & I/O Boundary Tests ---

    @Test
    public void testSendDataExecutesWithoutThrowingException() {
        Badge badge = new Badge("file.test@yorku.ca", "ACC_FILE", true);

        try {
            boolean scanResult = sensorOccupiedNotDetected.scanIdBadge(badge);
            assertTrue(scanResult);
        } catch (Exception e) {
            fail("scanIdBadge and underlying sendData should handle IOException gracefully without throwing: " + e.getMessage());
        }
    }
}