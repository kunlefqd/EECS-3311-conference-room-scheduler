package com.conferenceroomscheduler.patterns;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.conferenceroomscheduler.model.Account;
import com.conferenceroomscheduler.model.AdminAccount;
import com.conferenceroomscheduler.model.FacultyAccount;
import com.conferenceroomscheduler.model.PartnerAccount;
import com.conferenceroomscheduler.model.StaffAccount;
import com.conferenceroomscheduler.model.StudentAccount;
import com.conferenceroomscheduler.patterns.AccountFactory;
import com.conferenceroomscheduler.patterns.AdminFactory;
import com.conferenceroomscheduler.patterns.FacultyFactory;
import com.conferenceroomscheduler.patterns.PartnerFactory;
import com.conferenceroomscheduler.patterns.StaffFactory;
import com.conferenceroomscheduler.patterns.StudentFactory;

public class AccountFactoryTest {

    @Test
    public void testStudentFactoryViaAccountFactory() {
        AccountFactory factory = new StudentFactory();
        Account account = factory.createAccount("1","a","p","x",true,true,"100");
        assertTrue(account instanceof StudentAccount);
    }

    @Test
    public void testStaffFactoryViaAccountFactory() {
        AccountFactory factory = new StaffFactory();
        Account account = factory.createAccount("1","a","p","x",true,true,"100");
        assertTrue(account instanceof StaffAccount);
    }

    @Test
    public void testFacultyFactoryViaAccountFactory() {
        AccountFactory factory = new FacultyFactory();
        Account account = factory.createAccount("1","a","p","x",true,true,"100");
        assertTrue(account instanceof FacultyAccount);
    }

    @Test
    public void testPartnerFactoryViaAccountFactory() {
        AccountFactory factory = new PartnerFactory();
        Account account = factory.createAccount("1","a","p","x",true,true,"100");
        assertTrue(account instanceof PartnerAccount);
    }

    @Test
    public void testAdminFactoryViaAccountFactory() {
        AccountFactory factory = new AdminFactory();
        Account account = factory.createAccount("1","a","p","x",true,true,"100");
        assertTrue(account instanceof AdminAccount);
    }

    @Test
    public void testCreateAccountNotNull() {
        AccountFactory factory = new StudentFactory();
        assertNotNull(factory.createAccount("1","a","p","x",true,true,"100"));
    }

    @Test
    public void testPolymorphicAccountId() {
        AccountFactory factory = new StaffFactory();
        Account account = factory.createAccount("42","a","p","x",true,true,"100");
        assertEquals("42", account.getAccountId());
    }

    @Test
    public void testPolymorphicEmail() {
        AccountFactory factory = new FacultyFactory();
        Account account = factory.createAccount("1","poly@test.com","p","x",true,true,"100");
        assertEquals("poly@test.com", account.getEmail());
    }

    @Test
    public void testDifferentFactoriesDifferentTypes() {
        Account student = new StudentFactory().createAccount("1","a","p","x",true,true,"100");
        Account staff = new StaffFactory().createAccount("1","a","p","x",true,true,"100");
        assertEquals("student", student.getAccountType());
        assertEquals("staff", staff.getAccountType());
    }

    @Test
    public void testAllFactoriesExtendAccountFactory() {
        assertTrue(new StudentFactory() instanceof AccountFactory);
        assertTrue(new StaffFactory() instanceof AccountFactory);
        assertTrue(new FacultyFactory() instanceof AccountFactory);
        assertTrue(new PartnerFactory() instanceof AccountFactory);
        assertTrue(new AdminFactory() instanceof AccountFactory);
    }
}
