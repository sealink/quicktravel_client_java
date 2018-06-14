package au.com.sealink.quicktravel.client.models.barcodes;

import static org.junit.Assert.assertEquals;

import au.com.sealink.quicktravel.client.helpers.DateHelper;
import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import au.com.sealink.quicktravel.client.models.barcodes.core.ActivationTrigger;
import au.com.sealink.quicktravel.client.models.barcodes.core.TicketTemplate;
import com.google.gson.Gson;
import java.util.Date;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;

public class IssuedTicketTest {

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/issued_ticket_barcode.json");
        IssuedTicket actual = new Gson().fromJson(json, IssuedTicket.class);

        Assert.assertEquals("T2GPQ2H", actual.getReference());
        Date expected = DateHelper.parseIso("2018-04-11T19:23:06+10:00");
        Assert.assertEquals(expected, actual.getLastUsedAt());

        TicketTemplate template = actual.getTicketTemplate();
        Assert.assertEquals(ActivationTrigger.FirstUse, template.getActivationTrigger());
        Assert.assertEquals("LaneC-City 365-Day 15-Trips", template.getName());
        Assert.assertEquals(365, template.getExpiryDays());
        Assert.assertEquals(15, template.getMaximumUses());
        Assert.assertEquals(20, template.getValidityDurationMinutes());
        Assert.assertEquals(null, template.getDailyUsesLimit());

        assertEquals(1, (int)actual.getPassengers().get("Adult"));
        assertEquals(0, (int)actual.getVehicles().size());
        Assert.assertFalse(actual.isActive());
    }

    @Test
    public void isActive() {
        TicketTemplate template = new TicketTemplate();
        template.setValidityDurationMinutes(20);

        IssuedTicket ticket = new IssuedTicket();
        ticket.setTicketTemplate(template);

        ticket.setLastUsedAt(DateTime.now().toDate());

        Assert.assertTrue(ticket.isActive());
    }

    @Test
    public void isExpired() {
        TicketTemplate template = new TicketTemplate();
        template.setValidityDurationMinutes(20);

        IssuedTicket ticket = new IssuedTicket();
        ticket.setTicketTemplate(template);

        ticket.setLastUsedAt(DateTime.now().minusMinutes(21).toDate());

        Assert.assertFalse(ticket.isActive());
    }
}