package test.java;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy;
import com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy;
import com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy;
import com.conferenceroomscheduler.patterns.PaymentStrategy;

public class PaymentStrategyTest {

    @Test
    public void testAnonymousReturnsTrue() {
        PaymentStrategy strategy = (id, amount) -> true;
        assertTrue(strategy.processPayment("A", 10));
    }

    @Test
    public void testAnonymousReturnsFalse() {
        PaymentStrategy strategy = (id, amount) -> false;
        assertFalse(strategy.processPayment("A", 10));
    }

    @Test
    public void testCreditCardPolymorphism() {
        PaymentStrategy strategy = new CreditCardPaymentStrategy();
        assertTrue(strategy.processPayment("1", 10));
    }

    @Test
    public void testDebitCardPolymorphism() {
        PaymentStrategy strategy = new DebitCardPaymentStrategy();
        assertTrue(strategy.processPayment("2", 20));
    }

    @Test
    public void testInstitutionalPolymorphism() {
        PaymentStrategy strategy = new InstitutionalBillingPaymentStrategy();
        assertTrue(strategy.processPayment("3", 30));
    }

    @Test
    public void testCreditCardIsStrategy() {
        assertTrue(new CreditCardPaymentStrategy() instanceof PaymentStrategy);
    }

    @Test
    public void testDebitCardIsStrategy() {
        assertTrue(new DebitCardPaymentStrategy() instanceof PaymentStrategy);
    }

    @Test
    public void testInstitutionalIsStrategy() {
        assertTrue(new InstitutionalBillingPaymentStrategy() instanceof PaymentStrategy);
    }

    @Test
    public void testAnonymousImplementationNotNull() {
        PaymentStrategy strategy = (id, amount) -> true;
        assertNotNull(strategy);
    }

    @Test
    public void testMultipleCalls() {
        PaymentStrategy strategy = (id, amount) -> true;
        assertTrue(strategy.processPayment("1", 1));
        assertTrue(strategy.processPayment("2", 2));
    }
}