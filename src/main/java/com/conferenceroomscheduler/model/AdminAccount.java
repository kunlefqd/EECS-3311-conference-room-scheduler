package com.conferenceroomscheduler.model;

public class AdminAccount extends Account {
    public AdminAccount() {
        super();
    }

    public AdminAccount(String accountId, String email, String password,
                        boolean universityAccount, boolean verified, String accountNumber) {
        super(accountId, email, password, "admin", universityAccount, verified, accountNumber);
    }
}