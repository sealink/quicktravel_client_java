package au.com.sealink.quicktravel.client.models.checkout;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CheckoutResponse {
    @Expose
    @SerializedName("checkout_id")
    private String checkoutId;

    @Expose
    @SerializedName("completable")
    private boolean completable;

    @Expose
    @SerializedName("progress")
    private String progress;

    //region Getter/Setters
    public String getCheckoutId() {
        return checkoutId;
    }

    public void setCheckoutId(String checkoutId) {
        this.checkoutId = checkoutId;
    }

    public boolean isCompletable() {
        return completable;
    }

    public void setCompletable(boolean completable) {
        this.completable = completable;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }
    //endregion
}
