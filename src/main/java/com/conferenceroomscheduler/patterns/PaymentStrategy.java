package com.conferenceroomscheduler.patterns;

public interface PaymentStrategy {
    boolean processPayment(String bookingId, double amount);
}
