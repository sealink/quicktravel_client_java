package au.com.sealink.quicktravel.client.models;

import com.google.gson.Gson;

import org.junit.Assert;
import org.junit.Test;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;

public class CountryTest {

    private void assertData(Country country) {
        Assert.assertEquals(2, country.getId());
        Assert.assertEquals("ÅLAND ISLANDS", country.getName());
        Assert.assertEquals("AX", country.getISO3166Code());

    }

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/country.json");
        Country actual = new Gson().fromJson(json, Country.class);
        assertData(actual);
    }

    @Test
    public void fromSetters() {
        Country country = new Country();
        country.setId(2);
        country.setName("ÅLAND ISLANDS");
        country.setISO3166Code("AX");
        this.assertData(country);
    }

}