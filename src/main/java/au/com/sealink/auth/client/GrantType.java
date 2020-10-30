package au.com.sealink.auth.client;

import com.google.gson.annotations.SerializedName;

public enum GrantType {
    @SerializedName("password")
    Password,
    @SerializedName("client_credentials")
    ClientCredentials
}
