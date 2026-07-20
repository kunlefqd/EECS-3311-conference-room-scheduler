package com.conferenceroomscheduler.patterns;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public boolean processPayment(String bookingId, double amount) {
        System.out.println("Processing credit card payment for " + bookingId + " amount=" + amount);
        return true;
    }
}
