package au.com.sealink.quicktravel.client.models.barcodes;

import static org.junit.Assert.assertEquals;

import au.com.sealink.quicktravel.client.helpers.DateHelper;
import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import au.com.sealink.quicktravel.client.models.barcodes.core.ActivationTrigger;
import au.com.sealink.quicktravel.client.models.barcodes.core.TicketTemplate;
import com.google.gson.Gson;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;

public class OnlineTicketTest {

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/online_ticket_barcode.json");
        IssuedTicket actual = new Gson().fromJson(json, OnlineTicket.class);

        Assert.assertEquals("T2GPQ2H", actual.getReference());
        Date expected = DateHelper.parseIso("2018-04-11T19:23:06+10:00");
        Assert.assertEquals(expected, actual.getLastUsedAt());

        TicketTemplate template = actual.getTicketTemplate();
        Assert.assertEquals(ActivationTrigger.FirstUse, template.getActivationTrigger());
        Assert.assertEquals("LaneC-City 365-Day 15-Trips", template.getName());
        Assert.assertEquals(365, template.getExpiryDays());
        Assert.assertEquals(15, template.getMaximumUses());
        Assert.assertEquals(999, template.getValidityDurationMinutes());
        Assert.assertNull(template.getDailyUsesLimit());

        assertEquals(1, (int)actual.getPassengers().get("Adult"));
        assertEquals(0, actual.getVehicles().size());

        Assert.assertTrue(actual.isActive());
    }
}