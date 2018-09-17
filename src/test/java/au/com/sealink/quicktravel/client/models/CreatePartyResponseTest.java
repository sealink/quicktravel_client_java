package au.com.sealink.quicktravel.client.models;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;

public class CreatePartyResponseTest {

    private void assertData(CreatePartyResponse response) {
        Assert.assertEquals(2, response.getId());
        Assert.assertEquals(3, response.getClientId());
    }

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/create_party_response.json");
        CreatePartyResponse actual = new Gson().fromJson(json, CreatePartyResponse.class);
        assertData(actual);
    }
}