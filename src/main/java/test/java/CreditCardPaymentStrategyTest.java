package test.java;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy;
import com.conferenceroomscheduler.patterns.PaymentStrategy;

public class CreditCardPaymentStrategyTest {

    private CreditCardPaymentStrategy strategy;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() {
        strategy = new CreditCardPaymentStrategy();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @After
    public void tearDown() {
        System.setOut(System.out);
    }

    @Test
    public void testReturnsTrue() {
        assertTrue(strategy.processPayment("B1", 100));
    }

    @Test
    public void testOutputContainsCreditCard() {
        strategy.processPayment("B2", 50);
        assertTrue(out.toString().contains("credit card"));
    }

    @Test
    public void testOutputContainsBookingId() {
        strategy.processPayment("ABC123", 50);
        assertTrue(out.toString().contains("ABC123"));
    }

    @Test
    public void testOutputContainsAmount() {
        strategy.processPayment("B4", 99.5);
        assertTrue(out.toString().contains("99.5"));
    }

    @Test
    public void testZeroAmount() {
        assertTrue(strategy.processPayment("B5", 0));
    }

    @Test
    public void testNegativeAmount() {
        assertTrue(strategy.processPayment("B6", -5));
    }

    @Test
    public void testNullBookingId() {
        assertTrue(strategy.processPayment(null, 10));
    }

    @Test
    public void testEmptyBookingId() {
        assertTrue(strategy.processPayment("", 10));
    }

    @Test
    public void testLargeAmount() {
        assertTrue(strategy.processPayment("B7", 100000));
    }

    @Test
    public void testImplementsInterface() {
        assertTrue(strategy instanceof PaymentStrategy);
    }
}