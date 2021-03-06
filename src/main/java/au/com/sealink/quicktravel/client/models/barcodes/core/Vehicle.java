package au.com.sealink.quicktravel.client.models.barcodes.core;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Vehicle {
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("type")
    @Expose
    private ConsumerType type;
    @SerializedName("length")
    @Expose
    private Float length;
    @SerializedName("width")
    @Expose
    private Float width;
    @SerializedName("height")
    @Expose
    private Float height;
    @SerializedName("details")
    @Expose
    private String details;
    @SerializedName("cargo")
    @Expose
    private String cargo;
    @SerializedName("registration")
    @Expose
    private String registration;

    //region GETTER/SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ConsumerType getConsumerType() {
        return type;
    }

    public float getLength() {
        return length;
    }

    public Float getWidth() {
        return width;
    }

    public Float getHeight() {
        return height;
    }

    public String getDetails() {
        return details;
    }

    public String getCargo() {
        return cargo;
    }

    public String getRegistration() {
        return registration;
    }
    //endregion
}
