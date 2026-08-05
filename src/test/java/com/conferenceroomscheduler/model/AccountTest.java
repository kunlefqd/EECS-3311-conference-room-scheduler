package com.conferenceroomscheduler.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.conferenceroomscheduler.model.Account;
import com.conferenceroomscheduler.model.Account;

public class AccountTest {

    @Test
    public void testDefaultConstructor() {
        Account account = new Account();
        assertNotNull(account);
    }

    @Test
    public void testAccountId() {
        Account account = new Account("1","a","p",true,true,"100");
        assertEquals("1", account.getAccountId());
    }

    @Test
    public void testEmail() {
        Account account = new Account("1","email@test.com","p",true,true,"100");
        assertEquals("email@test.com", account.getEmail());
    }

    @Test
    public void testPassword() {
        Account account = new Account("1","a","password",true,true,"100");
        assertEquals("password", account.getPassword());
    }

    @Test
    public void testAccountTypeIsBaseAccount() {
        Account account = new Account("1","a","p",true,true,"100");
        assertEquals("admin", account.getAccountType());
    }

    @Test
    public void testUniversityAccount() {
        Account account = new Account("1","a","p",true,true,"100");
        assertTrue(account.isUniversityAccount());
    }

    @Test
    public void testVerified() {
        Account account = new Account("1","a","p",true,false,"100");
        assertFalse(account.isVerified());
    }

    @Test
    public void testAccountNumber() {
        Account account = new Account("1","a","p",true,true,"999");
        assertEquals("999", account.getAccountNumber());
    }

    @Test
    public void testBadgeCreated() {
        Account account = new Account("1","a","p",true,true,"999");
        assertNotNull(account.getBadge());
    }

    @Test
    public void testStudentInstanceOfAccount() {
        StudentAccount account = new StudentAccount();
        assertTrue(account instanceof Account);
    }

    @Test
    public void testStaffInstanceOfAccount() {
        StaffAccount account = new StaffAccount();
        assertTrue(account instanceof Account);
    }

    @Test
    public void testFacultyInstanceOfAccount() {
        FacultyAccount account = new FacultyAccount();
        assertTrue(account instanceof Account);
    }
    
    @Test
    public void testPartnerInstanceOfAccount() {
        PartnerAccount account = new PartnerAccount();
        assertTrue(account instanceof Account);
    }

    
}
