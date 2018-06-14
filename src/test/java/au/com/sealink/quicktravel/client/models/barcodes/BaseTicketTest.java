package au.com.sealink.quicktravel.client.models.barcodes;

import au.com.sealink.quicktravel.client.models.barcodes.core.Format;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BaseTicketTest {
    @Test
    public void fromSetters() {
        BaseTicket ticket = new BaseTicket();
        ticket.setId(1);
        ticket.setFormat(Format.Reservation);
        ticket.setLastUsedAt(null);
        ticket.setReference("TT-123");
        ticket.setRequiresReview(true);
        ticket.setReservation(null);
        ticket.setResource(null);
        ticket.setTodoItems(new ArrayList<>());

        assertEquals(1, ticket.getId());
        assertEquals(Format.Reservation, ticket.getFormat());
        assertEquals(null, ticket.getLastUsedAt());
        assertEquals("TT-123", ticket.getReference());
        assertEquals(true, ticket.isRequiresReview());
        assertEquals(null, ticket.getReservation());
        assertEquals(null, ticket.getResource());
        assertEquals(0, ticket.getTodoItems().size());
    }
}