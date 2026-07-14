package com.conferenceroomscheduler.patterns;

public class BookingContext {
    private BookingState state;

    public BookingContext() {
        this.state = new PendingBookingState();
    }

    public void setState(BookingState state) {
        this.state = state;
    }

    public void request() {
        state.handle();
    }
}
