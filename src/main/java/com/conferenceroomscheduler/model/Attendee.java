package com.conferenceroomscheduler.model;

public class Attendee extends User {
    public Attendee() {
        super();
    }

    public Attendee(String userId, String name, String email) {
        super(userId, name, "ATTENDEE", email);
    }
}
