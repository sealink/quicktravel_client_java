package au.com.sealink.quicktravel.client.models.checkout;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;

public class ClientTokenResponseTest {
    private void assertData(ClientTokenResponse actual) {
        Assert.assertEquals("the_client_token", actual.getClientToken());
    }

    @Test
    public void fromSetters() {
        ClientTokenResponse token = new ClientTokenResponse();
        token.setClientToken("the_client_token");
        this.assertData(token);
    }

    @Test
    public void fromJSON() {
        String json = FixtureHelper.fromFile("fixtures/client_token_response.json");
        ClientTokenResponse actual = new Gson().fromJson(json, ClientTokenResponse.class);
        assertData(actual);
    }
}
