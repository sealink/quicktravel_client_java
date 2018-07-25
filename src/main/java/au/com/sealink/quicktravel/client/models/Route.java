package au.com.sealink.quicktravel.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Route {
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("reverse_id")
    @Expose
    private int reverseId;
    @SerializedName("position")
    @Expose
    private int position;
    @SerializedName("product_type_id")
    @Expose
    private int productTypeId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("route_stops")
    @Expose
    private List<RouteStop> routeStops = new ArrayList<>();


    public int getId() {
        return id;
    }

    public int getReverseId() {
        return reverseId;
    }

    public int getPosition() {
        return position;
    }

    public int getProductTypeId() {
        return productTypeId;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public List<RouteStop> getRouteStops() {
        return routeStops;
    }
}
