package com.conferenceroomscheduler.model;

public class Admin extends User {
    public Admin() {
        super();
    }

    public Admin(String userId, String name, String email) {
        super(userId, name, "ADMIN", email);
    }
}
