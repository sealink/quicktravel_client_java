package au.com.sealink.quicktravel.client.models.reservationFor.core;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VehicleType {
    @SerializedName("vehicle_type_id")
    @Expose
    private int vehicleTypeId;
    @SerializedName("length")
    @Expose
    private Float length;

    public VehicleType(int vehicleTypeId, Float length) {
        this.vehicleTypeId = vehicleTypeId;
        this.length = length;
    }

    //region GETTER/SETTERS
    public Float getLength() {
        return length;
    }

    public int getVehicleTypeId() {
        return vehicleTypeId;
    }
    //endregion
}
