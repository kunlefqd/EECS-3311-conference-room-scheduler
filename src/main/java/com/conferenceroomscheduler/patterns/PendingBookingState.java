package com.conferenceroomscheduler.patterns;

public class PendingBookingState implements BookingState {
    @Override
    public void handle() {
        System.out.println("Booking is pending.");
    }
}
