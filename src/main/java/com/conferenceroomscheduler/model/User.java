package com.conferenceroomscheduler.model;

import java.util.regex.Pattern;

public class User {
    private String userId;
    private String name;
    private String email;
    private String password;
    private String role;
    private boolean universityAccount;
    private boolean verified;
    private String identifier;

    public User() {
    }

    public User(String userId, String name, String email, String password, String role,
                boolean universityAccount, boolean verified, String identifier) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.universityAccount = universityAccount;
        this.verified = verified;
        this.identifier = identifier;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    public boolean isValidEmail() {
        return Pattern.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$", email);
    }

    public boolean isStrongPassword() {
        return password != null
                && password.length() >= 8
                && Pattern.compile("[A-Z]").matcher(password).find()
                && Pattern.compile("[a-z]").matcher(password).find()
                && Pattern.compile("\\d").matcher(password).find()
                && Pattern.compile("[^A-Za-z0-9]").matcher(password).find();
    }
}
