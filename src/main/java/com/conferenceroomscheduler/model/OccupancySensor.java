package com.conferenceroomscheduler.model;

import com.conferenceroomscheduler.patterns.RoomSensorObserver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class OccupancySensor implements RoomSensorObserver {
    private static final Path CHECK_INS_FILE = Paths.get("data/check-ins.csv");
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


    // write checking methods, make a new user with a valid badge one with an invalid badge
    // use when checkin!!

    /**
     * Req5: each room has sensors to detect occupancy and scan ID badges for verification.
     * Data is sent to the system.
     */
    boolean scanIdBadge(Badge badge) {
        if (badge.isVerified()) {
            sendData(badge);
        }
        return badge.isVerified();
    }

    void sendData(Badge badge) {
        String row = String.join(",", this.roomId, badge.getEmail(), badge.getAccountId(), Boolean.toString(badge.isVerified()));
        try {
            if (!Files.exists(CHECK_INS_FILE)) {
                Files.write(CHECK_INS_FILE, List.of("roomId,email,accountId,verified"), StandardOpenOption.CREATE);
            }
            Files.write(CHECK_INS_FILE, List.of(row), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // when someone checks in, we can detect occupancy
    // this can be the listener update method
    @Override
    public void update(String message) {

        System.out.println("Sensor received: " + message);
    }

}
