package test.java;

import static org.junit.Assert.*;
import org.junit.Test;

import com.conferenceroomscheduler.model.*;

public class PaymentMethodTest {

    @Test
    public void testCreditCardExists() {
        assertEquals(PaymentMethod.CREDIT_CARD, PaymentMethod.valueOf("CREDIT_CARD"));
    }

    @Test
    public void testDebitCardExists() {
        assertEquals(PaymentMethod.DEBIT_CARD, PaymentMethod.valueOf("DEBIT_CARD"));
    }

    @Test
    public void testInstitutionalBillingExists() {
        assertEquals(PaymentMethod.INSTITUTIONAL_BILLING,
                PaymentMethod.valueOf("INSTITUTIONAL_BILLING"));
    }

    @Test
    public void testEnumHasThreeValues() {
        assertEquals(3, PaymentMethod.values().length);
    }

    @Test
    public void testFirstEnumValue() {
        assertEquals(PaymentMethod.CREDIT_CARD, PaymentMethod.values()[0]);
    }

    @Test
    public void testSecondEnumValue() {
        assertEquals(PaymentMethod.DEBIT_CARD, PaymentMethod.values()[1]);
    }

    @Test
    public void testThirdEnumValue() {
        assertEquals(PaymentMethod.INSTITUTIONAL_BILLING, PaymentMethod.values()[2]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidEnumValue() {
        PaymentMethod.valueOf("PAYPAL");
    }

    @Test
    public void testEnumName() {
        assertEquals("CREDIT_CARD", PaymentMethod.CREDIT_CARD.name());
    }

    @Test
    public void testOrdinal() {
        assertEquals(2, PaymentMethod.INSTITUTIONAL_BILLING.ordinal());
    }
}