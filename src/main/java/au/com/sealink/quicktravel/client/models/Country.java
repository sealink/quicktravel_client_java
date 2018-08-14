package au.com.sealink.quicktravel.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Country {
    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("iso_3166_code")
    @Expose
    private String iso_3166_code;

    //region Getter/Setters
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

    public String getISO3166Code() {
        return iso_3166_code;
    }

    public void setISO3166Code(String iso_3166_code) {
        this.iso_3166_code = iso_3166_code;
    }
    //endregion
}
