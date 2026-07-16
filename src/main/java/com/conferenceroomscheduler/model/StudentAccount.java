package com.conferenceroomscheduler.model;

public class StudentAccount extends Account {
    public StudentAccount() {
        super();
    }

    public StudentAccount(String accountId, String email, String password,
                          boolean universityAccount, boolean verified, String identifier) {
        super(accountId, email, password, "student", universityAccount, verified, identifier);
    }
}
