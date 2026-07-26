package test.java;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.conferenceroomscheduler.patterns.*;

public class InstitutionalBillingPaymentStrategyTest {

    private InstitutionalBillingPaymentStrategy strategy;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() {
        strategy = new InstitutionalBillingPaymentStrategy();
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
    public void testOutputContainsInstitutionalBilling() {
        strategy.processPayment("B2", 50);
        assertTrue(out.toString().contains("institutional billing"));
    }

    @Test
    public void testOutputContainsBookingId() {
        strategy.processPayment("BOOK1", 50);
        assertTrue(out.toString().contains("BOOK1"));
    }

    @Test
    public void testOutputContainsAmount() {
        strategy.processPayment("B4", 125.75);
        assertTrue(out.toString().contains("125.75"));
    }

    @Test
    public void testZeroAmount() {
        assertTrue(strategy.processPayment("B5", 0));
    }

    @Test
    public void testNegativeAmount() {
        assertTrue(strategy.processPayment("B6", -50));
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
        assertTrue(strategy.processPayment("B7", 500000));
    }

    @Test
    public void testImplementsInterface() {
        assertTrue(strategy instanceof PaymentStrategy);
    }
}