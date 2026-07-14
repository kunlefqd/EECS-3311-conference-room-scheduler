package com.conferenceroomscheduler.patterns;

import com.conferenceroomscheduler.model.Admin;
import com.conferenceroomscheduler.model.User;

public class AdminFactory extends UserFactory {
    @Override
    protected User createConcreteUser(String userId, String name, String email) {
        return new Admin(userId, name, email, "TempPass123!", false, "STUDENT-001");
    }
}
