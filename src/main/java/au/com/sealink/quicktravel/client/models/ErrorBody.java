package au.com.sealink.quicktravel.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ErrorBody {
    @SerializedName("error")
    @Expose
    private String error;

    public String getError() {
        return error;
    }

    public ErrorBody(String error) {
        this.error = error;
    }
}
