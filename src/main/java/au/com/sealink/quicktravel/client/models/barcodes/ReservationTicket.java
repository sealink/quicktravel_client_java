package au.com.sealink.quicktravel.client.models.barcodes;

import au.com.sealink.quicktravel.client.models.barcodes.core.ConsumerTypeCount;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReservationTicket extends BaseTicket {

    @SerializedName("passenger_first_name")
    @Expose
    private String passengerFirstName;
    @SerializedName("passengers")
    @Expose
    private ConsumerTypeCount passengers;
    @SerializedName("vehicles")
    @Expose
    private ConsumerTypeCount vehicles;

    //region GETTERS/SETTERS
    public String getPassengerFirstName() {
        return passengerFirstName;
    }

    public ConsumerTypeCount getPassengers() {
        return passengers;
    }

    public ConsumerTypeCount getVehicles() {
        return vehicles;
    }
    //endregion
}