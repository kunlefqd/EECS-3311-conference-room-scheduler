package com.conferenceroomscheduler.patterns;

import com.conferenceroomscheduler.model.Account;
import com.conferenceroomscheduler.model.PartnerAccount;

public class PartnerFactory extends AccountFactory {
    @Override
    protected Account createConcreteAccount(String accountId, String email, String password,
                                            String accountType, boolean universityAccount,
                                            boolean verified, String accountNumber) {
        return new PartnerAccount(accountId, email, password, universityAccount, verified, accountNumber);
    }
}
