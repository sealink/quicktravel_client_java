package au.com.sealink.quicktravel.client.models.barcodes.core;

import com.google.gson.annotations.SerializedName;

public enum ActivationTrigger {
    @SerializedName("creation")
    Creation,
    @SerializedName("first_travel_date")
    FirstTravelDate,
    @SerializedName("first_use")
    FirstUse
}
