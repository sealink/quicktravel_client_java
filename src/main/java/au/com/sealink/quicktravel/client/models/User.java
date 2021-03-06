package au.com.sealink.quicktravel.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("csrf_auth_token")
    @Expose
    private String csrfAuthToken;

    public String getCsrfAuthToken() {
        return csrfAuthToken;
    }

    public void setCsrfAuthToken(String csrfAuthToken) {
        this.csrfAuthToken = csrfAuthToken;
    }
    //endregion
}
