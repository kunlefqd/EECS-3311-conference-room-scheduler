package com.conferenceroomscheduler.patterns;

import com.conferenceroomscheduler.model.Admin;
import java.util.ArrayList;
import java.util.List;

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
     * point of authority for minting Admin users — callers cannot go around it to
     * create an Admin themselves the way they could with a bare AdminFactory call.
     */
    public Admin generateAdminAccount(String email, String password) {
        adminSequence++;
        String userId = "ADMIN-" + adminSequence;
        Admin admin = (Admin) adminFactory.createUser(userId, "Administrator " + adminSequence, email);
        admin.setPassword(password);
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
