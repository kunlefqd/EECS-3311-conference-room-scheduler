package com.conferenceroomscheduler.patterns;

import java.util.ArrayList;
import java.util.List;

import com.conferenceroomscheduler.model.Account;

public class ChiefEventCoordinator {
    private static final ChiefEventCoordinator INSTANCE = new ChiefEventCoordinator();
    private final List<RoomSensorObserver> observers = new ArrayList<>();
    private final AdminFactory adminFactory = new AdminFactory();
    private int adminSequence = 0;

    private ChiefEventCoordinator() {
    }

    public static ChiefEventCoordinator getInstance() {
        return INSTANCE;
    }

    /**
     * Req2: only the chief event coordinator can auto-generate administrator accounts.
     * Because ChiefEventCoordinator is a Singleton, this is the single, guaranteed
     * point of authority for minting Admin accounts — callers cannot go around it to
     * create an admin themselves the way they could with a bare AdminFactory call.
     */
    public Account generateAdminAccount(String accountId, String email, String password) {
        adminSequence++;
        String accountNumber = "ADMIN-" + adminSequence;
        Account admin = adminFactory.createAccount(accountId, email, password, "admin", false, true, accountNumber);
        notifyObservers("Administrator account generated: " + email);
        return admin;
    }

    public void registerObserver(RoomSensorObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(RoomSensorObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (RoomSensorObserver observer : observers) {
            observer.update(message);
        }
    }
}
