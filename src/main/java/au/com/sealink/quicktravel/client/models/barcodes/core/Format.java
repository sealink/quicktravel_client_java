package au.com.sealink.quicktravel.client.models.barcodes.core;

import com.google.gson.annotations.SerializedName;

public enum Format {
    @SerializedName("0")
    ConsumerSplit,
    @SerializedName("1")
    Reservation,
    @SerializedName("2")
    IssuedTicket
}
