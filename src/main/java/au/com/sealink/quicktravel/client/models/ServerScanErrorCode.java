package au.com.sealink.quicktravel.client.models;

import com.google.gson.annotations.SerializedName;

public enum ServerScanErrorCode {
    @SerializedName("0")
    None(0),
    @SerializedName("1")
    WrongDate(1),
    @SerializedName("2")
    WrongResource(2),
    @SerializedName("3")
    WrongTime(3);

    private final int value;

    ServerScanErrorCode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
