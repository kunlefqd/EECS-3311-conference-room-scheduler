package com.conferenceroomscheduler.model;

public class PartnerAccount extends Account {
    public PartnerAccount() {
        super();
    }

    public PartnerAccount(String accountId, String email, String password,
                          boolean universityAccount, boolean verified, String accountNumber) {
        super(accountId, email, password, "partner", universityAccount, verified, accountNumber);
    }
}
