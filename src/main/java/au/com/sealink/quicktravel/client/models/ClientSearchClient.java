package au.com.sealink.quicktravel.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClientSearchClient {
    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("label")
    @Expose
    private String label;

    @SerializedName("pic")
    @Expose
    private String pictureUrl;

    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("phone")
    @Expose
    private String phone;

    @SerializedName("mobile")
    @Expose
    private String mobile;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("notes")
    @Expose
    private String notes;

    @SerializedName("payment_method_name")
    @Expose
    private String paymentMethodName;

    @SerializedName("client_ext_id")
    @Expose
    private String externalIdentifier;

    //region Getter/Setters
    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getMobile() {
        return mobile;
    }

    public String getType() {
        return type;
    }

    public String getNotes() {
        return notes;
    }

    public String getPaymentMethodName() {
        return paymentMethodName;
    }

    public String getExternalIdentifier() {
        return externalIdentifier;
    }
    //endregion
}
