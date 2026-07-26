package com.conferenceroomscheduler.patterns;

import com.conferenceroomscheduler.model.Account;
import com.conferenceroomscheduler.model.FacultyAccount;

public class FacultyFactory extends AccountFactory {
    @Override
    protected Account createConcreteAccount(String accountId, String email, String password,
                                            String accountType, boolean universityAccount,
                                            boolean verified, String accountNumber) {
        return new FacultyAccount(accountId, email, password, universityAccount, verified, accountNumber);
    }
}
