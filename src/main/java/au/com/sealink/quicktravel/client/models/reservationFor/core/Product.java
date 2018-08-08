package au.com.sealink.quicktravel.client.models.reservationFor.core;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {
    @SerializedName("product_id")
    @Expose
    private String productId;

    @SerializedName("product_id_field")
    @Expose
    private String productIdField;

    @SerializedName("resource_id")
    @Expose
    private int resourceId;

    @SerializedName("tariff_level_id")
    @Expose
    private int tariffLevelId;

    @SerializedName("service_ids")
    @Expose
    private List<Integer> serviceIds = new ArrayList<>();

    @SerializedName("first_travel_date")
    @Expose
    private String firstTravelDate;

    @SerializedName("last_travel_date")
    @Expose
    private String lastTravelDate;

    @SerializedName("service_state_ids")
    @Expose
    private List<Integer> serviceStateIds = new ArrayList<>();

    @SerializedName("exception_type")
    @Expose
    private String exceptionType;

    @SerializedName("bookable")
    @Expose
    private boolean bookable;

    @SerializedName("reason_unbookable")
    @Expose
    private String reasonUnbookable;

    @SerializedName("service_notes")
    @Expose
    private String serviceNotes;

    @SerializedName("booking_notes")
    @Expose
    private String bookingNotes;

    @SerializedName("inventory_type_code")
    @Expose
    private String inventoryTypeCode;

    @SerializedName("price_in_cents")
    @Expose
    private int priceInCents;

    @SerializedName("pre_adjusted_price_in_cents")
    @Expose
    private int preAdjustedPriceInCents;

    @SerializedName("total_price_adjustment_in_cents")
    @Expose
    private int totalPriceAdjustmentInCents;

    @SerializedName("adjustments")
    @Expose
    private List<Adjustment> adjustments = new ArrayList<>();

    @SerializedName("selection_name")
    @Expose
    private String selectionName;

    @SerializedName("trip_id")
    @Expose
    private int tripId;

    @SerializedName("stop_departure_time")
    @Expose
    private String stopDepartureTime;

    @SerializedName("stop_arrival_time")
    @Expose
    private String stopArrivalTime;

    @SerializedName("from_route_stop_attributes")
    @Expose
    private RouteStop fromRouteStop;

    @SerializedName("to_route_stop_attributes")
    @Expose
    private RouteStop toRouteStop;

    @SerializedName("departure_time")
    @Expose
    private String departureTime;

    @SerializedName("arrival_time")
    @Expose
    private String arrivalTime;

    @SerializedName("price_breakdown_passengers_in_cents")
    @Expose
    private int priceBreakdownPassengersInCents;

    @SerializedName("price_breakdown_vehicles_in_cents")
    @Expose
    private int priceBreakdownVehiclesInCents;

    //region GETTER/SETTERS
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductIdField() {
        return productIdField;
    }

    public void setProductIdField(String productIdField) {
        this.productIdField = productIdField;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public int getTariffLevelId() {
        return tariffLevelId;
    }

    public void setTariffLevelId(int tariffLevelId) {
        this.tariffLevelId = tariffLevelId;
    }

    public List<Integer> getServiceIds() {
        return serviceIds;
    }

    public void setServiceIds(List<Integer> serviceIds) {
        this.serviceIds = serviceIds;
    }

    public String getFirstTravelDate() {
        return firstTravelDate;
    }

    public void setFirstTravelDate(String firstTravelDate) {
        this.firstTravelDate = firstTravelDate;
    }

    public String getLastTravelDate() {
        return lastTravelDate;
    }

    public void setLastTravelDate(String lastTravelDate) {
        this.lastTravelDate = lastTravelDate;
    }


    public List<Integer> getServiceStateIds() {
        return serviceStateIds;
    }

    public void setServiceStateIds(List<Integer> serviceStateIds) {
        this.serviceStateIds = serviceStateIds;
    }

    public String getExceptionType() {
        return exceptionType;
    }

    public void setExceptionType(String exceptionType) {
        this.exceptionType = exceptionType;
    }

    public boolean isBookable() {
        return bookable;
    }

    public void setBookable(boolean bookable) {
        this.bookable = bookable;
    }

    public String getReasonUnbookable() {
        return reasonUnbookable;
    }

    public void setReasonUnbookable(String reasonUnbookable) {
        this.reasonUnbookable = reasonUnbookable;
    }

    public String getServiceNotes() {
        return serviceNotes;
    }

    public void setServiceNotes(String serviceNotes) {
        this.serviceNotes = serviceNotes;
    }

    public String getBookingNotes() {
        return bookingNotes;
    }

    public void setBookingNotes(String bookingNotes) {
        this.bookingNotes = bookingNotes;
    }

    public String getInventoryTypeCode() {
        return inventoryTypeCode;
    }

    public void setInventoryTypeCode(String inventoryTypeCode) {
        this.inventoryTypeCode = inventoryTypeCode;
    }

    public int getPriceInCents() {
        return priceInCents;
    }

    public void setPriceInCents(int priceInCents) {
        this.priceInCents = priceInCents;
    }

    public int getPreAdjustedPriceInCents() {
        return preAdjustedPriceInCents;
    }

    public void setPreAdjustedPriceInCents(int preAdjustedPriceInCents) {
        this.preAdjustedPriceInCents = preAdjustedPriceInCents;
    }

    public int getTotalPriceAdjustmentInCents() {
        return totalPriceAdjustmentInCents;
    }

    public void setTotalPriceAdjustmentInCents(int totalPriceAdjustmentInCents) {
        this.totalPriceAdjustmentInCents = totalPriceAdjustmentInCents;
    }

    public List<Adjustment> getAdjustments() {
        return adjustments;
    }

    public void setAdjustments(List<Adjustment> adjustments) {
        this.adjustments = adjustments;
    }

    public String getSelectionName() {
        return selectionName;
    }

    public void setSelectionName(String selectionName) {
        this.selectionName = selectionName;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public String getStopDepartureTime() {
        return stopDepartureTime;
    }

    public void setStopDepartureTime(String stopDepartureTime) {
        this.stopDepartureTime = stopDepartureTime;
    }

    public String getStopArrivalTime() {
        return stopArrivalTime;
    }

    public void setStopArrivalTime(String stopArrivalTime) {
        this.stopArrivalTime = stopArrivalTime;
    }

    public RouteStop getFromRouteStop() {
        return fromRouteStop;
    }

    public void setFromRouteStop(RouteStop fromRouteStop) {
        this.fromRouteStop = fromRouteStop;
    }

    public RouteStop getToRouteStop() {
        return toRouteStop;
    }

    public void setToRouteStop(RouteStop toRouteStop) {
        this.toRouteStop = toRouteStop;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getPriceBreakdownPassengersInCents() {
        return priceBreakdownPassengersInCents;
    }

    public void setPriceBreakdownPassengersInCents(int priceBreakdownPassengersInCents) {
        this.priceBreakdownPassengersInCents = priceBreakdownPassengersInCents;
    }

    public int getPriceBreakdownVehiclesInCents() {
        return priceBreakdownVehiclesInCents;
    }

    public void setPriceBreakdownVehiclesInCents(int priceBreakdownVehiclesInCents) {
        this.priceBreakdownVehiclesInCents = priceBreakdownVehiclesInCents;
    }
    //endregion
}
