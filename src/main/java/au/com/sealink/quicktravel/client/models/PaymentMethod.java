package au.com.sealink.quicktravel.client.models;

import com.google.gson.annotations.SerializedName;

public enum PaymentMethod {
    @SerializedName("0")
    PayDirect(0),
    @SerializedName("2")
    OnAccount(2),
    @SerializedName("3")
    OnAccountRefRequired(3);

    private final int value;

    PaymentMethod(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}