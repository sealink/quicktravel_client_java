package au.com.sealink.quicktravel.client.models.barcodes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import au.com.sealink.quicktravel.client.models.barcodes.core.ConsumerTypeCount;
import au.com.sealink.quicktravel.client.models.barcodes.core.Passenger;
import au.com.sealink.quicktravel.client.models.barcodes.core.TicketTemplate;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IssuedTicket extends Base {
    @SerializedName("last_used_at")
    @Expose
    private Date lastUsedAt;
    @SerializedName("ticket_template")
    @Expose
    private TicketTemplate ticketTemplate;
    @SerializedName("passengers")
    @Expose
    private ConsumerTypeCount passengers;
    @SerializedName("vehicles")
    @Expose
    private ConsumerTypeCount vehicles;

    public Date getLastUsedAt() {
        return lastUsedAt;
    }

    public void setLastUsedAt(Date lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
    }

    public TicketTemplate getTicketTemplate() {
        return ticketTemplate;
    }

    public void setTicketTemplate(TicketTemplate ticketTemplate) {
        this.ticketTemplate = ticketTemplate;
    }
    public ConsumerTypeCount getPassengers() {
        return passengers;
    }

    public void setPassengers(ConsumerTypeCount passengers) {
        this.passengers = passengers;
    }

    public ConsumerTypeCount getVehicles() {
        return vehicles;
    }

    public void setVehicles(ConsumerTypeCount vehicles) {
        this.vehicles = vehicles;
    }
}