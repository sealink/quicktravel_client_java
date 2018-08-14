package au.com.sealink.quicktravel.client.models;

import com.google.gson.Gson;

import org.junit.Assert;
import org.junit.Test;
import au.com.sealink.quicktravel.client.helpers.FixtureHelper;

public class TillTest {
    private void assertData(Till till) {
        Assert.assertEquals(true, till.isActive());
        Assert.assertEquals("On Account Batch", till.getName());
        Assert.assertEquals(2, till.getId());
    }

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/till.json");
        Till actual = new Gson().fromJson(json, Till.class);
        assertData(actual);
    }

    @Test
    public void fromSetters() {
        Till till = new Till();
        till.setId(2);
        till.setActive(true);
        till.setName("On Account Batch");
        assertData(till);
    }
}