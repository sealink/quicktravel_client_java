package au.com.sealink.quicktravel.client.services;

import au.com.sealink.quicktravel.client.models.timetable.Departure;
import au.com.sealink.quicktravel.client.models.timetable.Route;

import java.util.Date;

public class DepartureFinder {
    public static Departure closest(Route route, Date targetDate, Integer vesselId) {
        return new ClosestDepartureFinder(route, targetDate, vesselId).find();
    }

    public static Departure closest(Route route, Date targetDate) {
        return DepartureFinder.closest(route, targetDate, null);
    }
}
