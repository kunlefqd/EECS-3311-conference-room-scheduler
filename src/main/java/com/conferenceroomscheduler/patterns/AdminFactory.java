package com.conferenceroomscheduler.patterns;

import com.conferenceroomscheduler.model.Account;
import com.conferenceroomscheduler.model.AdminAccount;

public class AdminFactory extends AccountFactory {
    @Override
    protected Account createConcreteAccount(String accountId, String email, String password,
                                            String accountType, boolean universityAccount,
                                            boolean verified, String identifier) {
        return new AdminAccount(accountId, email, password, universityAccount, verified, identifier);
    }
}
