package testAI_Assistant;

import static org.junit.Assert.*;

import org.junit.Test;

import com.conferenceroomscheduler.model.Account;

public class AccountAITest {

    @Test
    public void testDefaultConstructor() {
        Account account = new Account();
        assertNotNull(account);
    }

    @Test
    public void testParameterizedConstructorInitializesFields() {
        Account account = new Account(
                "1",
                "user@test.com",
                "password",
                "regular",
                true,
                false,
                "100");

        assertEquals("1", account.getAccountId());
        assertEquals("user@test.com", account.getEmail());
        assertEquals("password", account.getPassword());
        assertEquals("regular", account.getAccountType());
        assertTrue(account.isUniversityAccount());
        assertFalse(account.isVerified());
        assertEquals("100", account.getAccountNumber());
    }

    @Test
    public void testSetAccountId() {
        Account account = new Account();
        account.setAccountId("25");

        assertEquals("25", account.getAccountId());
    }

    @Test
    public void testSetEmail() {
        Account account = new Account();
        account.setEmail("new@test.com");

        assertEquals("new@test.com", account.getEmail());
    }

    @Test
    public void testSetPassword() {
        Account account = new Account();
        account.setPassword("newPassword");

        assertEquals("newPassword", account.getPassword());
    }

    @Test
    public void testSetAccountType() {
        Account account = new Account();
        account.setAccountType("faculty");

        assertEquals("faculty", account.getAccountType());
    }

    @Test
    public void testSetUniversityAccount() {
        Account account = new Account();
        account.setUniversityAccount(true);

        assertTrue(account.isUniversityAccount());

        account.setUniversityAccount(false);

        assertFalse(account.isUniversityAccount());
    }

    @Test
    public void testSetVerified() {
        Account account = new Account();
        account.setVerified(true);

        assertTrue(account.isVerified());

        account.setVerified(false);

        assertFalse(account.isVerified());
    }

    @Test
    public void testSetAccountNumber() {
        Account account = new Account();
        account.setAccountNumber("999");

        assertEquals("999", account.getAccountNumber());
    }

    @Test
    public void testBadgeIsCreatedByParameterizedConstructor() {
        Account account = new Account(
                "1",
                "user@test.com",
                "password",
                "regular",
                true,
                true,
                "100");

        assertNotNull(account.getBadge());
    }
}