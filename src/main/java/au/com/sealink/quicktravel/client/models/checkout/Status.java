package au.com.sealink.quicktravel.client.models.checkout;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Status {
    @SerializedName("progress")
    @Expose
    private String progress;

    @SerializedName("successful")
    @Expose
    private Boolean successful;

    @SerializedName("error")
    @Expose
    private String error;

    //region Getter/Setters
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public Boolean getSuccessful() {
        return successful;
    }

    public void setSuccessful(Boolean successful) {
        this.successful = successful;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
    //endregion
}
