package com.conferenceroomscheduler.model;

public class Attendee extends User {
    public Attendee() {
        super();
    }

    public Attendee(String userId, String name, String email, String password, boolean universityAccount, String identifier) {
        super(userId, name, email, password, "ATTENDEE", universityAccount, !universityAccount, identifier);
    }
}
