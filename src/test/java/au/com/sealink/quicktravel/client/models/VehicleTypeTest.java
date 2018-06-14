package au.com.sealink.quicktravel.client.models;

import static junit.framework.TestCase.assertEquals;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import com.google.gson.Gson;
import org.junit.Test;



public class VehicleTypeTest {
    private void assertData(VehicleType actual) {
        assertEquals(1, actual.getId());
        assertEquals("Standard Vehicle", actual.getName());
        assertEquals(Boolean.TRUE, actual.getFixedLength());
        assertEquals(null, actual.getMinimumLength());
        assertEquals(Boolean.TRUE, actual.getDefault());
        assertEquals(Boolean.FALSE, actual.getTrailer());
        assertEquals(null, actual.getMaximumLength());
        assertEquals(new Integer(1), actual.getPosition());
        assertEquals(0.0f, actual.getDefaultWeight());
        assertEquals("Model", actual.getDetailPrompt());
        assertEquals(Boolean.FALSE, actual.getHasCargo());
        assertEquals("SVEH", actual.getCode());
        assertEquals(Boolean.TRUE, actual.getAppearOnManifest());
        assertEquals(Boolean.FALSE, actual.getMultiplyLength());
        assertEquals(5.0f, actual.getDefaultLength());
        assertEquals(2.2f, actual.getDefaultHeight());
        assertEquals(Boolean.FALSE, actual.getFixedHeight());
        assertEquals(2.2f, actual.getDefaultHeight());
        assertEquals(Boolean.FALSE, actual.getRequireDropOffLocation());
        assertEquals(Boolean.FALSE, actual.getHasDriver());
        assertEquals(Boolean.TRUE, actual.getFixedWeight());
        assertEquals("Vehicle Description", actual.getDescription());
    }

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/vehicle_type.json");
        VehicleType actual = new Gson().fromJson(json, VehicleType.class);
        assertData(actual);
    }

    @Test
    public void fromSetters() {
        VehicleType actual = new VehicleType();
        actual.setId(1);
        actual.setName("Standard Vehicle");
        actual.setMinimumLength(null);
        actual.setFixedLength(true);
        actual.setDescription("Vehicle Description");
        actual.setDefault(true);
        actual.setTrailer(false);
        actual.setMaximumLength(null);
        actual.setPosition(1);
        actual.setFixedWeight(true);
        actual.setDefaultWeight(0.0f);
        actual.setDetailPrompt("Model");
        actual.setHasCargo(false);
        actual.setCode("SVEH");
        actual.setAppearOnManifest(true);
        actual.setMultiplyLength(false);
        actual.setDefaultLength(5.0f);
        actual.setFixedHeight(false);
        actual.setDefaultHeight(2.2f);
        actual.setRequireDropOffLocation(false);
        actual.setHasDriver(false);
        assertData(actual);
    }

}