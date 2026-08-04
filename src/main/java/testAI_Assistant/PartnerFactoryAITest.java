package testAI_Assistant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.conferenceroomscheduler.model.Account;
import com.conferenceroomscheduler.model.PartnerAccount;
import com.conferenceroomscheduler.patterns.AccountFactory;
import com.conferenceroomscheduler.patterns.PartnerFactory;

public class PartnerFactoryAITest {

    private PartnerFactory factory;

    @Before
    public void setUp() {
        factory = new PartnerFactory();
    }

    @Test
    public void testCreateAccountNotNull() {
        assertNotNull(factory.createAccount("1", "p@partner.com", "p", "partner", false, true, "100"));
    }

    @Test
    public void testReturnsPartnerAccount() {
        Account account = factory.createAccount("1", "p@partner.com", "p", "partner", false, true, "100");
        assertTrue(account instanceof PartnerAccount);
    }

    @Test
    public void testAccountId() {
        Account account = factory.createAccount("P3", "p@partner.com", "p", "partner", false, true, "100");
        assertEquals("P3", account.getAccountId());
    }

    @Test
    public void testEmail() {
        Account account = factory.createAccount("1", "ops@partner.com", "p", "partner", false, true, "100");
        assertEquals("ops@partner.com", account.getEmail());
    }

    @Test
    public void testPassword() {
        Account account = factory.createAccount("1", "p@partner.com", "partnerPass", "partner", false, true, "100");
        assertEquals("partnerPass", account.getPassword());
    }

    @Test
    public void testAccountTypeAlwaysPartner() {
        Account account = factory.createAccount("1", "p@partner.com", "p", "staff", false, true, "100");
        assertEquals("partner", account.getAccountType());
    }

    @Test
    public void testNonUniversityPartner() {
        Account account = factory.createAccount("1", "p@partner.com", "p", "partner", false, true, "100");
        assertFalse(account.isUniversityAccount());
    }

    @Test
    public void testUniversityPartnerAllowed() {
        Account account = factory.createAccount("1", "p@yorku.ca", "p", "partner", true, true, "100");
        assertTrue(account.isUniversityAccount());
    }

    @Test
    public void testVerified() {
        Account account = factory.createAccount("1", "p@partner.com", "p", "partner", false, false, "100");
        assertFalse(account.isVerified());
    }

    @Test
    public void testAccountNumber() {
        Account account = factory.createAccount("1", "p@partner.com", "p", "partner", false, true, "999");
        assertEquals("999", account.getAccountNumber());
    }

    @Test
    public void testBadgeCreated() {
        Account account = factory.createAccount("1", "p@partner.com", "p", "partner", false, true, "100");
        assertNotNull(account.getBadge());
    }

    @Test
    public void testExtendsAccountFactory() {
        assertTrue(factory instanceof AccountFactory);
    }

}
