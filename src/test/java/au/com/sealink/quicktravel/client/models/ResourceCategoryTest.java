package au.com.sealink.quicktravel.client.models;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import com.google.gson.Gson;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ResourceCategoryTest {
    private void assertData(ResourceCategory actual) {
        assertEquals(1, actual.getId());
        assertEquals("ResourceCategory 1", actual.getName());
    }

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/resource_category.json");
        ResourceCategory actual = new Gson().fromJson(json, ResourceCategory.class);
        assertData(actual);
    }

    @Test
    public void fromSetters() {
        ResourceCategory actual = new ResourceCategory();
        actual.setId(1);
        actual.setName("ResourceCategory 1");
        assertData(actual);
    }
}