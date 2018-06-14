package au.com.sealink.quicktravel.client.models;

import static junit.framework.TestCase.assertEquals;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import com.google.gson.Gson;
import org.junit.Test;

public class UserTest {
    private void assertData(User actual) {
        assertEquals("token", actual.getCsrfAuthToken());
    }

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/user.json");
        User actual = new Gson().fromJson(json, User.class);
        assertData(actual);
    }

    @Test
    public void fromSetters() {
        User actual = new User();
        actual.setCsrfAuthToken("token");
        assertData(actual);
    }
}