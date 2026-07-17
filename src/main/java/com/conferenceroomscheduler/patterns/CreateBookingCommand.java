package com.conferenceroomscheduler.patterns;

import com.conferenceroomscheduler.model.Reservation;
import com.conferenceroomscheduler.service.RoomSchedulerService;

public class CreateBookingCommand implements Command {
    private final RoomSchedulerService service;
    private final Reservation reservation;

    public CreateBookingCommand(RoomSchedulerService service, Reservation reservation) {
        this.service = service;
        this.reservation = reservation;
    }

    @Override
    public void execute() {
        service.addReservation(reservation);
    }
}
