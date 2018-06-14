package au.com.sealink.quicktravel.client.models.timetable;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import com.google.gson.Gson;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TimeTableTest {
    private void assertData(TimeTable actual) {
        assertEquals(1, actual.getRoutes().size());
    }

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/timetable.json");
        TimeTable actual = new Gson().fromJson(json, TimeTable.class);
        assertData(actual);
    }

    @Test
    public void fromSetters() {
        TimeTable actual = new TimeTable();
        actual.getRoutes().add(new Route());
        assertData(actual);
    }
}