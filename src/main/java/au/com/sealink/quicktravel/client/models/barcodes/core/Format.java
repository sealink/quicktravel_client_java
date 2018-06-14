package au.com.sealink.quicktravel.client.models.barcodes.core;

import com.google.gson.annotations.SerializedName;

public enum Format {
    @SerializedName("-1")
    None(-1),
    @SerializedName("0")
    ConsumerSplit(0),
    @SerializedName("1")
    Reservation(1),
    @SerializedName("2")
    IssuedTicket(2);

    private final int value;

    Format(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
