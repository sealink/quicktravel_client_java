package au.com.sealink.quicktravel.client.services;

import au.com.sealink.quicktravel.client.helpers.DateHelper;
import au.com.sealink.quicktravel.client.models.timetable.Departure;
import au.com.sealink.quicktravel.client.models.timetable.Route;
import java.time.Instant;
import java.util.Date;

import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;

public class ClosestDepartureFinderTest {

    private static Departure departureA =
            ClosestDepartureFinderTest.makeDeparture(
                    DateHelper.parseIso("2018-06-14T09:00:00+09:30"), 1, 100);

    private static Departure departureB =
            ClosestDepartureFinderTest.makeDeparture(
                    DateHelper.parseIso("2018-06-14T10:00:00+09:30"), 1, 100);

    private static Departure departureC =
            ClosestDepartureFinderTest.makeDeparture(
                    DateHelper.parseIso("2018-06-14T11:00:00+09:30"), 1, 100);

    private static Departure departureD =
            ClosestDepartureFinderTest.makeDeparture(
                    DateHelper.parseIso("2018-06-14T13:00:00+09:30"), 2, 100);

    private static Departure departureE =
            ClosestDepartureFinderTest.makeDeparture(
                    DateHelper.parseIso("2018-06-14T13:00:00+09:30"), 3, 101);

    private static Departure makeDeparture(Date time, int vesselId, int resourceId) {
        Departure departure = new Departure(time);
        departure.setVesselId(vesselId);
        departure.setResourceId(resourceId);
        return departure;
    }

    private Route testRoute() {
        Route r = new Route();
        r.getDepartures().add(departureA);
        r.getDepartures().add(departureB);
        r.getDepartures().add(departureC);
        r.getDepartures().add(departureD);
        r.getDepartures().add(departureE);
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

    @Test
    public void whenSpecificVessel() {
        Route route = testRoute();
        Date target = DateHelper.parseIso("2018-06-14T11:00:00+09:30");
        Departure match = DepartureFinder.closest(route, target, 2, null);
        Assert.assertSame(departureD, match);

        //Try Same time different vessel
        match = DepartureFinder.closest(route, target, 1, null);
        Assert.assertSame(departureC, match);

        //Try Same time different vessel
        match = DepartureFinder.closest(route, target, 3, null);
        Assert.assertSame(departureE, match);
    }

    @Test
    public void whenNoSpecificVesselFound() {
        Route route = testRoute();
        Date target = DateHelper.parseIso("2018-06-14T11:00:00+09:30");
        Departure match = DepartureFinder.closest(route, target, 10, null);
        Assert.assertNull(match);
    }

    @Test
    public void whenSpecificResource() {
        Route route = testRoute();
        Date target = DateHelper.parseIso("2018-06-14T11:00:00+09:30");
        Departure match = DepartureFinder.closest(route, target, 2, 100);
        Assert.assertSame(departureD, match);

        //Try Same time specific vessel
        match = DepartureFinder.closest(route, target, 1, 100);
        Assert.assertSame(departureC, match);

        //Try without vessel, specific resource
        match = DepartureFinder.closest(route, target, null, 101);
        Assert.assertSame(departureE, match);

        match = DepartureFinder.closest(route, target, null, 101);
        Assert.assertSame(departureE, match);
    }
}