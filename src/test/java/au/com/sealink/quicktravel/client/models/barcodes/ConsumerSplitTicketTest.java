package au.com.sealink.quicktravel.client.models.barcodes;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import au.com.sealink.quicktravel.client.helpers.DateHelper;
import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import au.com.sealink.quicktravel.client.models.barcodes.core.Passenger;
import au.com.sealink.quicktravel.client.models.barcodes.core.Vehicle;
import com.google.gson.Gson;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class ConsumerSplitTicketTest {

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/consumer_split_barcode.json");
        ConsumerSplitTicket actual = new Gson().fromJson(json, ConsumerSplitTicket.class);

        assertEquals(9, actual.getId());

        assertEquals(3, actual.getReservation().getId());
        assertEquals(12, actual.getReservation().getBookingId());
        Date expected = DateHelper.getDate(2017, Calendar.NOVEMBER, 15);
        assertEquals(expected, actual.getReservation().getDepartureDate());
        assertNull(actual.getReservation().getRouteId());
        assertNull(actual.getReservation().getServiceId());
        assertNull(actual.getReservation().getTripId());
        assertNull(actual.getReservation().getDepartureTime());

        assertEquals(11, actual.getResource().getId());
        assertEquals("Rottnest Island Gift Voucher - Different Day Return",
                actual.getResource().getName());

        assertArrayEquals(new String[] { "Item 1", "Item 2" }, actual.getTodoItems().toArray());

        assertEquals(1, actual.getPassengers().size());

        Passenger passenger = actual.getPassengers().get(0);
        assertEquals(16, passenger.getId());
        assertEquals("", passenger.getName());

        assertEquals("Adult", passenger.getConsumerType().getName());
        assertEquals(1, passenger.getConsumerType().getId());

        assertEquals(1, actual.getVehicles().size());

        Vehicle vehicle = actual.getVehicles().get(0);
        assertEquals(257194, vehicle.getId());

        assertEquals("Luggage  (no larger than 800mm x 500mm x 400mm)",
                vehicle.getConsumerType().getName());
        assertEquals(10, vehicle.getConsumerType().getId());

        assertEquals(1.0f, vehicle.getLength(), 0.001);
        assertNull(vehicle.getWidth());
        assertEquals(0.1f, vehicle.getHeight(), 0.001);

        assertNull(vehicle.getDetails());
        assertNull(vehicle.getCargo());
        assertNull(vehicle.getRegistration());

        Assert.assertTrue(actual.isActive());
        assertNull(actual.getLastUsedAt());
    }
}