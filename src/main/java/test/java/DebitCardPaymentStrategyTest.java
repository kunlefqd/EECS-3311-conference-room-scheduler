package test.java;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy;
import com.conferenceroomscheduler.patterns.PaymentStrategy;

public class DebitCardPaymentStrategyTest {

    private DebitCardPaymentStrategy strategy;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() {
        strategy = new DebitCardPaymentStrategy();
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
    public void testOutputContainsDebitCard() {
        strategy.processPayment("B2", 50);
        assertTrue(out.toString().contains("debit card"));
    }

    @Test
    public void testOutputContainsBookingId() {
        strategy.processPayment("BOOK1", 50);
        assertTrue(out.toString().contains("BOOK1"));
    }

    @Test
    public void testOutputContainsAmount() {
        strategy.processPayment("B4", 10.25);
        assertTrue(out.toString().contains("10.25"));
    }

    @Test
    public void testZeroAmount() {
        assertTrue(strategy.processPayment("B5", 0));
    }

    @Test
    public void testNegativeAmount() {
        assertTrue(strategy.processPayment("B6", -1));
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
        assertTrue(strategy.processPayment("B7", 999999));
    }

    @Test
    public void testImplementsInterface() {
        assertTrue(strategy instanceof PaymentStrategy);
    }
}