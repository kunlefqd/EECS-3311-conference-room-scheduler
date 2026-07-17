package com.conferenceroomscheduler.model;

import com.conferenceroomscheduler.patterns.RoomSensorObserver;

public class OccupancySensor implements RoomSensorObserver {
    private String roomId;
    private boolean occupied;

    public OccupancySensor() {
    }

    public OccupancySensor(String roomId, boolean occupied) {
        this.roomId = roomId;
        this.occupied = occupied;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    // when someone checks in, we can detect occupancy
    // this can be the listener update method
    @Override
    public void update(String message) {
        System.out.println("Sensor received: " + message);
    }

    // write checking methods, make a new user with a valid badge one with an invalid badge
    boolean scanIdBadge(Account account) {
        return account.isVerified();
    }
}
