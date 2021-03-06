package au.com.sealink.quicktravel.client.services;

import org.joda.time.DateTime;
import org.joda.time.Duration;
import au.com.sealink.quicktravel.client.models.timetable.Departure;
import au.com.sealink.quicktravel.client.models.timetable.Route;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ClosestDepartureFinder {
    private Route route;
    private DateTime targetDate;
    private Integer vesselId;
    private Integer resourceId;

    ClosestDepartureFinder(Route route, Date targetDate, Integer vesselId, Integer resourceId) {
        this.route = route;
        this.targetDate = new DateTime(targetDate);
        this.vesselId = vesselId;
        this.resourceId = resourceId;
    }

    private boolean matchVessel(Integer vesselId) {
        return this.vesselId == null || vesselId.equals(this.vesselId);
    }

    private boolean matchResource(Integer resourceId) {
        return this.resourceId == null || resourceId.equals(this.resourceId);
    }

    public Departure find() {
        if (route.getDepartures().size() == 0) {
            return null;
        }

        List<Departure> departures = new ArrayList<>();
        for (Departure d : route.getDepartures()) {
            if (matchResource(d.getResourceId()) && matchVessel(d.getVesselId())) {
                departures.add(d);
            }
        }

        if (departures.size() == 0) {
            return null;
        }

        Collections.sort(departures, (o1, o2) -> {
                    long t1 = new Duration(new DateTime(o1.getDepartsAt()), targetDate).getMillis();
                    long t2 = new Duration(new DateTime(o2.getDepartsAt()), targetDate).getMillis();
                    int cmp = Long.compare(Math.abs(t1), Math.abs(t2));
                    if (cmp != 0) {
                        return cmp;
                    }
                    return o2.getDepartsAt().compareTo(o1.getDepartsAt());
                }
            );
        return departures.get(0);
    }
}
