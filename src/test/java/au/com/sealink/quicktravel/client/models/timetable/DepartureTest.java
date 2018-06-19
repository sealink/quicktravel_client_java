package au.com.sealink.quicktravel.client.models.timetable;

import static junit.framework.TestCase.assertEquals;

import au.com.sealink.quicktravel.client.helpers.DateHelper;
import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import com.google.gson.Gson;
import org.junit.Test;

public class DepartureTest {
    private void assertData(Departure actual) {
        assertEquals(7990793, actual.getId());
        assertEquals(1, actual.getTripId());
        assertEquals("active", actual.getState());
        assertEquals(DateHelper.parseIso("2018-06-14T09:00:00+09:30"), actual.getDepartsAt());
    }

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/departure.json");
        Departure actual = new Gson().fromJson(json, Departure.class);
        assertData(actual);
    }

    @Test
    public void fromSetters() {
        Departure actual = new Departure(null);
        actual.setId(7990793);
        actual.setTripId(1);
        actual.setState("active");
        actual.setDepartsAt(DateHelper.parseIso("2018-06-14T09:00:00+09:30"));
        assertData(actual);
    }
}