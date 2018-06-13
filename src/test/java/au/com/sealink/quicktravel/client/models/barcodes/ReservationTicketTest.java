package au.com.sealink.quicktravel.client.models.barcodes;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import au.com.sealink.quicktravel.client.helpers.DateHelper;
import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import au.com.sealink.quicktravel.client.models.barcodes.core.Format;
import com.google.gson.Gson;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class ReservationTicketTest {

    @Test
    public void withoutTodoItems() {
        String json = FixtureHelper.fromFile("fixtures/reservation_barcode_without_todo.json");
        ReservationTicket actual = new Gson().fromJson(json, ReservationTicket.class);
        assertEquals(0, actual.getTodoItems().size());
    }

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/reservation_barcode.json");
        ReservationTicket actual = new Gson().fromJson(json, ReservationTicket.class);

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
        Date expected = DateHelper.getDate(2018, Calendar.APRIL, 17);
        assertEquals(expected, actual.getReservation().getDepartureDate());
        assertEquals("0910", actual.getReservation().getDepartureTime());
        Assert.assertTrue(actual.isActive());
        Assert.assertNull(actual.getLastUsedAt());
    }
}