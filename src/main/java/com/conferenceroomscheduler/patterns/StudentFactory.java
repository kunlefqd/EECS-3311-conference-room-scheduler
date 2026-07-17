package com.conferenceroomscheduler.patterns;

import com.conferenceroomscheduler.model.Account;
import com.conferenceroomscheduler.model.StudentAccount;

public class StudentFactory extends AccountFactory {
    @Override
    protected Account createConcreteAccount(String accountId, String email, String password,
                                            String accountType, boolean universityAccount,
                                            boolean verified, String identifier) {
        return new StudentAccount(accountId, email, password, universityAccount, verified, identifier);
    }
}
