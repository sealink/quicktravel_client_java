package au.com.sealink.quicktravel.client.models.reservationFor.core;

import com.google.gson.Gson;
import org.junit.Test;

import java.util.ArrayList;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import static junit.framework.TestCase.assertEquals;

public class ProductTest {
    private void assertData(Product actual) {
        assertEquals("55", actual.getProductId());
        assertEquals("trip_id", actual.getProductIdField());
        assertEquals(52, actual.getResourceId());
        assertEquals(1, actual.getTariffLevelId());
        assertEquals("08-08-2018", actual.getFirstTravelDate());
        assertEquals("08-08-2018", actual.getLastTravelDate());
        assertEquals(new Integer(176689), actual.getServiceIds().get(0));
        assertEquals(new Integer(176690), actual.getServiceIds().get(1));
        assertEquals(new Integer(176691), actual.getServiceIds().get(2));
        assertEquals(new Integer(176692), actual.getServiceIds().get(3));
        assertEquals(new Integer(0), actual.getServiceStateIds().get(0));
        assertEquals(new Integer(0), actual.getServiceStateIds().get(1));
        assertEquals(new Integer(0), actual.getServiceStateIds().get(2));
        assertEquals(new Integer(0), actual.getServiceStateIds().get(3));
        assertEquals(null, actual.getExceptionType());
        assertEquals(true, actual.isBookable());
        assertEquals(null, actual.getReasonUnbookable());
        assertEquals(null, actual.getServiceNotes());
        assertEquals("A", actual.getInventoryTypeCode());
        assertEquals(1200, actual.getPriceInCents());
        assertEquals(0, actual.getPreAdjustedPriceInCents());
        Adjustment adjustment = actual.getAdjustments().get(0);
        assertEquals(1200, adjustment.getGrossInCents());
        assertEquals("Walk on Passenger SMBI - Adult", adjustment.getDescription());
        assertEquals(21, adjustment.getAdjustmentDefinitionId());
        assertEquals(3, adjustment.getAdjustmentCategoryId());
        assertEquals("0530 - Bay Islander", actual.getSelectionName());
        assertEquals(0, actual.getPriceBreakdownPassengersInCents());
        assertEquals(0, actual.getPriceBreakdownVehiclesInCents());
        assertEquals(55, actual.getTripId());
        assertEquals("2000-01-01T05:30:00.000Z", actual.getStopDepartureTime());
        assertEquals("2000-01-01T06:35:00.000Z", actual.getStopArrivalTime());
        RouteStop from = actual.getFromRouteStop();
        assertEquals(5, from.getId());
        assertEquals(true, from.isInventoryControlled());
        assertEquals(3, from.getRouteId());
        assertEquals(3, from.getStopId());
        assertEquals("Redland Bay", from.getName());
        assertEquals("RED BAY", from.getCode());
        RouteStop to = actual.getToRouteStop();
        assertEquals(9, to.getId());
        assertEquals(true, to.isInventoryControlled());
        assertEquals(3, to.getRouteId());
        assertEquals(7, to.getStopId());
        assertEquals("Russell Island", to.getName());
        assertEquals("RUSS", to.getCode());
        assertEquals("2000-01-01T05:30:00.000Z", actual.getDepartureTime());
        assertEquals("2000-01-01T06:35:00.000Z", actual.getArrivalTime());
        assertEquals("", actual.getBookingNotes());
        assertEquals(1200, actual.getTotalPriceAdjustmentInCents());
    }

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/product.json");
        Product actual = new Gson().fromJson(json, Product.class);
        assertData(actual);
    }

    @Test
    public void fromSetters() {
        Product actual = new Product();
        actual.setProductId("55");
        actual.setProductIdField("trip_id");
        actual.setResourceId(52);
        actual.setTariffLevelId(1);
        actual.setServiceIds(new ArrayList<>());
        actual.getServiceIds().add(176689);
        actual.getServiceIds().add(176690);
        actual.getServiceIds().add(176691);
        actual.getServiceIds().add(176692);
        actual.setServiceStateIds(new ArrayList<>());
        actual.getServiceStateIds().add(0);
        actual.getServiceStateIds().add(0);
        actual.getServiceStateIds().add(0);
        actual.getServiceStateIds().add(0);
        actual.setFirstTravelDate("08-08-2018");
        actual.setLastTravelDate("08-08-2018");
        actual.setExceptionType(null);
        actual.setBookable(true);
        actual.setReasonUnbookable(null);
        actual.setServiceNotes(null);
        actual.setBookingNotes("");
        actual.setInventoryTypeCode("A");
        actual.setPriceInCents(1200);
        actual.setPreAdjustedPriceInCents(0);
        actual.setTotalPriceAdjustmentInCents(1200);
        actual.setTripId(55);
        actual.setDepartureTime("2000-01-01T05:30:00.000Z");
        actual.setArrivalTime("2000-01-01T06:35:00.000Z");

        Adjustment adjustment = new Adjustment();
        adjustment.setGrossInCents(1200);
        adjustment.setDescription("Walk on Passenger SMBI - Adult");
        adjustment.setAdjustmentDefinitionId(21);
        adjustment.setAdjustmentCategoryId(3);

        actual.setAdjustments(new ArrayList<>());
        actual.getAdjustments().add(adjustment);
        actual.setSelectionName("0530 - Bay Islander");
        actual.setPriceBreakdownPassengersInCents(0);
        actual.setPriceBreakdownVehiclesInCents(0);
        actual.setStopDepartureTime("2000-01-01T05:30:00.000Z");
        actual.setStopArrivalTime("2000-01-01T06:35:00.000Z");

        RouteStop fromStop = new RouteStop();
        fromStop.setId(5);
        fromStop.setInventoryControlled(true);
        fromStop.setRouteId(3);
        fromStop.setPosition(1);
        fromStop.setStopId(3);
        fromStop.setName("Redland Bay");
        fromStop.setCode("RED BAY");
        actual.setFromRouteStop(fromStop);

        RouteStop toStop = new RouteStop();
        toStop.setId(9);
        toStop.setInventoryControlled(true);
        toStop.setRouteId(3);
        toStop.setPosition(5);
        toStop.setStopId(7);
        toStop.setName("Russell Island");
        toStop.setCode("RUSS");
        actual.setToRouteStop(toStop);

        assertData(actual);
    }
}