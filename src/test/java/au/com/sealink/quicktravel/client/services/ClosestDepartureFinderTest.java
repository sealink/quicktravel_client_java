package au.com.sealink.quicktravel.client.services;

import au.com.sealink.quicktravel.client.helpers.DateHelper;
import au.com.sealink.quicktravel.client.models.timetable.Departure;
import au.com.sealink.quicktravel.client.models.timetable.Route;
import java.time.Instant;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class ClosestDepartureFinderTest {

    private static Departure departureA =
            new Departure(DateHelper.parseIso("2018-06-14T09:00:00+09:30"));
    private static Departure departureB =
            new Departure(DateHelper.parseIso("2018-06-14T10:00:00+09:30"));
    private static Departure departureC =
            new Departure(DateHelper.parseIso("2018-06-14T11:00:00+09:30"));
    private static Departure departureD =
            new Departure(DateHelper.parseIso("2018-06-14T12:00:00+09:30"));

    private Route testRoute() {
        Route r = new Route();
        r.getDepartures().add(departureA);
        r.getDepartures().add(departureB);
        r.getDepartures().add(departureC);
        r.getDepartures().add(departureD);
        return r;
    }

    @Test
    public void noDepartures() {
        Route route = new Route();
        Departure match = DepartureFinder.closest(route, Date.from(Instant.now()));
        Assert.assertNull(match);
    }

    @Test
    public void halfWayRounding() {
        Route route = testRoute();
        Date target = DateHelper.parseIso("2018-06-14T10:30:00+09:30");
        Departure match = DepartureFinder.closest(route, target);
        Assert.assertSame(departureC, match);
    }

    @Test
    public void afterLastDeparture() {
        Route route = testRoute();
        Date target = DateHelper.parseIso("2018-06-14T13:00:00+09:30");
        Departure match = DepartureFinder.closest(route, target);
        Assert.assertSame(departureD, match);
    }

    @Test
    public void beforeFirstDeparture() {
        Route route = testRoute();
        Date target = DateHelper.parseIso("2018-06-14T06:00:00+09:30");
        Departure match = DepartureFinder.closest(route, target);
        Assert.assertSame(departureA, match);
    }

    @Test
    public void exactDepartureTime() {
        Route route = testRoute();
        Date target = DateHelper.parseIso("2018-06-14T11:00:00+09:30");
        Departure match = DepartureFinder.closest(route, target);
        Assert.assertSame(departureC, match);
    }
}