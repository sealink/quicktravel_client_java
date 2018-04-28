package au.com.sealink.quicktravel.client.models.barcodes;

import au.com.sealink.quicktravel.client.helpers.DateHelper;
import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import au.com.sealink.quicktravel.client.models.barcodes.core.ActivationTrigger;
import au.com.sealink.quicktravel.client.models.barcodes.core.TicketTemplate;
import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IssuedTicketTest {

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/issued_ticket_barcode.json");
        IssuedTicket actual = new Gson().fromJson(json, IssuedTicket.class);

        Assert.assertEquals("T2GPQ2H", actual.getReference());
        Assert.assertEquals(DateHelper.parseIso("2018-04-11T19:23:06+10:00"), actual.getLastUsedAt());

        TicketTemplate template = actual.getTicketTemplate();
        Assert.assertEquals(ActivationTrigger.FirstUse, template.getActivationTrigger());
        Assert.assertEquals("LaneC-City 365-Day 15-Trips", template.getName());
        Assert.assertEquals(365, template.getExpiryDays());
        Assert.assertEquals(15, template.getMaximumUses());
        Assert.assertEquals(20, template.getValidityDurationMinutes());
        Assert.assertEquals(null, template.getDailyUsesLimit());

        assertEquals(1, (int)actual.getPassengers().get("Adult"));
    }
}