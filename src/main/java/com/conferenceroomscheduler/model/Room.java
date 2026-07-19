package com.conferenceroomscheduler.model;

public class Room {
    private String roomId;
    private String name;
    private int capacity;
    private boolean enabled;
    private boolean closedForMaintenance;
    private String building;
    private String roomNumber;
    private OccupancySensor occupancySensor;

    public Room(String roomId, String name, int capacity, boolean enabled,
                String building, String roomNumber) {
        this.roomId = roomId;
        this.name = name;
        this.capacity = capacity;
        this.enabled = enabled;
        this.building = building;
        this.roomNumber = roomNumber;
        this.occupancySensor = new OccupancySensor(roomId, false, false);
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

    public boolean isClosedForMaintenance() {
        return closedForMaintenance;
    }

    public void setClosedForMaintenance(boolean closedForMaintenance) {
        this.closedForMaintenance = closedForMaintenance;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public OccupancySensor getOccupancySensor() {
        return occupancySensor;
    }

    public void setOccupancySensor(OccupancySensor occupancySensor) {
        this.occupancySensor = occupancySensor;
    }

    public void checkIn(Account account) {
        this.occupancySensor.setOccupied(true);
    }
}
