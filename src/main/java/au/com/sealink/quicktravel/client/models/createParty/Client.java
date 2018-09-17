package au.com.sealink.quicktravel.client.models.createParty;

import com.google.gson.annotations.SerializedName;

public class Client {
    @SerializedName("client_type_id")
    private int clientTypeId;

    @SerializedName("is_frequent_traveller")
    private Boolean isFrequentTraveller;

    @SerializedName("external_identifier")
    private String externalIdentifier;

    @SerializedName("commission_level_id")
    private Integer commissionLevelId;

    //region GETTER/SETTERS
    public int getClientTypeId() {
        return clientTypeId;
    }

    public void setClientTypeId(int clientTypeId) {
        this.clientTypeId = clientTypeId;
    }

    public Boolean getFrequentTraveller() {
        return isFrequentTraveller;
    }

    public void setFrequentTraveller(Boolean frequentTraveller) {
        isFrequentTraveller = frequentTraveller;
    }

    public String getExternalIdentifier() {
        return externalIdentifier;
    }

    public void setExternalIdentifier(String externalIdentifier) {
        this.externalIdentifier = externalIdentifier;
    }

    public Integer getCommissionLevelId() {
        return commissionLevelId;
    }

    public void setCommissionLevelId(Integer commissionLevelId) {
        this.commissionLevelId = commissionLevelId;
    }
    //endregion
}