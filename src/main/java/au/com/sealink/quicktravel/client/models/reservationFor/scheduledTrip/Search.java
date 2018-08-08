package au.com.sealink.quicktravel.client.models.reservationFor.scheduledTrip;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import au.com.sealink.quicktravel.client.models.reservationFor.core.Segment;

public class Search {
    @SerializedName("product_type_id")
    @Expose
    private int productTypeId;

    @SerializedName("route_id")
    @Expose
    private int routeId;

    @SerializedName("from_route_stop_id")
    @Expose
    private Integer fromRouteStopId = null;

    @SerializedName("to_route_stop_id")
    @Expose
    private Integer toRouteStopId = null;

    @SerializedName("client_id")
    @Expose
    private Integer clientId = null;

    @SerializedName("show")
    @Expose
    private String show = "inventory_exists";

    @SerializedName("add_return")
    @Expose
    private Boolean addReturn;

    @SerializedName("forward")
    @Expose
    private Segment forward = new Segment();

    @SerializedName("return")
    @Expose
    private Segment returning = new Segment();

    @SerializedName("segments")
    @Expose
    private List<String> mSegmentNames = new ArrayList<>();

    public Search() {
        mSegmentNames.add("forward");
        mSegmentNames.add("return");
    }

    //region GETTER/SETTERS
    public int getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(int productTypeId) {
        this.productTypeId = productTypeId;
    }

    public int getFromRouteStopId() {
        return fromRouteStopId;
    }

    public void setFromRouteStopId(int fromRouteStopId) {
        this.fromRouteStopId = fromRouteStopId;
    }

    public int getToRouteStopId() {
        return toRouteStopId;
    }

    public void setToRouteStopId(int toRouteStopId) {
        this.toRouteStopId = toRouteStopId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Boolean getAddReturn() {
        return addReturn;
    }

    public void setAddReturn(Boolean addReturn) {
        this.addReturn = addReturn;
    }

    public Segment getReturning() {
        return returning;
    }

    public Segment getForward() {
        return forward;
    }

    public String getShow() {
        return show;
    }

    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }
    //endregion
}

