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

    public String getPassengerFirstName() {
        return passengerFirstName;
    }

    public void setPassengerFirstName(String passengerFirstName) {
        this.passengerFirstName = passengerFirstName;
    }

    public ConsumerTypeCount getPassengers() {
        return passengers;
    }

    public void setPassengers(ConsumerTypeCount passengers) {
        this.passengers = passengers;
    }

    public ConsumerTypeCount getVehicles() {
        return vehicles;
    }

    public void setVehicles(ConsumerTypeCount vehicles) {
        this.vehicles = vehicles;
    }
}