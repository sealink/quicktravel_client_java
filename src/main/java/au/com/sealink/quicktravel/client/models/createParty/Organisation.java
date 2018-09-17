package au.com.sealink.quicktravel.client.models.createParty;

import com.google.gson.annotations.SerializedName;

public class Organisation extends Party {
    @SerializedName("name")
    private String name;

    @SerializedName("business_number")
    private String businessNumber;

    @SerializedName("business_number_type")
    private String businessNumberType;

    public Organisation() {
        super("Organisation");
    }

    //region GETTER/SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBusinessNumber() {
        return businessNumber;
    }

    public void setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
    }

    public String getBusinessNumberType() {
        return businessNumberType;
    }

    public void setBusinessNumberType(String businessNumberType) {
        this.businessNumberType = businessNumberType;
    }
    //endregion
}
