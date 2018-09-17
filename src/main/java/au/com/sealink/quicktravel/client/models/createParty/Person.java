package au.com.sealink.quicktravel.client.models.createParty;

import com.google.gson.annotations.SerializedName;

public class Person extends Party {
    @SerializedName("first_name")
    private String firstName;

    @SerializedName("last_name")
    private String lastName;

    public Person() {
        super("Person");
    }

    //region GETTER/SETTERS
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //endregion
}
