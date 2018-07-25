package au.com.sealink.quicktravel.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RouteStop {
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("route_id")
    @Expose
    private int routeId;
    @SerializedName("position")
    @Expose
    private int position;
    @SerializedName("stop_id")
    @Expose
    private int stopId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("address")
    @Expose
    private String address;

    //region GETTER/SETTERS
    public int getId() {
        return id;
    }

    public int getRouteId() {
        return routeId;
    }

    public int getPosition() {
        return position;
    }

    public int getStopId() {
        return stopId;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getAddress() {
        return address;
    }
    //endregion
}
