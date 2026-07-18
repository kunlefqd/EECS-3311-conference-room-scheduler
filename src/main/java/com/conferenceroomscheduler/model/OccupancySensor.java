package com.conferenceroomscheduler.model;

import com.conferenceroomscheduler.patterns.CheckInObserver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class OccupancySensor extends CheckInObserver {
    private static final Path CHECK_INS_FILE = Paths.get("data/check-ins.csv");
    private String lastEvent;

    public OccupancySensor(String roomId, boolean occupied, boolean isDetected) {
        super(roomId, occupied, isDetected);
    }

    public String getLastEvent() {
        return lastEvent;
    }

    /**
     * Req5: each room has sensors to detect occupancy and scan ID badges for verification.
     * Data is sent to the system.
     */

    // Detect occupancy
    @Override
    public boolean detectOccupancy(Account account) {
        if (this.isOccupied() && !isDetected){
            lastEvent = "Occupancy verified for room with ID " + this.roomId + ".";
            setDetected(true);
            scanIdBadge(account.getBadge());
        }
        return this.isOccupied();
    }

    // Scan ID Badges
    public boolean scanIdBadge(Badge badge) {
        sendData(badge);
        boolean verified = badge.isVerified();
        String badgeLine = verified
                ? "Verified Badge detected for " + badge.getEmail() + "."
                : "Unverified Badge detected for " + badge.getEmail() + ".";
        lastEvent = (lastEvent != null ? lastEvent + "\n" : "") + badgeLine;
        return verified; // TODO: add unverified step
    }

    // Send Data to System
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
}
