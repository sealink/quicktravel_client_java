package au.com.sealink.quicktravel.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EncryptedData {
    @SerializedName("encrypted_data")
    @Expose
    private String encryptedData;

    public String getEncryptedData() {
        return encryptedData;
    }
}
