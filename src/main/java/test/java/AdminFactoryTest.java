package test.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.conferenceroomscheduler.model.*;
import com.conferenceroomscheduler.patterns.*;

public class AdminFactoryTest {

    private AdminFactory factory;

    @Before
    public void setUp() {
        factory = new AdminFactory();
    }

    @Test
    public void testCreateAccountNotNull() {
        assertNotNull(factory.createAccount("1","a","p","student",true,true,"100"));
    }

    @Test
    public void testReturnsAdminAccount() {
        Account account = factory.createAccount("1","a","p","student",true,true,"100");
        assertTrue(account instanceof AdminAccount);
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
    public void testAccountTypeAlwaysAdmin() {
        Account account = factory.createAccount("1","a","p","student",true,true,"100");
        assertEquals("admin", account.getAccountType());
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
}