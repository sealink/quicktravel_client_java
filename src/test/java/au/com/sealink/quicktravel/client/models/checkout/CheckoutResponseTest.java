package au.com.sealink.quicktravel.client.models.checkout;

import com.google.gson.Gson;

import org.junit.Assert;
import org.junit.Test;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;

public class CheckoutResponseTest {

    private void assertData(CheckoutResponse actual) {
        Assert.assertEquals("uid", actual.getCheckoutId());
        Assert.assertEquals(false, actual.isCompletable());
        Assert.assertEquals("finished", actual.getProgress());
    }

    @Test
    public void fromJSON() {
        String json = FixtureHelper.fromFile("fixtures/checkout_response.json");
        CheckoutResponse actual = new Gson().fromJson(json, CheckoutResponse.class);
        assertData(actual);
    }

    @Test
    public void fromSetters() {
        CheckoutResponse response = new CheckoutResponse();
        response.setCheckoutId("uid");
        response.setCompletable(false);
        response.setProgress("finished");
        assertData(response);
    }
}