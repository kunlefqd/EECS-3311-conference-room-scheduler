package com.conferenceroomscheduler.model;

import com.conferenceroomscheduler.model.Badge;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BadgeTest {

    private Badge badge;

    @Before
    public void setUp() {
        badge = new Badge("student@yorku.ca", "ACC001", true);
    }

    @Test
    public void testConstructorSetsEmail() {
        assertEquals("student@yorku.ca", badge.getEmail());
    }

    @Test
    public void testConstructorSetsAccountId() {
        assertEquals("ACC001", badge.getAccountId());
    }

    @Test
    public void testConstructorSetsVerified() {
        assertTrue(badge.isVerified());
    }

    @Test
    public void testSetEmail() {
        badge.setEmail("new@yorku.ca");

        assertEquals("new@yorku.ca", badge.getEmail());
    }

    @Test
    public void testSetAccountId() {
        badge.setAccountId("ACC999");

        assertEquals("ACC999", badge.getAccountId());
    }

    @Test
    public void testSetVerifiedTrue() {
        badge.setVerified(true);

        assertTrue(badge.isVerified());
    }

    @Test
    public void testSetVerifiedFalse() {
        badge.setVerified(false);

        assertFalse(badge.isVerified());
    }

    @Test
    public void testSetEmailToNull() {
        badge.setEmail(null);

        assertNull(badge.getEmail());
    }

    @Test
    public void testSetAccountIdToNull() {
        badge.setAccountId(null);

        assertNull(badge.getAccountId());
    }

    @Test
    public void testCreateDifferentBadge() {
        Badge another = new Badge("admin@yorku.ca", "ADMIN001", false);

        assertEquals("admin@yorku.ca", another.getEmail());
        assertEquals("ADMIN001", another.getAccountId());
        assertFalse(another.isVerified());
    }
}