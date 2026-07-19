package com.conferenceroomscheduler.patterns;

import com.conferenceroomscheduler.model.Reservation;
import com.conferenceroomscheduler.service.RoomSchedulerService;

import java.time.LocalDateTime;

public class ExtendBookingCommand implements Command {
    private final RoomSchedulerService service;
    private final Reservation reservation;
    private final LocalDateTime newEnd;
    private boolean successful;

    public ExtendBookingCommand(RoomSchedulerService service, Reservation reservation, LocalDateTime newEnd) {
        this.service = service;
        this.reservation = reservation;
        this.newEnd = newEnd;
    }

    @Override
    public void execute() {
        successful = service.extendBooking(reservation, newEnd);
    }

    public boolean wasSuccessful() {
        return successful;
    }
}