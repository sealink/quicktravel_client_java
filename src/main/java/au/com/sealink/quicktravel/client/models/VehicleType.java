package au.com.sealink.quicktravel.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class VehicleType {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("minimum_length")
    @Expose
    private Object minimumLength;
    @SerializedName("fixed_length")
    @Expose
    private Boolean fixedLength;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("default")
    @Expose
    private Boolean _default;
    @SerializedName("trailer")
    @Expose
    private Boolean trailer;
    @SerializedName("maximum_length")
    @Expose
    private Object maximumLength;
    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("fixed_weight")
    @Expose
    private Boolean fixedWeight;
    @SerializedName("default_weight")
    @Expose
    private String defaultWeight;
    @SerializedName("detail_prompt")
    @Expose
    private String detailPrompt;
    @SerializedName("has_cargo")
    @Expose
    private Boolean hasCargo;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("appear_on_manifest")
    @Expose
    private Boolean appearOnManifest;
    @SerializedName("created_at")
    @Expose
    private Date createdAt;
    @SerializedName("updated_at")
    @Expose
    private Date updatedAt;
    @SerializedName("multiply_length")
    @Expose
    private Boolean multiplyLength;
    @SerializedName("default_length")
    @Expose
    private String defaultLength;
    @SerializedName("fixed_height")
    @Expose
    private Boolean fixedHeight;
    @SerializedName("default_height")
    @Expose
    private String defaultHeight;
    @SerializedName("require_drop_off_location")
    @Expose
    private Boolean requireDropOffLocation;

    //region GETTER/SETTERS
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getMinimumLength() {
        return minimumLength;
    }

    public void setMinimumLength(Object minimumLength) {
        this.minimumLength = minimumLength;
    }

    public Boolean getFixedLength() {
        return fixedLength;
    }

    public void setFixedLength(Boolean fixedLength) {
        this.fixedLength = fixedLength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDefault() {
        return _default;
    }

    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    public Boolean getTrailer() {
        return trailer;
    }

    public void setTrailer(Boolean trailer) {
        this.trailer = trailer;
    }

    public Object getMaximumLength() {
        return maximumLength;
    }

    public void setMaximumLength(Object maximumLength) {
        this.maximumLength = maximumLength;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Boolean getFixedWeight() {
        return fixedWeight;
    }

    public void setFixedWeight(Boolean fixedWeight) {
        this.fixedWeight = fixedWeight;
    }

    public String getDefaultWeight() {
        return defaultWeight;
    }

    public void setDefaultWeight(String defaultWeight) {
        this.defaultWeight = defaultWeight;
    }

    public String getDetailPrompt() {
        return detailPrompt;
    }

    public void setDetailPrompt(String detailPrompt) {
        this.detailPrompt = detailPrompt;
    }

    public Boolean getHasCargo() {
        return hasCargo;
    }

    public void setHasCargo(Boolean hasCargo) {
        this.hasCargo = hasCargo;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getAppearOnManifest() {
        return appearOnManifest;
    }

    public void setAppearOnManifest(Boolean appearOnManifest) {
        this.appearOnManifest = appearOnManifest;
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

    public Boolean getMultiplyLength() {
        return multiplyLength;
    }

    public void setMultiplyLength(Boolean multiplyLength) {
        this.multiplyLength = multiplyLength;
    }

    public String getDefaultLength() {
        return defaultLength;
    }

    public void setDefaultLength(String defaultLength) {
        this.defaultLength = defaultLength;
    }

    public Boolean getFixedHeight() {
        return fixedHeight;
    }

    public void setFixedHeight(Boolean fixedHeight) {
        this.fixedHeight = fixedHeight;
    }

    public String getDefaultHeight() {
        return defaultHeight;
    }

    public void setDefaultHeight(String defaultHeight) {
        this.defaultHeight = defaultHeight;
    }

    public Boolean getRequireDropOffLocation() {
        return requireDropOffLocation;
    }

    public void setRequireDropOffLocation(Boolean requireDropOffLocation) {
        this.requireDropOffLocation = requireDropOffLocation;
    }
    //endregion
}
