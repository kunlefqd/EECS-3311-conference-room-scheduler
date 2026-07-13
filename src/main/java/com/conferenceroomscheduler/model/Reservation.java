package com.conferenceroomscheduler.model;

import java.time.LocalDateTime;

public class Reservation {
    private String reservationId;
    private String roomId;
    private String organizer;
    private String title;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private boolean checkedIn;
    private ReservationStatus status;

    public Reservation() {
    }

    public Reservation(String reservationId, String roomId, String organizer, String title,
                       LocalDateTime startTime, LocalDateTime endTime, boolean checkedIn) {
        this.reservationId = reservationId;
        this.roomId = roomId;
        this.organizer = organizer;
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.checkedIn = checkedIn;
        this.status = checkedIn ? ReservationStatus.CHECKED_IN : ReservationStatus.CONFIRMED;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
        this.status = checkedIn ? ReservationStatus.CHECKED_IN : ReservationStatus.CONFIRMED;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }
}
