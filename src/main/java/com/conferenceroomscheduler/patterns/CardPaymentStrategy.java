package com.conferenceroomscheduler.patterns;

public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public boolean processPayment(String bookingId, double amount) {
        System.out.println("Processing card payment for " + bookingId + " amount=" + amount);
        return true;
    }
}
