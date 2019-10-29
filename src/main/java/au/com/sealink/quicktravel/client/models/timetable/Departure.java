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

    @SerializedName("from_route_stop_id")
    @Expose
    int fromRouteStopId;

    @SerializedName("to_route_stop_id")
    @Expose
    int toRouteStopId;

    @SerializedName("state")
    @Expose
    String state;

    @SerializedName("departs_at")
    @Expose
    Date departsAt;

    public Departure(Date departsAt) {
        this.departsAt = departsAt;
    }

    //region GETTER/SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getDepartsAt() {
        return this.departsAt;
    }

    public void setDepartsAt(Date departsAt) {
        this.departsAt = departsAt;
    }

    public int getFromRouteStopId() {
        return this.fromRouteStopId;
    }

    public void setFromRouteStopId(int fromRouteStopId) {
        this.fromRouteStopId = fromRouteStopId;
    }

    public int getToRouteStopId() {
        return this.toRouteStopId;
    }

    public void setToRouteStopId(int toRouteStopId) {
        this.toRouteStopId = toRouteStopId;
    }
    //endregion
}
