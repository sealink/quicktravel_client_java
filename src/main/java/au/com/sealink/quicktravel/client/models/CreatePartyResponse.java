package au.com.sealink.quicktravel.client.models;

import com.google.gson.annotations.SerializedName;

public class CreatePartyResponse {
    @SerializedName("id")
    private int id;

    @SerializedName("client_id")
    private int clientId;

    public int getId() {
        return id;
    }

    public int getClientId() {
        return clientId;
    }
}
