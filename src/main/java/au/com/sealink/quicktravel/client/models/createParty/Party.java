package au.com.sealink.quicktravel.client.models.createParty;

import com.google.gson.annotations.SerializedName;

public class Party {
    @SerializedName("contact")
    private Contact contact;

    @SerializedName("address")
    private Address address;

    @SerializedName("client")
    private Client client;

    @SerializedName("type")
    private String partyType;

    @SerializedName("gender")
    private String gender;

    @SerializedName("title")
    private String title;

    @SerializedName("authentication")
    private Authentication authentication;

    public Party(String partyType) {
        this.partyType = partyType;
    }

    //region GETTER/SETTERS
    public Contact getContact() {
        return contact;
    }

    public Address getAddress() {
        return address;
    }

    public Client getClient() {
        return client;
    }

    public String getGender() {
        return gender;
    }

    public String getTitle() {
        return title;
    }

    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getPartyType() {
        return this.partyType;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    //endregion
}
