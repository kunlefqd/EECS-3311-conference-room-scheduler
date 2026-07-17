package com.conferenceroomscheduler.model;

public class AdminAccount extends Account {
    public AdminAccount() {
        super();
    }

    public AdminAccount(String accountId, String email, String password,
                        boolean universityAccount, boolean verified, String identifier) {
        super(accountId, email, password, "admin", universityAccount, verified, identifier);
    }
}
