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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActivationTrigger getActivationTrigger() {
        return activationTrigger;
    }

    public void setActivationTrigger(ActivationTrigger activationTrigger) {
        this.activationTrigger = activationTrigger;
    }

    public int getExpiryDays() {
        return expiryDays;
    }

    public void setExpiryDays(int expiryDays) {
        this.expiryDays = expiryDays;
    }

    public int getMaximumUses() {
        return maximumUses;
    }

    public void setMaximumUses(int maximumUses) {
        this.maximumUses = maximumUses;
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

    public void setDailyUsesLimit(Integer dailyUsesLimit) {
        this.dailyUsesLimit = dailyUsesLimit;
    }
}

