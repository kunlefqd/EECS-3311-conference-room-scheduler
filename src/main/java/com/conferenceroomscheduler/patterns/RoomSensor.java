package com.conferenceroomscheduler.patterns;

public class RoomSensor implements RoomSensorObserver {
    @Override
    public void update(String message) {
        System.out.println("Sensor received: " + message);
    }
}
