package au.com.sealink.quicktravel.client.models.checkout;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.junit.Assert;
import org.junit.Test;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;

public class CheckoutTest {
    @Test
    public void toJSON() {
        Checkout checkout = new Checkout();
        checkout.setBookingId(24);
        checkout.setPayBalance(true);

        Payment p = new Payment();
        p.setComment("Test Payment Comment");
        p.setAmountInCents(1000);
        p.setPaymentTypeId(1);
        p.setTillId(3);
        p.setUid("123");
        checkout.setPayment(p);

        Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat("YYYY-mm-dd").create();
        String json = gson.toJson(checkout);
        Assert.assertEquals(FixtureHelper.fromFile("fixtures/checkout_create.json"), json);

        Assert.assertEquals(24, checkout.getBookingId());
        Assert.assertEquals(true, checkout.isPayBalance());
        Assert.assertEquals("Test Payment Comment", checkout.getPayment().getComment());
        Assert.assertEquals(1000, checkout.getPayment().getAmountInCents());
        Assert.assertEquals(1, checkout.getPayment().getPaymentTypeId());
        Assert.assertEquals(3, checkout.getPayment().getTillId());
        Assert.assertEquals("123", checkout.getPayment().getUid());
    }
}