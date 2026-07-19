package com.conferenceroomscheduler.patterns;

import com.conferenceroomscheduler.model.Account;

public abstract class CheckInObserver {
    public CheckInPublisher subject;
    public String roomId;
    public boolean occupied;
    public boolean isDetected;
    
    public CheckInObserver(String roomId, boolean occupied, boolean isDetected) {
        this.roomId = roomId;
        this.occupied = occupied;
        this.isDetected = isDetected;
    }


    public CheckInPublisher getSubject() {
        return subject;
    }

    public void setSubject(CheckInPublisher subject) {
        this.subject = subject;
    }

    public boolean isDetected() {
        return isDetected;
    }

    public void setDetected(boolean isDetected) {
        this.isDetected = isDetected;
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

    public abstract boolean detectOccupancy(Account account);
}