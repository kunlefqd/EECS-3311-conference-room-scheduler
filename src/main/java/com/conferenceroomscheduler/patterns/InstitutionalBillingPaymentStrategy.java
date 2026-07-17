package com.conferenceroomscheduler.patterns;

public class InstitutionalBillingPaymentStrategy implements PaymentStrategy {
    @Override
    public boolean processPayment(String bookingId, double amount) {
        System.out.println("Processing institutional billing for " + bookingId + " amount=" + amount);
        return true;
    }
}
