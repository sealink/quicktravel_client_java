package au.com.sealink.quicktravel.client.models.barcodes.core;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TicketTemplate {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("activation_trigger")
    @Expose
    private ActivationTrigger activationTrigger;
    @SerializedName("expiry_days")
    @Expose
    private int expiryDays;
    @SerializedName("maximum_uses")
    @Expose
    private int maximumUses;
    @SerializedName("validity_duration_minutes")
    @Expose
    private int validityDurationMinutes;
    @SerializedName("daily_uses_limit")
    @Expose
    private Integer dailyUsesLimit;

    //region GETTER/SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActivationTrigger getActivationTrigger() {
        return activationTrigger;
    }

    public int getExpiryDays() {
        return expiryDays;
    }

    public int getMaximumUses() {
        return maximumUses;
    }

    public int getValidityDurationMinutes() {
        return validityDurationMinutes;
    }

    public void setValidityDurationMinutes(int validityDurationMinutes) {
        this.validityDurationMinutes = validityDurationMinutes;
    }

    public Object getDailyUsesLimit() {
        return dailyUsesLimit;
    }
    //endregion
}

