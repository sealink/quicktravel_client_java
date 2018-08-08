package au.com.sealink.quicktravel.client.models;

import com.google.gson.Gson;

import org.junit.Assert;
import org.junit.Test;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;

public class BookingTest {
    private void assertData(Booking booking) {
        Assert.assertEquals(1, booking.getId());
        Assert.assertEquals("new", booking.getState());
    }

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/booking.json");
        Booking actual = new Gson().fromJson(json, Booking.class);
        assertData(actual);
    }

    public void fromSetter() {
        Booking actual = new Booking();
        actual.setId(1);
        actual.setState("new");
        assertData(actual);
    }

}