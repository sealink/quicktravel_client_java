package au.com.sealink.quicktravel.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Resource {
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("resource_category_id")
    @Expose
    private int resourceCategoryId;
    @SerializedName("masterpoint_resource_id")
    @Expose
    private int masterpointResourceId;

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

    public int getResourceCategoryId() {
        return resourceCategoryId;
    }

    public void setResourceCategoryId(int id) {
        this.resourceCategoryId = id;
    }

    public int getMasterpointResourceId() {
      return this.masterpointResourceId;
    }

    public void setMasterpointResourceId(int id) {
      this.masterpointResourceId = id;
    }
    //endregion
}
