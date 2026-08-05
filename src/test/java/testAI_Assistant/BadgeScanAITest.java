package testAI_Assistant;

import com.conferenceroomscheduler.model.BadgeScan;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * AI-Generated Test Suite for BadgeScan
 * EECS 3311 Deliverable 3 - Task 3
 */
public class BadgeScanAITest {

    private BadgeScan parameterizedScan;
    private BadgeScan defaultScan;

    @Before
    public void setUp() {
        parameterizedScan = new BadgeScan("BADGE_100", "ROOM_301", true);
        defaultScan = new BadgeScan();
    }

    // --- Constructor Tests ---

    @Test
    public void testDefaultConstructorInitializesFieldsToDefaults() {
        assertNull("Default constructor badgeId should be null", defaultScan.getBadgeId());
        assertNull("Default constructor roomId should be null", defaultScan.getRoomId());
        assertFalse("Default constructor verified should be false", defaultScan.isVerified());
    }

    @Test
    public void testParameterizedConstructorWithValidData() {
        assertEquals("BADGE_100", parameterizedScan.getBadgeId());
        assertEquals("ROOM_301", parameterizedScan.getRoomId());
        assertTrue(parameterizedScan.isVerified());
    }

    @Test
    public void testParameterizedConstructorWithFalseVerified() {
        BadgeScan unverifiedScan = new BadgeScan("BADGE_101", "ROOM_302", false);
        assertEquals("BADGE_101", unverifiedScan.getBadgeId());
        assertEquals("ROOM_302", unverifiedScan.getRoomId());
        assertFalse(unverifiedScan.isVerified());
    }

    @Test
    public void testParameterizedConstructorWithNullValues() {
        BadgeScan nullScan = new BadgeScan(null, null, false);
        assertNull(nullScan.getBadgeId());
        assertNull(nullScan.getRoomId());
        assertFalse(nullScan.isVerified());
    }

    // --- Getter and Setter Tests ---

    @Test
    public void testSetAndGetBadgeIdStandardString() {
        defaultScan.setBadgeId("BADGE_555");
        assertEquals("BADGE_555", defaultScan.getBadgeId());
    }

    @Test
    public void testSetAndGetBadgeIdEmptyString() {
        parameterizedScan.setBadgeId("");
        assertEquals("", parameterizedScan.getBadgeId());
    }

    @Test
    public void testSetAndGetBadgeIdNull() {
        parameterizedScan.setBadgeId(null);
        assertNull(parameterizedScan.getBadgeId());
    }

    @Test
    public void testSetAndGetRoomIdStandardString() {
        defaultScan.setRoomId("ROOM_999");
        assertEquals("ROOM_999", defaultScan.getRoomId());
    }

    @Test
    public void testSetAndGetRoomIdEmptyString() {
        parameterizedScan.setRoomId("");
        assertEquals("", parameterizedScan.getRoomId());
    }

    @Test
    public void testSetAndGetRoomIdNull() {
        parameterizedScan.setRoomId(null);
        assertNull(parameterizedScan.getRoomId());
    }

    @Test
    public void testSetAndGetVerifiedToggleTrueToFalse() {
        assertTrue(parameterizedScan.isVerified());
        parameterizedScan.setVerified(false);
        assertFalse(parameterizedScan.isVerified());
    }

    @Test
    public void testSetAndGetVerifiedToggleFalseToTrue() {
        assertFalse(defaultScan.isVerified());
        defaultScan.setVerified(true);
        assertTrue(defaultScan.isVerified());
    }
}