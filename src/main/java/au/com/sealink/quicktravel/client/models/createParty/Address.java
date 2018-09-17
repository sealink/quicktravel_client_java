package au.com.sealink.quicktravel.client.models.createParty;

import com.google.gson.annotations.SerializedName;

public class Address {
    @SerializedName("city")
    private String city;

    @SerializedName("state")
    private String state;

    @SerializedName("post_code")
    private String postcode;

    @SerializedName("country_id")
    private Integer countryId;

    @SerializedName("address_line1")
    private String addressLine1;

    @SerializedName("address_line2")
    private String addressLine2;

    //region GETTER/SETTERS
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
    //endregion
}
