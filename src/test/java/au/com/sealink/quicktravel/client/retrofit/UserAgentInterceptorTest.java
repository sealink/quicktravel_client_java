package au.com.sealink.quicktravel.client.retrofit;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.Assert;
import org.junit.Test;

public class UserAgentInterceptorTest {
    @Test
    public void testWithUserAgent() throws Exception {
        MockWebServer mockWebServer = new MockWebServer();
        mockWebServer.enqueue(new MockResponse().setBody("hello, world"));
        mockWebServer.start();

        UserAgentInterceptor interceptor = new UserAgentInterceptor();
        interceptor.setUserAgent("quicktravel_client_java/1.1");

        OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        RequestBody body = RequestBody.create(MediaType.parse("application/json"), "{}");
        Request request = new Request.Builder().url(mockWebServer.url("/")).post(body).build();
        okHttpClient.newCall(request).execute();

        RecordedRequest recordedRequest = mockWebServer.takeRequest();
        Assert.assertEquals("quicktravel_client_java/1.1", recordedRequest.getHeader("User-Agent"));

        mockWebServer.shutdown();
    }
}
