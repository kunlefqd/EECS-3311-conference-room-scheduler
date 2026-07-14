package com.conferenceroomscheduler.model;

public class Admin extends User {
    public Admin() {
        super();
    }

    public Admin(String userId, String name, String email, String password, boolean universityAccount, String identifier) {
        super(userId, name, email, password, "ADMIN", universityAccount, !universityAccount, identifier);
    }
}
