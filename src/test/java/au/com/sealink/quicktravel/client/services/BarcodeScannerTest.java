package au.com.sealink.quicktravel.client.services;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import au.com.sealink.quicktravel.client.models.barcodes.ConsumerSplit;
import au.com.sealink.quicktravel.client.models.barcodes.IssuedTicket;
import au.com.sealink.quicktravel.client.models.barcodes.Reservation;
import org.junit.Test;

import static org.junit.Assert.*;

public class BarcodeScannerTest {

    @Test
    public void scanReservation() {
        String json = FixtureHelper.fromFile("fixtures/reservation_barcode.json");
        Object barcode = BarcodeScanner.fromJson(json);
        assertTrue(barcode instanceof Reservation);
    }

    @Test
    public void scanIssuedTicket() {
        String json = FixtureHelper.fromFile("fixtures/issued_ticket_barcode.json");
        Object barcode = BarcodeScanner.fromJson(json);
        assertTrue(barcode instanceof IssuedTicket);
    }

    @Test
    public void scanConsumerSplit() {
        String json = FixtureHelper.fromFile("fixtures/consumer_split_barcode.json");
        Object barcode = BarcodeScanner.fromJson(json);
        assertTrue(barcode instanceof ConsumerSplit);
    }
}