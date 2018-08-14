package au.com.sealink.quicktravel.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Booking {
    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("state")
    @Expose
    private String state;

    @SerializedName("reference")
    @Expose
    private String reference;

    @SerializedName("country_id")
    @Expose
    private int countryId;

    @SerializedName("public_comments")
    @Expose
    private String publicComments;

    @SerializedName("internal_comments")
    @Expose
    private String internalComments;

    @SerializedName("post_code")
    @Expose
    private String postCode;

    @SerializedName("external_identifier")
    @Expose
    private String externalIdentifier;

    @SerializedName("gross_in_cents")
    @Expose
    private int grossInCents;

    @SerializedName("nett_in_cents")
    @Expose
    private int nettInCents;

    @SerializedName("client")
    @Expose
    private Client client;

    @SerializedName("created_at")
    @Expose
    private Date createdAt;

    @SerializedName("updated_at")
    @Expose
    private Date updatedAt;

    //region GETTER/SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getPublicComments() {
        return publicComments;
    }

    public void setPublicComments(String publicComments) {
        this.publicComments = publicComments;
    }

    public String getInternalComments() {
        return internalComments;
    }

    public void setInternalComments(String internalComments) {
        this.internalComments = internalComments;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getExternalIdentifier() {
        return externalIdentifier;
    }

    public void setExternalIdentifier(String externalIdentifier) {
        this.externalIdentifier = externalIdentifier;
    }

    public int getGrossInCents() {
        return grossInCents;
    }

    public void setGrossInCents(int grossInCents) {
        this.grossInCents = grossInCents;
    }

    public int getNettInCents() {
        return nettInCents;
    }

    public void setNettInCents(int netInCents) {
        this.nettInCents = netInCents;
    }
    //endregion
}
