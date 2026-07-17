package com.conferenceroomscheduler.model;

public class StaffAccount extends Account {
    public StaffAccount() {
        super();
    }

    public StaffAccount(String accountId, String email, String password,
                        boolean universityAccount, boolean verified, String identifier) {
        super(accountId, email, password, "staff", universityAccount, verified, identifier);
    }
}
