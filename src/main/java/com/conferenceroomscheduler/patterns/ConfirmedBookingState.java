package com.conferenceroomscheduler.patterns;

public class ConfirmedBookingState implements BookingState {
    @Override
    public void handle(BookingContext context) {
        System.out.println("Booking confirmed.");
        context.setState(new CheckedInBookingState());
    }
    
    @Override
    public String getName() {
        return "Booking confirmed.";
    }
}
