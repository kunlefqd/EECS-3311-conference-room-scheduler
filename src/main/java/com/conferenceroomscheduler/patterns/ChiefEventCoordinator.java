package com.conferenceroomscheduler.patterns;

import java.util.ArrayList;
import java.util.List;

public class ChiefEventCoordinator {
    private static final ChiefEventCoordinator INSTANCE = new ChiefEventCoordinator();
    private final List<RoomSensorObserver> observers = new ArrayList<>();

    private ChiefEventCoordinator() {
    }

    public static ChiefEventCoordinator getInstance() {
        return INSTANCE;
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
