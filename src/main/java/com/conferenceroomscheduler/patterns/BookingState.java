package com.conferenceroomscheduler.patterns;

public interface BookingState {
    void handle(BookingContext context);
    String getName();
}
