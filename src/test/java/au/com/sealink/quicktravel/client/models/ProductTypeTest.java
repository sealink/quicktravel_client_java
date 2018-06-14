package au.com.sealink.quicktravel.client.models;

import static junit.framework.TestCase.assertEquals;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import com.google.gson.Gson;
import org.junit.Test;

public class ProductTypeTest {
    private void assertData(ProductType actual) {
        assertEquals(1, actual.getId());
        assertEquals("ProductType 1", actual.getName());
    }

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/product_type.json");
        ProductType actual = new Gson().fromJson(json, ProductType.class);
        assertData(actual);
    }

    @Test
    public void fromSetters() {
        ProductType actual = new ProductType();
        actual.setId(1);
        actual.setName("ProductType 1");
        assertData(actual);
    }
}