package au.com.sealink.quicktravel.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class PassengerType {
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("minimum_age")
    @Expose
    private Integer minimumAge;
    @SerializedName("maximum_age")
    @Expose
    private Integer maximumAge;
    @SerializedName("age_range_required")
    @Expose
    private Boolean ageRangeRequired;
    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("default_age")
    @Expose
    private Integer defaultAge;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("conditions")
    @Expose
    private String conditions;
    @SerializedName("requires_review")
    @Expose
    private Boolean requiresReview;

    //region GETTER/SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(Integer minimumAge) {
        this.minimumAge = minimumAge;
    }

    public Integer getMaximumAge() {
        return maximumAge;
    }

    public void setMaximumAge(Integer maximumAge) {
        this.maximumAge = maximumAge;
    }

    public Boolean getAgeRangeRequired() {
        return ageRangeRequired;
    }

    public void setAgeRangeRequired(Boolean ageRangeRequired) {
        this.ageRangeRequired = ageRangeRequired;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getDefaultAge() {
        return defaultAge;
    }

    public void setDefaultAge(Integer defaultAge) {
        this.defaultAge = defaultAge;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public Boolean getRequiresReview() {
        return requiresReview;
    }

    public void setRequiresReview(Boolean requiresReview) {
        this.requiresReview = requiresReview;
    }
    //endregion
}
