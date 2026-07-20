package com.conferenceroomscheduler.patterns;

import com.conferenceroomscheduler.model.Reservation;
import com.conferenceroomscheduler.service.RoomSchedulerService;

public class CancelBookingCommand implements Command {
    private final RoomSchedulerService service;
    private final Reservation reservation;
    private boolean successful;

    public CancelBookingCommand(RoomSchedulerService service, Reservation reservation) {
        this.service = service;
        this.reservation = reservation;
    }

    @Override
    public void execute() {
        successful = service.cancelBooking(reservation);
    }

    public boolean wasSuccessful() {
        return successful;
    }
}