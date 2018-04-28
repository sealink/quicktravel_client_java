package au.com.sealink.quicktravel.client.models.barcodes;

import au.com.sealink.quicktravel.client.helpers.DateHelper;
import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import au.com.sealink.quicktravel.client.models.barcodes.core.Passenger;
import com.google.gson.Gson;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

public class ConsumerSplitTest {

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/consumer_split_barcode.json");
        ConsumerSplit actual = new Gson().fromJson(json, ConsumerSplit.class);

        assertEquals(9, actual.getId());

        assertEquals(3, actual.getReservation().getId());
        assertEquals(12, actual.getReservation().getBookingId());
        assertEquals(DateHelper.getDate(2017, Calendar.NOVEMBER, 15), actual.getReservation().getDepartureDate());
        assertNull(actual.getReservation().getRouteId());
        assertNull(actual.getReservation().getServiceId());
        assertNull(actual.getReservation().getTripId());
        assertNull(actual.getReservation().getDepartureTime());

        assertEquals(11, actual.getResource().getId());
        assertEquals("Rottnest Island Gift Voucher - Different Day Return", actual.getResource().getName());

        assertArrayEquals(new String[] { "Item 1", "Item 2" }, actual.getTodoItems().toArray());

        assertEquals(1, actual.getPassengers().size());

        Passenger passenger = actual.getPassengers().get(0);
        assertEquals(16, passenger.getId());
        assertEquals("", passenger.getName());

        assertEquals("Adult", passenger.getConsumerType().getName());
        assertEquals(1, passenger.getConsumerType().getId());
    }
}