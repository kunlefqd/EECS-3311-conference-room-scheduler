package com.conferenceroomscheduler.patterns;

public class CheckedInBookingState implements BookingState {
    @Override
    public void handle(BookingContext context) {
        System.out.println("Checked in.");
        context.setState(new CompletedBookingState());
    }
    
    @Override
    public String getName() {
        return "Checked in.";
    }

}
