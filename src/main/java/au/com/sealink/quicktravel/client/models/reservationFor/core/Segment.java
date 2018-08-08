package au.com.sealink.quicktravel.client.models.reservationFor.core;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Segment {
    @SerializedName("driver_passenger_type_id")
    @Expose
    private Integer driverPassengerTypeId;

    @SerializedName("first_travel_date")
    @Expose
    private String firstTravelDate;

    @SerializedName("passenger_types")
    @Expose
    private HashMap<Integer, Integer> mPassengers = new HashMap<>();

    @SerializedName("vehicle_types")
    @Expose
    private List<au.com.sealink.quicktravel.client.models.reservationFor.core.VehicleType> mVehicles = new ArrayList<>();

    @SerializedName("trip_id")
    @Expose
    private Integer tripId;

    @SerializedName("service_id")
    @Expose
    private Integer serviceId;

    //region GETTER/SETTERS
    public Integer getDriverPassengerTypeId() {
        return driverPassengerTypeId;
    }

    public void setDriverPassengerTypeId(Integer passengerTypeId) {
        this.driverPassengerTypeId = passengerTypeId;
    }

    public String getFirstTravelDate() {
        return firstTravelDate;
    }

    public void setFirstTravelDate(String firstTravelDate) {
        this.firstTravelDate = firstTravelDate;
    }

    public HashMap<Integer, Integer> getPassengerTypes() {
        return mPassengers;
    }

    public List<au.com.sealink.quicktravel.client.models.reservationFor.core.VehicleType> getVehicleTypes() {
        return mVehicles;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getTripId() {
        return tripId;
    }

    public void setTripId(Integer tripId) {
        this.tripId = tripId;
    }

    //endregion
}
