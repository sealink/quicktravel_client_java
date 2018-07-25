package au.com.sealink.quicktravel.client.models;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import com.google.gson.Gson;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RouteTest {
    private void assertData(Route actual) {
        assertEquals(1, actual.getId());
        assertEquals("Route 1", actual.getName());
        assertEquals("Route 1 Path", actual.getPath());
        assertEquals(1, actual.getPosition());
        assertEquals(2, actual.getReverseId());
        assertEquals(1, actual.getProductTypeId());
        assertEquals(2, actual.getRouteStops().size());

        RouteStop stopA = actual.getRouteStops().get(0);
        assertEquals(1 , stopA.getId());
        assertEquals(1 , stopA.getPosition());
        assertEquals(1 , stopA.getRouteId());
        assertEquals(1, stopA.getStopId());
        assertEquals("Start" , stopA.getName());
        assertEquals("START" , stopA.getCode());
        assertEquals("Start Address" , stopA.getAddress());

        RouteStop stopB = actual.getRouteStops().get(1);
        assertEquals(2 , stopB.getId());
        assertEquals(2 , stopB.getPosition());
        assertEquals(1 , stopB.getRouteId());
        assertEquals(2, stopB.getStopId());
        assertEquals("Finish" , stopB.getName());
        assertEquals("FINISH" , stopB.getCode());
        assertEquals("Finish Address" , stopB.getAddress());
    }

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/route.json");
        Route actual = new Gson().fromJson(json, Route.class);
        assertData(actual);
    }
}