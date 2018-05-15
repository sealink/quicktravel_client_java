package au.com.sealink.quicktravel.client.models.barcodes;

import java.util.Date;
import au.com.sealink.quicktravel.client.models.barcodes.core.ConsumerTypeCount;
import au.com.sealink.quicktravel.client.models.barcodes.core.TicketTemplate;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.joda.time.DateTime;

public class IssuedTicket extends BaseTicket {
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

    //region GETTERS/SETTERS
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
    //endregion

    @Override
    public boolean isActive() {
        if (getLastUsedAt() == null) {
            return true;
        }

        int validityMinutes = getTicketTemplate().getValidityDurationMinutes();
        DateTime expiry = new DateTime(getLastUsedAt()).plusMinutes(validityMinutes);
        return expiry.isAfterNow();
    }
}