package au.com.sealink.quicktravel.client.models.reservationFor;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.junit.Assert;
import org.junit.Test;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import au.com.sealink.quicktravel.client.models.reservationFor.core.VehicleType;
import au.com.sealink.quicktravel.client.models.reservationFor.scheduledTrip.Create;

public class CreateTest {
    @Test
    public void toJSON() {
        Create create = new Create();
        create.setAddReturn(true);
        create.setBookingId(1);
        create.getForward().setTripId(1);
        create.getForward().setDriverPassengerTypeId(1);
        create.getForward().setFirstTravelDate("2018-08-05");
        create.getForward().getVehicleTypes().add(new VehicleType(1, 5.0f));
        create.getForward().getPassengerTypes().put(1, 1);

        create.getReturning().setServiceId(2);
        create.getReturning().setDriverPassengerTypeId(1);
        create.getReturning().setFirstTravelDate("2018-08-06");
        create.getReturning().getVehicleTypes().add(new VehicleType(1, 5.0f));
        create.getReturning().getPassengerTypes().put(1, 1);
        Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat("YYYY-mm-dd").create();
        String json = gson.toJson(create);
        Assert.assertEquals(FixtureHelper.fromFile("fixtures/scheduled_trip_create.json"), json);

        Assert.assertEquals(1, create.getBookingId());
        Assert.assertEquals(true, create.getAddReturn());
        Assert.assertEquals(1, (int)create.getForward().getDriverPassengerTypeId());
        Assert.assertEquals(null, create.getForward().getServiceId());
        Assert.assertEquals(1, (int)create.getForward().getTripId());
        Assert.assertEquals(2, (int)create.getReturning().getServiceId());
    }
}
