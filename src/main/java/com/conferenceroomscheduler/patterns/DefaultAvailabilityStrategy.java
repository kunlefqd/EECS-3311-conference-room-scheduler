package com.conferenceroomscheduler.patterns;

import com.conferenceroomscheduler.model.Reservation;

import java.time.LocalDateTime;

public class DefaultAvailabilityStrategy implements RoomAvailabilityStrategy {
    @Override
    public boolean isAvailable(Reservation reservation, LocalDateTime start, LocalDateTime end) {
        return start.isBefore(reservation.getEndTime()) && end.isAfter(reservation.getStartTime());
    }
}
