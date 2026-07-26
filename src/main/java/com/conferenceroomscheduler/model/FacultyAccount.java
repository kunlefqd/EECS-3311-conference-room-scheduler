package com.conferenceroomscheduler.model;

public class FacultyAccount extends Account {
    public FacultyAccount() {
        super();
    }

    public FacultyAccount(String accountId, String email, String password,
                          boolean universityAccount, boolean verified, String accountNumber) {
        super(accountId, email, password, "faculty", universityAccount, verified, accountNumber);
    }
}
