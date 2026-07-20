package com.conferenceroomscheduler.patterns;

public class PendingBookingState implements BookingState {
    @Override
    public void handle(BookingContext context) {
        
        
        if(context.getReservation().getDepositAmount() > 0) {
        	context.setState(new ConfirmedBookingState());
        } else {
        	System.out.println("Booking is pending. Requiring deposit payment");
        }
        
    }
    
    public String getName() {
        return "Pending";
    }
}
