package au.com.sealink.quicktravel.client.models;

import au.com.sealink.quicktravel.client.models.createParty.Party;
import com.google.gson.annotations.SerializedName;

public class CreateParty {
    @SerializedName("party")
    private Party party;

    public CreateParty(Party party) {
        this.party = party;
    }
}
