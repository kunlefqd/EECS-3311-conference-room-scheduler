package com.conferenceroomscheduler.patterns;

import com.conferenceroomscheduler.model.Reservation;
import com.conferenceroomscheduler.model.ReservationStatus;

public class ReservationService {
    private final ReservationRepository repository = new ReservationRepository();

    public void createReservation(Reservation reservation) {
        reservation.setStatus(ReservationStatus.CONFIRMED);
        repository.save(reservation);
    }
}
