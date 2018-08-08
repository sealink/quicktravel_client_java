package au.com.sealink.quicktravel.client.models.reservationFor.core;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Adjustment {
    @SerializedName("gross_in_cents")
    @Expose
    private int grossInCents;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("adjustment_definition_id")
    @Expose
    private int adjustmentDefinitionId;

    @SerializedName("adjustment_category_id")
    @Expose
    private int adjustmentCategoryId;

    public int getGrossInCents() {
        return grossInCents;
    }

    public void setGrossInCents(int grossInCents) {
        this.grossInCents = grossInCents;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAdjustmentDefinitionId() {
        return adjustmentDefinitionId;
    }

    public void setAdjustmentDefinitionId(int adjustmentDefinitionId) {
        this.adjustmentDefinitionId = adjustmentDefinitionId;
    }

    public int getAdjustmentCategoryId() {
        return adjustmentCategoryId;
    }

    public void setAdjustmentCategoryId(int adjustmentCategoryId) {
        this.adjustmentCategoryId = adjustmentCategoryId;
    }
}
