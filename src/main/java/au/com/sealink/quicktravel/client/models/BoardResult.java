package au.com.sealink.quicktravel.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class BoardResult {
    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("error")
    @Expose
    private String error;

    @SerializedName("status")
    @Expose
    private int status;

    @SerializedName("diff")
    @Expose
    private List<List<String>> diff = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<List<String>> getDiff() {
        return diff;
    }
}
