package au.com.sealink.quicktravel.client.models.barcodes;

import au.com.sealink.quicktravel.client.helpers.DateHelper;
import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import au.com.sealink.quicktravel.client.models.barcodes.core.Format;
import com.google.gson.Gson;
import org.junit.Test;
import java.util.Calendar;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ReservationTest {
    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/reservation_barcode.json");
        Reservation actual = new Gson().fromJson(json, Reservation.class);

        assertEquals(172_931, actual.getId());
        assertEquals(Format.Reservation, actual.getFormat());
        assertEquals("229JGQ", actual.getReference());
        assertEquals("Homer Simpson", actual.getPassengerFirstName());
        assertFalse(actual.isRequiresReview());
        assertArrayEquals(new String[] { "Item 1", "Item 2" }, actual.getTodoItems().toArray());

        assertEquals(2, actual.getResource().getId());
        assertEquals("Rottnest Island", actual.getResource().getName());

        assertEquals(2, (int)actual.getPassengers().get("Ad"));
        assertEquals(3, (int)actual.getPassengers().get("Ch"));
        assertEquals(2, (int)actual.getVehicles().get("Lugg"));

        assertEquals(172_931, actual.getReservation().getId());
        assertEquals(75688, actual.getReservation().getBookingId());
        assertEquals(new Integer(1), actual.getReservation().getRouteId());
        assertEquals(new Integer(7673), actual.getReservation().getServiceId());
        assertEquals(new Integer(35), actual.getReservation().getTripId());
        assertEquals(DateHelper.getDate(2018, Calendar.APRIL, 17), actual.getReservation().getDepartureDate());
        assertEquals("0910", actual.getReservation().getDepartureTime());
    }
}