package com.conferenceroomscheduler.patterns;

import com.conferenceroomscheduler.model.User;

public abstract class UserFactory {
    public final User createUser(String userId, String name, String email) {
        User user = createConcreteUser(userId, name, email);
        user.setEmail(email);
        return user;
    }

    protected abstract User createConcreteUser(String userId, String name, String email);
}
