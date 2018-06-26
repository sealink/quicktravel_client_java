package au.com.sealink.quicktravel.client.models;

import static junit.framework.TestCase.assertEquals;

import com.google.gson.Gson;
import org.junit.Test;
import au.com.sealink.quicktravel.client.helpers.FixtureHelper;

public class EncryptedDataTest {

    private void assertData(EncryptedData actual) {
        assertEquals("Error message", actual.getEncryptedData());
    }

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/encrypted_data.json");
        EncryptedData actual = new Gson().fromJson(json, EncryptedData.class);
        assertData(actual);
    }
}