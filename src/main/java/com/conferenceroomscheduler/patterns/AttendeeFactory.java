package com.conferenceroomscheduler.patterns;

import com.conferenceroomscheduler.model.Attendee;
import com.conferenceroomscheduler.model.User;

public class AttendeeFactory extends UserFactory {
    @Override
    protected User createConcreteUser(String userId, String name, String email) {
        return new Attendee(userId, name, email, "TempPass123!", false, "STUDENT-001");
    }
}
