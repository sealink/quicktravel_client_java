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
    private Float minimumLength;
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
    private Boolean defaultType;
    @SerializedName("trailer")
    @Expose
    private Boolean trailer;
    @SerializedName("maximum_length")
    @Expose
    private Float maximumLength;
    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("fixed_weight")
    @Expose
    private Boolean fixedWeight;
    @SerializedName("default_weight")
    @Expose
    private Float defaultWeight;
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
    @SerializedName("multiply_length")
    @Expose
    private Boolean multiplyLength;
    @SerializedName("default_length")
    @Expose
    private Float defaultLength;
    @SerializedName("fixed_height")
    @Expose
    private Boolean fixedHeight;
    @SerializedName("default_height")
    @Expose
    private Float defaultHeight;
    @SerializedName("require_drop_off_location")
    @Expose
    private Boolean requireDropOffLocation;
    @SerializedName("has_driver")
    @Expose
    private Boolean hasDriver;

    //region GETTER/SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Float getMinimumLength() {
        return minimumLength;
    }

    public void setMinimumLength(Float minimumLength) {
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
        return defaultType;
    }

    public void setDefault(Boolean defaultType) {
        this.defaultType = defaultType;
    }

    public Boolean getTrailer() {
        return trailer;
    }

    public void setTrailer(Boolean trailer) {
        this.trailer = trailer;
    }

    public Float getMaximumLength() {
        return maximumLength;
    }

    public void setMaximumLength(Float maximumLength) {
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

    public Float getDefaultWeight() {
        return defaultWeight;
    }

    public void setDefaultWeight(Float defaultWeight) {
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

    public Boolean getMultiplyLength() {
        return multiplyLength;
    }

    public void setMultiplyLength(Boolean multiplyLength) {
        this.multiplyLength = multiplyLength;
    }

    public Float getDefaultLength() {
        return defaultLength;
    }

    public void setDefaultLength(Float defaultLength) {
        this.defaultLength = defaultLength;
    }

    public Boolean getFixedHeight() {
        return fixedHeight;
    }

    public void setFixedHeight(Boolean fixedHeight) {
        this.fixedHeight = fixedHeight;
    }

    public Float getDefaultHeight() {
        return defaultHeight;
    }

    public void setDefaultHeight(Float defaultHeight) {
        this.defaultHeight = defaultHeight;
    }

    public Boolean getRequireDropOffLocation() {
        return requireDropOffLocation;
    }

    public void setRequireDropOffLocation(Boolean requireDropOffLocation) {
        this.requireDropOffLocation = requireDropOffLocation;
    }

    public Boolean getHasDriver() {
        return hasDriver;
    }

    public void setHasDriver(Boolean hasDriver) {
        this.hasDriver = hasDriver;
    }
    //endregion
}
