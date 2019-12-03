package au.com.sealink.quicktravel.client.models;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import com.google.gson.Gson;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class VesselTest {
    private void assertData(Vessel actual) {
        assertEquals(1, actual.getId());
        assertEquals("Standard Vessel", actual.getName());
    }

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/vessel.json");
        Vessel actual = new Gson().fromJson(json, Vessel.class);
        assertData(actual);
    }

    @Test
    public void fromSetters() {
        Vessel vessel = new Vessel();
        vessel.setId(1);
        vessel.setName("Standard Vessel");
        assertData(vessel);
    }
}
