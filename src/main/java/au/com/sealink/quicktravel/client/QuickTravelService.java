package au.com.sealink.quicktravel.client;

import au.com.sealink.quicktravel.client.models.PassengerType;
import au.com.sealink.quicktravel.client.models.VehicleType;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface QuickTravelService {
    @GET("api/passenger_types.json")
    Call<List<PassengerType>> listPassengerTypes();

    @GET("/vehicle_types.json")
    Call<List<VehicleType>> listVehicleTypes();
}