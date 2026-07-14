package com.conferenceroomscheduler.patterns;

public class ConfirmedBookingState implements BookingState {
    @Override
    public void handle() {
        System.out.println("Booking is confirmed.");
    }
}
