package com.conferenceroomscheduler.model;

public class Room {
    private String roomId;
    private String name;
    private int capacity;
    private boolean enabled;
    private RoomType roomType;

    public Room() {
    }

    public Room(String roomId, String name, int capacity, boolean enabled, RoomType roomType) {
        this.roomId = roomId;
        this.name = name;
        this.capacity = capacity;
        this.enabled = enabled;
        this.roomType = roomType;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }
}
