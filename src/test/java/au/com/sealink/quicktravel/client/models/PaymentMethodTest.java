package au.com.sealink.quicktravel.client.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class PaymentMethodTest {
    @Test
    public void getValue() {
        PaymentMethod method = PaymentMethod.PayDirect;
        assertEquals(0, method.getValue());

        method = PaymentMethod.OnAccount;
        assertEquals(2, method.getValue());

        method = PaymentMethod.OnAccountRefRequired;
        assertEquals(3, method.getValue());
    }
}