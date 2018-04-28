package au.com.sealink.quicktravel.client.models.barcodes;

import au.com.sealink.quicktravel.client.helpers.DateHelper;
import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import au.com.sealink.quicktravel.client.models.barcodes.core.Passenger;
import au.com.sealink.quicktravel.client.models.barcodes.core.Vehicle;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

public class ConsumerSplitTicketTest {

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/consumer_split_barcode.json");
        ConsumerSplitTicket actual = new Gson().fromJson(json, ConsumerSplitTicket.class);

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

        assertEquals(1, actual.getVehicles().size());

        Vehicle vehicle = actual.getVehicles().get(0);
        assertEquals(257194, vehicle.getId());

        assertEquals("Luggage  (no larger than 800mm x 500mm x 400mm)", vehicle.getConsumerType().getName());
        assertEquals(10, vehicle.getConsumerType().getId());

        assertEquals(1.0f, vehicle.getLength(), 0.001);
        Assert.assertNull(vehicle.getWidth());
        assertEquals(0.1f, vehicle.getHeight(), 0.001);

        Assert.assertNull(vehicle.getDetails());
        Assert.assertNull(vehicle.getCargo());
        Assert.assertNull(vehicle.getRegistration());

        Assert.assertTrue(actual.isActive());
        Assert.assertNull(actual.getLastUsedAt());
    }
}