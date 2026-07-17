package com.conferenceroomscheduler.model;

public class Badge {
    private String email;
    private String accountId;
    private boolean verified;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public Badge(String email, String accountId, boolean verified) {
        this.email = email;
        this.accountId = accountId;
        this.verified = verified;
    }
}
