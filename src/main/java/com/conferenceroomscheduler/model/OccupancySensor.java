package com.conferenceroomscheduler.model;

public class OccupancySensor {
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
}
