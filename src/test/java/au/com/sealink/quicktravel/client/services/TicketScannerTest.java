package au.com.sealink.quicktravel.client.services;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import au.com.sealink.quicktravel.client.models.barcodes.ConsumerSplitTicket;
import au.com.sealink.quicktravel.client.models.barcodes.IssuedTicket;
import au.com.sealink.quicktravel.client.models.barcodes.ReservationTicket;
import au.com.sealink.quicktravel.client.models.barcodes.core.InvalidTicketException;
import org.junit.Assert;
import org.junit.Test;

public class TicketScannerTest {

    @Test
    public void unknownTicket() {
        String json = FixtureHelper.fromFile("fixtures/unknown_barcode.json");
        try {
            TicketScanner.fromJson(json);
            Assert.fail("Expected exception");
        } catch (InvalidTicketException e) {
            assertThat(e.getMessage(), is("Unknown ticket format"));
        }
    }

    @Test
    public void invalidJson() {
        String json = FixtureHelper.fromFile("fixtures/invalid_barcode.json");
        try {
            TicketScanner.fromJson(json);
            Assert.fail("Expected exception");
        } catch (InvalidTicketException e) {
            assertThat(e.getMessage(), is("Invalid ticket format"));
        }
    }

    @Test
    public void scanReservationTicket() {
        String json = FixtureHelper.fromFile("fixtures/reservation_barcode.json");
        Object barcode = null;
        try {
            barcode = TicketScanner.fromJson(json);
        } catch (InvalidTicketException e) {
            Assert.fail("Unexpected exception");
        }
        assertTrue(barcode instanceof ReservationTicket);
    }

    @Test
    public void scanIssuedTicket() {
        String json = FixtureHelper.fromFile("fixtures/issued_ticket_barcode.json");
        Object barcode = null;
        try {
            barcode = TicketScanner.fromJson(json);
        } catch (InvalidTicketException e) {
            Assert.fail("Unexpected exception");
        }
        assertTrue(barcode instanceof IssuedTicket);
    }

    @Test
    public void scanConsumerSplitTicket() {
        String json = FixtureHelper.fromFile("fixtures/consumer_split_barcode.json");
        Object barcode = null;
        try {
            barcode = TicketScanner.fromJson(json);
        } catch (InvalidTicketException e) {
            Assert.fail("Unexpected exception");
        }
        assertTrue(barcode instanceof ConsumerSplitTicket);
    }
}