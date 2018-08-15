package au.com.sealink.quicktravel.client.models;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;

public class ClientSearchResponseTest {
    private void assertData(ClientSearchResponse response) {
        Assert.assertEquals(1, response.getPage());
        Assert.assertEquals(1, response.getPages());
        Assert.assertEquals(1, response.getResults());

        Assert.assertEquals(1, response.getClients().size());

        ClientSearchClient client = response.getClients().get(0);
        Assert.assertEquals(5, client.getId());
        Assert.assertEquals("Dev Test Resident Club", client.getLabel());
        Assert.assertEquals("http://gravatar.com/avatar/d41d8cd98f00b204e9800998ecf8427e", client.getPictureUrl());
        Assert.assertEquals("", client.getEmail());
        Assert.assertEquals("000", client.getPhone());
        Assert.assertEquals("", client.getMobile());
        Assert.assertEquals("Resident", client.getType());
        Assert.assertEquals("None", client.getExternalIdentifier());
        Assert.assertEquals("", client.getNotes());
        Assert.assertEquals("Pay Direct", client.getPaymentMethodName());
    }

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/client_search_response.json");
        ClientSearchResponse actual = new Gson().fromJson(json, ClientSearchResponse.class);
        assertData(actual);
    }
}