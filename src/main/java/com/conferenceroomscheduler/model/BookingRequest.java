package com.conferenceroomscheduler.model;

import java.time.LocalDateTime;

public class BookingRequest {
    private String requestId;
    private String roomId;
    private String organizerId;
    private String title;
    private int attendeeCount;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public BookingRequest() {
    }

    public BookingRequest(String requestId, String roomId, String organizerId, String title,
                          int attendeeCount, LocalDateTime startTime, LocalDateTime endTime) {
        this.requestId = requestId;
        this.roomId = roomId;
        this.organizerId = organizerId;
        this.title = title;
        this.attendeeCount = attendeeCount;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getOrganizerId() {
        return organizerId;
    }

    public String getTitle() {
        return title;
    }

    public int getAttendeeCount() {
        return attendeeCount;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }
}
