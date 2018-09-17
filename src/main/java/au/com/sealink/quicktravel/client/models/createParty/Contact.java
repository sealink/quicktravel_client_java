package au.com.sealink.quicktravel.client.models.createParty;

import com.google.gson.annotations.SerializedName;

public class Contact {
    @SerializedName("email")
    private String email;

    @SerializedName("fax")
    private String fax;

    @SerializedName("mobile")
    private String mobile;

    @SerializedName("phone")
    private String phone;

    @SerializedName("website")
    private String website;

    //region GETTER/SETTERS
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
    //endregion
}