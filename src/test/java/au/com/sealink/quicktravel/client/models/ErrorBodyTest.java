package au.com.sealink.quicktravel.client.models;

import static junit.framework.TestCase.assertEquals;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import com.google.gson.Gson;
import org.junit.Test;

public class ErrorBodyTest {
    private void assertData(ErrorBody actual) {
        assertEquals("Error message", actual.getError());
    }

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/error_body.json");
        ErrorBody actual = new Gson().fromJson(json, ErrorBody.class);
        assertData(actual);
    }

    @Test
    public void fromConstructor() {
        ErrorBody actual = new ErrorBody("Error message");
        assertData(actual);
    }
}