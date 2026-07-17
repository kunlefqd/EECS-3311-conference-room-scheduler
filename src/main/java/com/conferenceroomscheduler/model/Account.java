package com.conferenceroomscheduler.model;

public class Account {
    private String accountId;
    private String email;
    private String password;
    private String accountType;
    private boolean universityAccount;
    private boolean verified;
    private String identifier;
    private Badge badge;

    public Account() {
    }

    public Account(String accountId, String email, String password, String accountType,
                   boolean universityAccount, boolean verified, String identifier) {
        this.accountId = accountId;
        this.email = email;
        this.password = password;
        this.accountType = accountType;
        this.universityAccount = universityAccount;
        this.verified = verified;
        this.identifier = identifier;
        this.badge = new Badge(email, accountId, verified);
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public boolean isUniversityAccount() {
        return universityAccount;
    }

    public void setUniversityAccount(boolean universityAccount) {
        this.universityAccount = universityAccount;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    
    public Badge getBadge() {
        return badge;
    }
}
