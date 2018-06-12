package au.com.sealink.quicktravel.client.models.timetable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Departure {
    @SerializedName("id")
    @Expose
    int id;

    @SerializedName("trip_id")
    @Expose
    int tripId;

    @SerializedName("state")
    @Expose
    String state;

    @SerializedName("departs_at")
    @Expose
    Date departsAt;

    //region GETTER/SETTERS
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getTripId() { return tripId; }
    public void setTripId(int tripId) { this.tripId = tripId; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public Date getDepartsAt() { return this.departsAt; }
    public void setDepartsAt(Date departsAt) { this.departsAt = departsAt; }
    //endregion

}
