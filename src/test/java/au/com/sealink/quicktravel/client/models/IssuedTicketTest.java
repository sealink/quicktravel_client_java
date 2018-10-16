package au.com.sealink.quicktravel.client.models;

import au.com.sealink.quicktravel.client.models.barcodes.core.TicketTemplate;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class IssuedTicketTest {

    @Test
    public void getValidUnit() {
        IssuedTicket ticket = new IssuedTicket();
        Assert.assertNull(ticket.getValidUntil());

        TicketTemplate template = new TicketTemplate();
        template.setValidityDurationMinutes(30);
        ticket.setTicketTemplate(template);

        Date lastUse = new DateTime(2000, 1, 1, 0, 30, 0).toDate();
        ticket.getUses().add(lastUse);

        DateTime expected = new DateTime(lastUse).plusMinutes(30);
        Assert.assertEquals(expected, ticket.getValidUntil());
    }

    @Test
    public void getLastUsedAt() {
        IssuedTicket ticket = new IssuedTicket();
        Assert.assertNull(ticket.getLastUsedAt());
        ticket.getUses().add(new DateTime(2000, 1, 1, 0, 30, 0).toDate());
        ticket.getUses().add(new DateTime(2000, 1, 2, 0, 30, 0).toDate());
        ticket.getUses().add(new DateTime(2000, 1, 3, 0, 30, 0).toDate());
        Assert.assertEquals(new DateTime(2000, 1, 3, 0, 30, 0).toDate(), ticket.getLastUsedAt());
    }

    @Test
    public void getExpiryDate() {
        IssuedTicket ticket = new IssuedTicket();
        ticket.setExpiryDays(30);
        Assert.assertNull(ticket.getExpiryDate());
        ticket.setCreatedAt(new DateTime(2000, 1, 1, 0, 30, 0).toDate());
        DateTime expected = new DateTime(ticket.getCreatedAt()).plusDays(30);
        Assert.assertEquals(expected, ticket.getExpiryDate());
    }

    @Test
    public void getRemainingTrips() {
        IssuedTicket ticket = new IssuedTicket();
        Assert.assertEquals(0, ticket.getRemainingTrips());
        ticket.getTicketTemplate().setMaximumUses(10);
        Assert.assertEquals(10, ticket.getRemainingTrips());
        ticket.getUses().add(new DateTime(2000, 1, 1, 0, 30, 0).toDate());
        Assert.assertEquals(9, ticket.getRemainingTrips());
    }

}