package au.com.sealink.quicktravel.client.models.timetable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class TimeTable {
    @SerializedName("routes")
    @Expose
    private List<Route> routes = new ArrayList<>();

    //region GETTER/SETTERS
    public List<Route> getRoutes() {
        return this.routes;
    }
    //endregion
}
