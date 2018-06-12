package au.com.sealink.quicktravel.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PaymentType {
    @Expose
    @SerializedName("name")
    private String name;

    @Expose
    @SerializedName("gateway")
    private String gateway;

    @Expose
    @SerializedName("icon_url")
    private String iconUrl;

    @Expose
    @SerializedName("transaction_fee")
    private String transactionFee;

    //region GETTER/SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(String transactionFee) {
        this.transactionFee = transactionFee;
    }
    //endregion
}
