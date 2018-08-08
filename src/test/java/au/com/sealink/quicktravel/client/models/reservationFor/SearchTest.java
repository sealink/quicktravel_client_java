package au.com.sealink.quicktravel.client.models.reservationFor;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.junit.Assert;
import org.junit.Test;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import au.com.sealink.quicktravel.client.models.reservationFor.scheduledTrip.Search;
import au.com.sealink.quicktravel.client.models.reservationFor.core.VehicleType;

public class SearchTest {
    @Test
    public void toJSON() {
        Search search = new Search();
        search.setProductTypeId(554881927);
        search.setRouteId(2);
        search.setFromRouteStopId(3);
        search.setToRouteStopId(4);
        search.setAddReturn(true);
        search.setClientId(null);
        search.getForward().setDriverPassengerTypeId(1);
        search.getForward().setFirstTravelDate("2018-08-05");
        search.getForward().getVehicleTypes().add(new VehicleType(1, 5.0f));
        search.getForward().getPassengerTypes().put(1, 1);

        search.getReturning().setDriverPassengerTypeId(1);
        search.getReturning().setFirstTravelDate("2018-08-06");
        search.getReturning().getVehicleTypes().add(new VehicleType(1, 5.0f));
        search.getReturning().getPassengerTypes().put(1, 1);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(search);

        Assert.assertEquals(554881927, search.getProductTypeId());
        Assert.assertEquals(2, search.getRouteId());
        Assert.assertEquals(3, search.getFromRouteStopId());
        Assert.assertEquals(4, search.getToRouteStopId());
        Assert.assertEquals(true, search.getAddReturn());
        Assert.assertEquals(null, search.getClientId());

        Assert.assertEquals(FixtureHelper.fromFile("fixtures/scheduled_trip_search.json"), json);
    }
}