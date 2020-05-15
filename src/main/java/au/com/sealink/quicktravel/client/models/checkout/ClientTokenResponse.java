package au.com.sealink.quicktravel.client.models.checkout;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClientTokenResponse {
    @SerializedName("client_token")
    @Expose
    private String clientToken;

    //region GETTER/SETTERS
    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String token) {
        this.clientToken = token;
    }
    //endregion
}
