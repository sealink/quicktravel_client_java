package au.com.sealink.quicktravel.client.models;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Assert;
import org.junit.Test;

public class OnAccountClientTest {

    @Test
    public void toJson() {
        OnAccountClient client = new OnAccountClient();
        client.setClientId(1);
        client.setExternalIdentifier("123");
        client.setPaymentMethod(PaymentMethod.OnAccountRefRequired);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(client);
        Assert.assertEquals(FixtureHelper.fromFile("fixtures/on_account_client_create.json"), json);

        Assert.assertEquals(1, client.getClientId());
        Assert.assertEquals("123", client.getExternalIdentifier());
        Assert.assertEquals(PaymentMethod.OnAccountRefRequired, client.getPaymentMethod());
    }
}