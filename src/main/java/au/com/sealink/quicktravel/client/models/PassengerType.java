package au.com.sealink.quicktravel.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class PassengerType {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("minimum_age")
    @Expose
    private Object minimumAge;
    @SerializedName("maximum_age")
    @Expose
    private Object maximumAge;
    @SerializedName("age_range_required")
    @Expose
    private Boolean ageRangeRequired;
    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("default_age")
    @Expose
    private Integer defaultAge;
    @SerializedName("created_at")
    @Expose
    private Date createdAt;
    @SerializedName("updated_at")
    @Expose
    private Date updatedAt;
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
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(Object minimumAge) {
        this.minimumAge = minimumAge;
    }

    public Object getMaximumAge() {
        return maximumAge;
    }

    public void setMaximumAge(Object maximumAge) {
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
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
