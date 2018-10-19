package au.com.sealink.quicktravel.client.models;

import au.com.sealink.quicktravel.client.models.barcodes.core.ConsumerTypeCount;
import au.com.sealink.quicktravel.client.models.barcodes.core.Resource;
import au.com.sealink.quicktravel.client.models.barcodes.core.TicketTemplate;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IssuedTicket {
    @Expose
    @SerializedName("out_of_daily_uses")
    private boolean outOfDailyUses;

    @Expose
    @SerializedName("in_use")
    private boolean inUse;

    @SerializedName("usable")
    @Expose
    private boolean usable;

    @SerializedName("expired")
    @Expose
    private boolean expired;

    @SerializedName("out_of_uses")
    @Expose
    private boolean outOfUses;

    @SerializedName("travel_date")
    @Expose
    private String travelDate;

    @SerializedName("expiry_days")
    @Expose
    private int expiryDays;

    @SerializedName("expiry")
    @Expose
    private String expiry;

    @SerializedName("resource")
    @Expose
    private Resource resource;

    @SerializedName("qr_data")
    @Expose
    private String qrData;

    @SerializedName("details")
    @Expose
    private String details;

    @SerializedName("ticket_template")
    @Expose
    private TicketTemplate ticketTemplate = new TicketTemplate();

    @SerializedName("uses")
    @Expose
    private List<Date> uses = new ArrayList<>();

    @SerializedName("reference")
    @Expose
    private String reference;

    @SerializedName("created_at")
    @Expose
    private Date createdAt;

    @SerializedName("passengers")
    @Expose
    private ConsumerTypeCount passengers;

    @SerializedName("vehicles")
    @Expose
    private ConsumerTypeCount vehicles;

    public boolean isOutOfDailyUses() {
        return outOfDailyUses;
    }

    public boolean isInUse() {
        return inUse;
    }

    public boolean isUsable() {
        return usable;
    }

    public boolean isExpired() {
        return expired;
    }

    public boolean isOutOfUses() {
        return outOfUses;
    }

    public int getExpiryDays() {
        return expiryDays;
    }

    public void setExpiryDays(int expiryDays) {
        this.expiryDays = expiryDays;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public String getQrData() {
        return qrData;
    }


    public TicketTemplate getTicketTemplate() {
        return ticketTemplate;
    }

    public void setTicketTemplate(TicketTemplate ticketTemplate) {
        this.ticketTemplate = ticketTemplate;
    }

    public List<Date> getUses() {
        return uses;
    }


    public int getRemainingTrips() {
        return getTicketTemplate().getMaximumUses() - getUses().size();
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


    public ConsumerTypeCount getPassengers() {
        return passengers;
    }

    public DateTime getValidUntil() {
        Date lastUsed = this.getLastUsedAt();
        if (lastUsed != null) {
            return new DateTime(lastUsed).plusMinutes(getTicketTemplate().getValidityDurationMinutes());
        }
        return null;
    }

    public Date getLastUsedAt() {
        if (uses.size() == 0) {
            return null;
        }
        return uses.get(uses.size() - 1);
    }

    public DateTime getExpiryDate() {
        if (createdAt != null) {
            return new DateTime(createdAt).plusDays(getExpiryDays());
        }
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof IssuedTicket) {
            return this.getReference().equals(((IssuedTicket) obj).getReference());
        }
        return super.equals(obj);
    }

    public ConsumerTypeCount getVehicles() {
        return vehicles;
    }

    public String getTravelDate() {
        return travelDate;
    }


    public String getDetails() {
        return details;
    }


    public String getExpiry() {
        return expiry;
    }
}
