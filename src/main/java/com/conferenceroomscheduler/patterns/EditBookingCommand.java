package com.conferenceroomscheduler.patterns;

import com.conferenceroomscheduler.model.Reservation;
import com.conferenceroomscheduler.service.RoomSchedulerService;

import java.time.LocalDateTime;

public class EditBookingCommand implements Command {
    private final RoomSchedulerService service;
    private final Reservation reservation;
    private final LocalDateTime newStart;
    private final LocalDateTime newEnd;
    private boolean successful;

    public EditBookingCommand(RoomSchedulerService service, Reservation reservation,
                               LocalDateTime newStart, LocalDateTime newEnd) {
        this.service = service;
        this.reservation = reservation;
        this.newStart = newStart;
        this.newEnd = newEnd;
    }

    @Override
    public void execute() {
        successful = service.editBooking(reservation, newStart, newEnd);
    }

    public boolean wasSuccessful() {
        return successful;
    }
}