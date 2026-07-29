package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.conferenceroomscheduler.model.Account;
import com.conferenceroomscheduler.model.StaffAccount;
import com.conferenceroomscheduler.patterns.AccountFactory;
import com.conferenceroomscheduler.patterns.StaffFactory;

public class StaffFactoryTest {

    private StaffFactory factory;

    @Before
    public void setUp() {
        factory = new StaffFactory();
    }

    @Test
    public void testCreateAccountNotNull() {
        assertNotNull(factory.createAccount("1","a","p","student",true,true,"100"));
    }

    @Test
    public void testReturnsStaffAccount() {
        Account account = factory.createAccount("1","a","p","student",true,true,"100");
        assertTrue(account instanceof StaffAccount);
    }

    @Test
    public void testAccountId() {
        Account account = factory.createAccount("123","a","p","student",true,true,"100");
        assertEquals("123", account.getAccountId());
    }

    @Test
    public void testEmail() {
        Account account = factory.createAccount("1","abc@test.com","p","student",true,true,"100");
        assertEquals("abc@test.com", account.getEmail());
    }

    @Test
    public void testPassword() {
        Account account = factory.createAccount("1","a","secret","student",true,true,"100");
        assertEquals("secret", account.getPassword());
    }

    @Test
    public void testAccountTypeAlwaysStaff() {
        Account account = factory.createAccount("1","a","p","student",true,true,"100");
        assertEquals("staff", account.getAccountType());
    }

    @Test
    public void testUniversityAccount() {
        Account account = factory.createAccount("1","a","p","x",true,true,"100");
        assertTrue(account.isUniversityAccount());
    }

    @Test
    public void testVerified() {
        Account account = factory.createAccount("1","a","p","x",true,false,"100");
        assertFalse(account.isVerified());
    }

    @Test
    public void testAccountNumber() {
        Account account = factory.createAccount("1","a","p","x",true,true,"555");
        assertEquals("555", account.getAccountNumber());
    }

    @Test
    public void testBadgeCreated() {
        Account account = factory.createAccount("1","a","p","x",true,true,"555");
        assertNotNull(account.getBadge());
    }

    @Test
    public void testExtendsAccountFactory() {
        assertTrue(factory instanceof AccountFactory);
    }
}
