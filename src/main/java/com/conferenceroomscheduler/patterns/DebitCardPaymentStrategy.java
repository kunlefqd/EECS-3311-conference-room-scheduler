package com.conferenceroomscheduler.patterns;

public class DebitCardPaymentStrategy implements PaymentStrategy {
    @Override
    public boolean processPayment(String bookingId, double amount) {
        System.out.println("Processing debit card payment for " + bookingId + " amount=" + amount);
        return true;
    }
}
