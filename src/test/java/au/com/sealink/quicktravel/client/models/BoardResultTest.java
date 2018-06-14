package au.com.sealink.quicktravel.client.models;

import static junit.framework.TestCase.assertEquals;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import com.google.gson.Gson;
import java.util.ArrayList;
import org.junit.Test;

public class BoardResultTest {
    private void assertData(BoardResult actual) {
        assertEquals("uuid-1", actual.getId());
        assertEquals("checkin_error", actual.getError());
        assertEquals(422, actual.getStatus());
        assertEquals(1, actual.getDiff().size());
    }

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/board_result.json");
        BoardResult actual = new Gson().fromJson(json, BoardResult.class);
        assertData(actual);
    }

    @Test
    public void fromSetters() {
        BoardResult actual = new BoardResult();
        actual.setId("uuid-1");
        actual.setError("checkin_error");
        actual.setStatus(422);
        actual.getDiff().add(new ArrayList<>());
        assertData(actual);
    }
}