package au.com.sealink.quicktravel.client.models.checkout;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Payment {
    @SerializedName("amount_in_cents")
    @Expose
    private int amountInCents;

    @SerializedName("payment_type_id")
    @Expose
    private int paymentTypeId;

    @SerializedName("uid")
    @Expose
    private String uid;

    @SerializedName("comment")
    @Expose
    private String comment;

    @SerializedName("till_id")
    @Expose
    private int tillId;

    public int getAmountInCents() {
        return amountInCents;
    }

    public void setAmountInCents(int amountInCents) {
        this.amountInCents = amountInCents;
    }

    public int getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(int paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getTillId() {
        return tillId;
    }

    public void setTillId(int tillId) {
        this.tillId = tillId;
    }
}
