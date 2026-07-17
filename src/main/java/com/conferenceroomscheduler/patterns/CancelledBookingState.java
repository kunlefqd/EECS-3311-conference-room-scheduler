package com.conferenceroomscheduler.patterns;

public class CancelledBookingState implements BookingState {
    @Override
    public void handle(BookingContext context) {
        System.out.println("Booking is cancelled.");
        
    }
    
    @Override
    public String getName() {
        return "Cancelled";
    }
}
