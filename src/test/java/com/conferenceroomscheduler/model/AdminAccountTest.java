package com.conferenceroomscheduler.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.conferenceroomscheduler.model.Account;
import com.conferenceroomscheduler.model.AdminAccount;

public class AdminAccountTest {

    @Test
    public void testDefaultConstructor() {
        AdminAccount account = new AdminAccount();
        assertNotNull(account);
    }

    @Test
    public void testAccountId() {
        AdminAccount account = new AdminAccount("1","a","p",true,true,"100");
        assertEquals("1", account.getAccountId());
    }

    @Test
    public void testEmail() {
        AdminAccount account = new AdminAccount("1","email@test.com","p",true,true,"100");
        assertEquals("email@test.com", account.getEmail());
    }

    @Test
    public void testPassword() {
        AdminAccount account = new AdminAccount("1","a","password",true,true,"100");
        assertEquals("password", account.getPassword());
    }

    @Test
    public void testAccountTypeIsAdmin() {
        AdminAccount account = new AdminAccount("1","a","p",true,true,"100");
        assertEquals("admin", account.getAccountType());
    }

    @Test
    public void testUniversityAccount() {
        AdminAccount account = new AdminAccount("1","a","p",true,true,"100");
        assertTrue(account.isUniversityAccount());
    }

    @Test
    public void testVerified() {
        AdminAccount account = new AdminAccount("1","a","p",true,false,"100");
        assertFalse(account.isVerified());
    }

    @Test
    public void testAccountNumber() {
        AdminAccount account = new AdminAccount("1","a","p",true,true,"999");
        assertEquals("999", account.getAccountNumber());
    }

    @Test
    public void testBadgeCreated() {
        AdminAccount account = new AdminAccount("1","a","p",true,true,"999");
        assertNotNull(account.getBadge());
    }

    @Test
    public void testInstanceOfAccount() {
        AdminAccount account = new AdminAccount();
        assertTrue(account instanceof Account);
    }
}