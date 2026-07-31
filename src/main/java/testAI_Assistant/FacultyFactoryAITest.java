package testAI_Assistant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.conferenceroomscheduler.model.Account;
import com.conferenceroomscheduler.model.FacultyAccount;
import com.conferenceroomscheduler.patterns.AccountFactory;
import com.conferenceroomscheduler.patterns.FacultyFactory;

public class FacultyFactoryAITest {

    private FacultyFactory factory;

    @Before
    public void setUp() {
        factory = new FacultyFactory();
    }

    @Test
    public void testCreateAccountNotNull() {
        assertNotNull(factory.createAccount("1", "prof@yorku.ca", "p", "faculty", true, true, "100"));
    }

    @Test
    public void testReturnsFacultyAccount() {
        Account account = factory.createAccount("1", "prof@yorku.ca", "p", "faculty", true, true, "100");
        assertTrue(account instanceof FacultyAccount);
    }

    @Test
    public void testAccountId() {
        Account account = factory.createAccount("F5", "prof@yorku.ca", "p", "faculty", true, true, "100");
        assertEquals("F5", account.getAccountId());
    }

    @Test
    public void testEmail() {
        Account account = factory.createAccount("1", "dean@yorku.ca", "p", "faculty", true, true, "100");
        assertEquals("dean@yorku.ca", account.getEmail());
    }

    @Test
    public void testPassword() {
        Account account = factory.createAccount("1", "prof@yorku.ca", "facPass", "faculty", true, true, "100");
        assertEquals("facPass", account.getPassword());
    }

    @Test
    public void testAccountTypeAlwaysFaculty() {
        Account account = factory.createAccount("1", "prof@yorku.ca", "p", "partner", true, true, "100");
        assertEquals("faculty", account.getAccountType());
    }

    @Test
    public void testUniversityAccount() {
        Account account = factory.createAccount("1", "prof@yorku.ca", "p", "faculty", true, true, "100");
        assertTrue(account.isUniversityAccount());
    }

    @Test
    public void testVerifiedFalseBoundary() {
        Account account = factory.createAccount("1", "prof@yorku.ca", "p", "faculty", true, false, "100");
        assertFalse(account.isVerified());
    }

    @Test
    public void testAccountNumber() {
        Account account = factory.createAccount("1", "prof@yorku.ca", "p", "faculty", true, true, "888");
        assertEquals("888", account.getAccountNumber());
    }

    @Test
    public void testBadgeCreated() {
        Account account = factory.createAccount("1", "prof@yorku.ca", "p", "faculty", true, true, "100");
        assertNotNull(account.getBadge());
    }

    @Test
    public void testExtendsAccountFactory() {
        assertTrue(factory instanceof AccountFactory);
    }

    @Test
    public void testNullAccountNumberBoundary() {
        Account account = factory.createAccount("1", "prof@yorku.ca", "p", "faculty", true, true, null);
        assertEquals(null, account.getAccountNumber());
    }

    @Test
    public void testCreateFacultyMemberAlias() {
        Account account = factory.createFacultyMember("1", "prof@yorku.ca", "p", true, true, "100");
        assertNotNull(account);
    }

    @Test
    public void testVerifiedWrongExpectation() {
        Account account = factory.createAccount("1", "prof@yorku.ca", "p", "faculty", true, true, "100");
        assertFalse(account.isVerified());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAccountTypeMismatchRejected() {
        factory.createAccount("1", "prof@yorku.ca", "p", "student", true, true, "100");
    }
}
