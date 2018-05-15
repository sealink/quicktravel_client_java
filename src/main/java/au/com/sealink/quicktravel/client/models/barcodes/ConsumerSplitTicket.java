package au.com.sealink.quicktravel.client.models.barcodes;

import au.com.sealink.quicktravel.client.models.barcodes.core.Passenger;
import au.com.sealink.quicktravel.client.models.barcodes.core.Vehicle;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ConsumerSplitTicket extends BaseTicket {
    @SerializedName("vehicles")
    @Expose
    private List<Vehicle> vehicles = new ArrayList<Vehicle>();

    @SerializedName("passengers")
    @Expose
    private List<Passenger> passengers = new ArrayList<Passenger>();

    //region GETTER/SETTERS
    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }
    //endregion
}
