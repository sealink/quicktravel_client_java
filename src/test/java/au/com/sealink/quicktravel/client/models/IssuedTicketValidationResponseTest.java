package au.com.sealink.quicktravel.client.models;

import au.com.sealink.quicktravel.client.helpers.DateHelper;
import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import au.com.sealink.quicktravel.client.models.barcodes.core.ActivationTrigger;
import au.com.sealink.quicktravel.client.models.barcodes.core.Resource;
import au.com.sealink.quicktravel.client.models.barcodes.core.TicketTemplate;
import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class IssuedTicketValidationResponseTest {
    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/issued_ticket_validation_response.json");
        IssuedTicket actual = new Gson().fromJson(json, IssuedTicketValidationResponse.class).getTicket();

        Assert.assertEquals("T2HTTMV", actual.getReference());
        Date expected = DateHelper.parseIso("2018-10-15T20:41:49+11:00");
        Assert.assertEquals(expected, actual.getLastUsedAt());

        Date createdAt = DateHelper.parseIso("2018-10-15T20:01:11+11:00");
        Assert.assertEquals(createdAt, actual.getCreatedAt());

        Assert.assertTrue(actual.isInUse());
        Assert.assertFalse(actual.isOutOfDailyUses());
        Assert.assertFalse(actual.isOutOfUses());
        Assert.assertFalse(actual.isUsable());
        Assert.assertFalse(actual.isExpired());
        Assert.assertEquals("2018-10-15", actual.getTravelDate());
        Assert.assertEquals("Pax [15 Oct 2018 -- WatsonB-CQ 365-Day 15-Trips -- 2 pax assigned]", actual.getDetails());
        Assert.assertEquals("15-10-2019 08:16pm", actual.getExpiry());
        Assert.assertEquals("barcode", actual.getQrData());

        Assert.assertEquals(365, actual.getExpiryDays());

        Resource resource = actual.getResource();
        Assert.assertEquals("WatsonB-CQ 365-Day 15-Trips", resource.getName());
        Assert.assertEquals(631, resource.getId());

        TicketTemplate template = actual.getTicketTemplate();
        Assert.assertEquals(ActivationTrigger.FirstUse, template.getActivationTrigger());
        Assert.assertEquals("WatsonB-CQ 365-Day 15-Trips", template.getName());
        Assert.assertEquals(365, template.getExpiryDays());
        Assert.assertEquals(15, template.getMaximumUses());
        Assert.assertEquals(20, template.getValidityDurationMinutes());
        Assert.assertNull(template.getDailyUsesLimit());

        assertEquals(1, (int)actual.getPassengers().get("1"));
        assertEquals(0, actual.getVehicles().size());
    }
}