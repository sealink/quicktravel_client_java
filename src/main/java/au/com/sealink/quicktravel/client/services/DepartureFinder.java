package au.com.sealink.quicktravel.client.services;

import au.com.sealink.quicktravel.client.models.timetable.Departure;
import au.com.sealink.quicktravel.client.models.timetable.Route;

import java.util.Date;

public class DepartureFinder {
    public static Departure closest(Route route, Date targetDate, Integer vesselId, Integer resourceId) {
        return new ClosestDepartureFinder(route, targetDate, vesselId, resourceId).find();
    }

    public static Departure closest(Route route, Date targetDate) {
        return DepartureFinder.closest(route, targetDate, null, null);
    }
}
