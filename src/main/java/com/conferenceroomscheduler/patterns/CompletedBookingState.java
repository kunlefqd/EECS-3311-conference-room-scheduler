package com.conferenceroomscheduler.patterns;

public class CompletedBookingState implements BookingState {
    @Override
    public void handle(BookingContext context) {
    	System.out.println("Booking complete.");
    } 
    
    @Override
    public String getName() {
        return "Booking complete";
    }
}
