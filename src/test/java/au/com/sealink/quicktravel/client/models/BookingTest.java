package au.com.sealink.quicktravel.client.models;

import au.com.sealink.quicktravel.client.helpers.DateHelper;
import com.google.gson.Gson;

import org.junit.Assert;
import org.junit.Test;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;

public class BookingTest {
    private void assertData(Booking booking) {
        Assert.assertEquals(36, booking.getId());
        Assert.assertEquals("new", booking.getState());
        Assert.assertEquals("22223K", booking.getReference());
        Assert.assertEquals(16, booking.getCountryId());
        Assert.assertEquals("Internal Comment", booking.getInternalComments());
        Assert.assertEquals("Public Comment", booking.getPublicComments());
        Assert.assertEquals(1500, booking.getGrossInCents());
        Assert.assertEquals(1300, booking.getNetInCents());
        Assert.assertEquals("5000", booking.getPostCode());
        Assert.assertEquals("ABC-123", booking.getExternalIdentifier());

        Assert.assertEquals(DateHelper.parseIso("2018-08-14T11:25:15+10:00"), booking.getCreatedAt());
        Assert.assertEquals(DateHelper.parseIso("2018-08-14T11:45:22+10:00"), booking.getUpdatedAt());

        Client client = booking.getClient();
        Assert.assertEquals(5, client.getId());
        Assert.assertEquals(16, client.getPartyId());
        Assert.assertEquals("Pay Direct", client.getPaymentMethodName());
        Assert.assertEquals("Resident", client.getClientType());
        Assert.assertFalse(client.isAgent());
        Assert.assertFalse(client.isSurchargeless());
        Assert.assertEquals("000", client.getContactPhone());
        Assert.assertEquals("", client.getContactEmail());
        Assert.assertEquals("", client.getContactMobile());
        Assert.assertEquals("Dev Test Resident Club", client.getName());
        Assert.assertEquals("DEV", client.getFirstName());
        Assert.assertEquals("TEST RESIDENT CLUB", client.getLastName());
    }

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/booking.json");
        Booking actual = new Gson().fromJson(json, Booking.class);
        assertData(actual);
    }

    @Test
    public void fromSetter() {
        Booking actual = new Booking();
        actual.setId(36);
        actual.setState("new");
        actual.setReference("22223K");
        actual.setCreatedAt(DateHelper.parseIso("2018-08-14T11:25:15+10:00"));
        actual.setUpdatedAt(DateHelper.parseIso("2018-08-14T11:45:22+10:00"));
        actual.setCountryId(16);
        actual.setNetInCents(1300);
        actual.setGrossInCents(1500);
        actual.setPostCode("5000");
        actual.setPublicComments("Public Comment");
        actual.setInternalComments("Internal Comment");
        actual.setExternalIdentifier("ABC-123");

        Client client = new Client();
        client.setId(5);
        client.setPartyId(16);
        client.setPaymentMethodName("Pay Direct");
        client.setClientType("Resident");
        client.setContactPhone("000");
        client.setName("Dev Test Resident Club");
        client.setFirstName("DEV");
        client.setLastName("TEST RESIDENT CLUB");
        client.setContactEmail("");
        client.setContactMobile("");
        client.setSurchargeless(false);
        client.setAgent(false);
        actual.setClient(client);
        assertData(actual);
    }
}