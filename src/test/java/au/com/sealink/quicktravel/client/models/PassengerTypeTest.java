package au.com.sealink.quicktravel.client.models;

import static junit.framework.TestCase.assertEquals;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import com.google.gson.Gson;
import org.junit.Test;

public class PassengerTypeTest {
    private void assertData(PassengerType actual) {
        assertEquals(1, actual.getId());
        assertEquals("Adult", actual.getName());
        assertEquals(null, actual.getMinimumAge());
        assertEquals(null, actual.getMaximumAge());
        assertEquals(Boolean.FALSE, actual.getAgeRangeRequired());
        assertEquals(new Integer(1), actual.getPosition());
        assertEquals("Ad", actual.getCode());
        assertEquals("", actual.getConditions());
        assertEquals(Boolean.FALSE, actual.getRequiresReview());
        assertEquals(new Integer(30), actual.getDefaultAge());
    }

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/passenger_type.json");
        PassengerType actual = new Gson().fromJson(json, PassengerType.class);
        assertData(actual);
    }

    @Test
    public void fromSetters() {
        PassengerType actual = new PassengerType();
        actual.setId(1);
        actual.setName("Adult");
        actual.setMinimumAge(null);
        actual.setMaximumAge(null);
        actual.setAgeRangeRequired(false);
        actual.setPosition(1);
        actual.setDefaultAge(30);
        actual.setCode("Ad");
        actual.setConditions("");
        actual.setRequiresReview(false);
        assertData(actual);
    }
}