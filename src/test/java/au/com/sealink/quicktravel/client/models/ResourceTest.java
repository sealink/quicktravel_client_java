package au.com.sealink.quicktravel.client.models;

import static junit.framework.TestCase.assertEquals;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import com.google.gson.Gson;
import org.junit.Test;

public class ResourceTest {
    private void assertData(Resource actual) {
        assertEquals(1, actual.getId());
        assertEquals("Resource 1", actual.getName());
        assertEquals(2, actual.getResourceCategoryId());
    }

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/resource.json");
        Resource actual = new Gson().fromJson(json, Resource.class);
        assertData(actual);
    }

    @Test
    public void fromSetters() {
        Resource actual = new Resource();
        actual.setId(1);
        actual.setName("Resource 1");
        actual.setResourceCategoryId(2);
        assertData(actual);
    }
}