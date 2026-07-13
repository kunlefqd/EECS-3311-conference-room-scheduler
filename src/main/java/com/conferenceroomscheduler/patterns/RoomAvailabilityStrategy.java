package com.conferenceroomscheduler.patterns;

import com.conferenceroomscheduler.model.Reservation;

import java.time.LocalDateTime;

public interface RoomAvailabilityStrategy {
    boolean isAvailable(Reservation reservation, LocalDateTime start, LocalDateTime end);
}
