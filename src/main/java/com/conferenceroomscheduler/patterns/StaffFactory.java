package com.conferenceroomscheduler.patterns;

import com.conferenceroomscheduler.model.Account;
import com.conferenceroomscheduler.model.StaffAccount;

public class StaffFactory extends AccountFactory {
    @Override
    protected Account createConcreteAccount(String accountId, String email, String password,
                                            String accountType, boolean universityAccount,
                                            boolean verified, String identifier) {
        return new StaffAccount(accountId, email, password, universityAccount, verified, identifier);
    }
}
