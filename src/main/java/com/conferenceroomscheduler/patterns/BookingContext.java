package com.conferenceroomscheduler.patterns;

import com.conferenceroomscheduler.model.Reservation;

public class BookingContext {
    private BookingState state;
    private Reservation reservation;

    public BookingContext(Reservation reservation) {
    	this.reservation = reservation;
        this.state = new PendingBookingState();
    }

    public Reservation getReservation() {
        return reservation;
    }
    
    public void setState(BookingState state) {
        this.state = state;
    }
    
    public BookingState getState() {
    	return this.state;
    }
    

    public void request() {
        state.handle(this);
    }
    
    public String getStatus() {
        return state.getName();
    }
}
