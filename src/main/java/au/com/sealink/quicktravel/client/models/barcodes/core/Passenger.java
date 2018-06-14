package au.com.sealink.quicktravel.client.models.barcodes.core;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Passenger {
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("type")
    @Expose
    private ConsumerType type;

    //region GETTER/SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConsumerType getConsumerType() {
        return this.type;
    }
    //endregion
}
