package au.com.sealink.quicktravel.client.models.checkout;

import com.google.gson.Gson;

import org.junit.Assert;
import org.junit.Test;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;

public class StatusTest {

    @Test
    public void statusComplete() {
        String json = FixtureHelper.fromFile("fixtures/checkout_status_complete.json");
        Status actual = new Gson().fromJson(json, Status.class);

        Assert.assertEquals(true, actual.getSuccessful());
        Assert.assertNull(actual.getError());
        Assert.assertEquals("completed", actual.getProgress());
    }

    @Test
    public void statusInProgress() {
        String json = FixtureHelper.fromFile("fixtures/checkout_status_progress.json");
        Status actual = new Gson().fromJson(json, Status.class);

        Assert.assertNull(actual.getSuccessful());
        Assert.assertNull(actual.getError());
        Assert.assertEquals("processing", actual.getProgress());
    }

    @Test
    public void statusError() {
        String json = FixtureHelper.fromFile("fixtures/checkout_status_error.json");
        Status actual = new Gson().fromJson(json, Status.class);

        Assert.assertFalse(actual.getSuccessful());
        Assert.assertEquals("An error occurred when processing the payment.", actual.getError());
        Assert.assertEquals("completed", actual.getProgress());
    }

    @Test
    public void fromSetters() {
        Status status = new Status();
        status.setSuccessful(true);
        status.setProgress("completed");
        status.setError("Error");

        Assert.assertEquals(true, status.getSuccessful());
        Assert.assertEquals("Error", status.getError());
        Assert.assertEquals("completed", status.getProgress());
    }
}