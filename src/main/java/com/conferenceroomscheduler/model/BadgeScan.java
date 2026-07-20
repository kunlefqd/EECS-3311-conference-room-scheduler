package com.conferenceroomscheduler.model;

public class BadgeScan {
    private String badgeId;
    private String roomId;
    private boolean verified;

    public BadgeScan() {
    }

    public BadgeScan(String badgeId, String roomId, boolean verified) {
        this.badgeId = badgeId;
        this.roomId = roomId;
        this.verified = verified;
    }

    public String getBadgeId() {
        return badgeId;
    }

    public void setBadgeId(String badgeId) {
        this.badgeId = badgeId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }
}
