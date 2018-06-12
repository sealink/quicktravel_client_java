package au.com.sealink.quicktravel.client.models.timetable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Route {
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("departures")
    @Expose
    private List<Departure> departures = new ArrayList<>();

    //region GETTER/SETTERS
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Departure> getDepartures() {
        return this.departures;
    }
    //endregion
}
