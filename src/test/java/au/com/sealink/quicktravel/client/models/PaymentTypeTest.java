package au.com.sealink.quicktravel.client.models;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import com.google.gson.Gson;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PaymentTypeTest {
    private void assertData(PaymentType actual) {
        assertEquals("Cash", actual.getName());
        assertEquals("http://www.google.com", actual.getIconUrl());
        assertEquals("1.23", actual.getTransactionFee());
        assertEquals("braintree", actual.getGateway());
    }

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/payment_type.json");
        PaymentType actual = new Gson().fromJson(json, PaymentType.class);
        assertData(actual);
    }

    @Test
    public void fromSetters() {
        PaymentType actual = new PaymentType();
        actual.setName("Cash");
        actual.setIconUrl("http://www.google.com");
        actual.setTransactionFee("1.23");
        actual.setGateway("braintree");
        assertData(actual);
    }
}