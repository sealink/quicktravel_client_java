package au.com.sealink.quicktravel.client.models.reservationFor.core;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RouteStop {
    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("inventory_controlled")
    @Expose
    private boolean inventoryControlled;

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

    //region GETTER/SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isInventoryControlled() {
        return inventoryControlled;
    }

    public void setInventoryControlled(boolean inventoryControlled) {
        this.inventoryControlled = inventoryControlled;
    }

    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getStopId() {
        return stopId;
    }

    public void setStopId(int stopId) {
        this.stopId = stopId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    //endregion
}
