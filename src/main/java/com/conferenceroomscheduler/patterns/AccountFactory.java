package com.conferenceroomscheduler.patterns;

import com.conferenceroomscheduler.model.Account;

public abstract class AccountFactory {
    public final Account createAccount(String accountId, String email, String password,
                                       String accountType, boolean universityAccount,
                                       boolean verified, String accountNumber) {
        return createConcreteAccount(accountId, email, password, accountType,
                universityAccount, verified, accountNumber);
    }

    protected abstract Account createConcreteAccount(String accountId, String email, String password,
                                                     String accountType, boolean universityAccount,
                                                     boolean verified, String accountNumber);
}
