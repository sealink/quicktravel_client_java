package au.com.sealink.quicktravel.client.models.timetable;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import com.google.gson.Gson;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RouteTest {
    private void assertData(Route actual) {
        assertEquals(1, actual.getDepartures().size());
        assertEquals(2, actual.getId());
        assertEquals("Cape Jervis to Penneshaw", actual.getName());
    }

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/timetable_route.json");
        Route actual = new Gson().fromJson(json, Route.class);
        assertData(actual);
    }

    @Test
    public void fromSetters() {
        Route actual = new Route();
        actual.setId(2);
        actual.setName("Cape Jervis to Penneshaw");
        actual.getDepartures().add(new Departure());
        assertData(actual);
    }
}