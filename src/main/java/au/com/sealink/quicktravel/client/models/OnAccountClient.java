package au.com.sealink.quicktravel.client.models;

import com.google.gson.annotations.SerializedName;

public class OnAccountClient {
    @SerializedName("client_id")
    private int clientId;

    @SerializedName("external_identifier")
    private String externalIdentifier;

    @SerializedName("payment_method")
    private PaymentMethod paymentMethod = PaymentMethod.PayDirect;

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getExternalIdentifier() {
        return externalIdentifier;
    }

    public void setExternalIdentifier(String externalIdentifier) {
        this.externalIdentifier = externalIdentifier;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
