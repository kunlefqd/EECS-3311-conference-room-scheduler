package testAI_Assistant;

import com.conferenceroomscheduler.model.Badge;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * AI-Generated Test Suite for Badge
 * EECS 3311 Deliverable 3 - Task 3
 */
public class BadgeAITest {

    private Badge standardBadge;
    private Badge unverifiedBadge;

    @Before
    public void setUp() {
        standardBadge = new Badge("user@yorku.ca", "ACC_1001", true);
        unverifiedBadge = new Badge("pending@yorku.ca", "ACC_1002", false);
    }

    // --- Constructor Tests ---

    @Test
    public void testConstructorWithVerifiedTrue() {
        assertEquals("user@yorku.ca", standardBadge.getEmail());
        assertEquals("ACC_1001", standardBadge.getAccountId());
        assertTrue("Badge should be verified", standardBadge.isVerified());
    }

    @Test
    public void testConstructorWithVerifiedFalse() {
        assertEquals("pending@yorku.ca", unverifiedBadge.getEmail());
        assertEquals("ACC_1002", unverifiedBadge.getAccountId());
        assertFalse("Badge should not be verified", unverifiedBadge.isVerified());
    }

    @Test
    public void testConstructorWithNullArguments() {
        Badge nullBadge = new Badge(null, null, false);
        assertNull("Email should accept null", nullBadge.getEmail());
        assertNull("AccountId should accept null", nullBadge.getAccountId());
        assertFalse("Verified should be false", nullBadge.isVerified());
    }

    @Test
    public void testConstructorWithEmptyStrings() {
        Badge emptyBadge = new Badge("", "", true);
        assertEquals("", emptyBadge.getEmail());
        assertEquals("", emptyBadge.getAccountId());
        assertTrue(emptyBadge.isVerified());
    }

    // --- Getter and Setter Tests ---

    @Test
    public void testSetAndGetEmailStandard() {
        standardBadge.setEmail("updated@yorku.ca");
        assertEquals("updated@yorku.ca", standardBadge.getEmail());
    }

    @Test
    public void testSetAndGetEmailNull() {
        standardBadge.setEmail(null);
        assertNull(standardBadge.getEmail());
    }

    @Test
    public void testSetAndGetEmailEmpty() {
        standardBadge.setEmail("");
        assertEquals("", standardBadge.getEmail());
    }

    @Test
    public void testSetAndGetAccountIdStandard() {
        standardBadge.setAccountId("ACC_9999");
        assertEquals("ACC_9999", standardBadge.getAccountId());
    }

    @Test
    public void testSetAndGetAccountIdNull() {
        standardBadge.setAccountId(null);
        assertNull(standardBadge.getAccountId());
    }

    @Test
    public void testSetAndGetAccountIdEmpty() {
        standardBadge.setAccountId("");
        assertEquals("", standardBadge.getAccountId());
    }

    @Test
    public void testSetAndGetVerifiedToggle() {
        assertTrue(standardBadge.isVerified());
        standardBadge.setVerified(false);
        assertFalse(standardBadge.isVerified());

        standardBadge.setVerified(true);
        assertTrue(standardBadge.isVerified());
    }
}