package au.com.sealink.auth.client;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import com.google.gson.Gson;
import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TokenTest {

    private void assertData(@NotNull Token actual)
    {
        assertEquals("123-ABC", actual.getAccessToken());
        assertEquals(43199, actual.getExpiresIn());
        assertEquals(1604028267, actual.getCreatedAt());
        assertEquals("public", actual.getScope());
        assertEquals("Bearer", actual.getTokenType());
        assertEquals(1604071466, actual.getExpiresAt().toInstant().getEpochSecond());
    }

    @Test
    public void fromJson() {
        String json = FixtureHelper.fromFile("fixtures/token.json");
        Token actual = new Gson().fromJson(json, Token.class);
        assertData(actual);
    }

    @Test
    public void fromSetter() {
        Token token = new Token();
        token.setAccessToken("123-ABC");
        token.setExpiresIn(43199);
        token.setCreatedAt(1604028267);
        token.setScope("public");
        token.setTokenType("Bearer");

        assertData(token);
    }
}