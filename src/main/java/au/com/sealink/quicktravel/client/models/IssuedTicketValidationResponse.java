package au.com.sealink.quicktravel.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IssuedTicketValidationResponse {
    @SerializedName("ticket")
    @Expose
    private IssuedTicket ticket;

    public IssuedTicket getTicket() {
        return ticket;
    }
}
