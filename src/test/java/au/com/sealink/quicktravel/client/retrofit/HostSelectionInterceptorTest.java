package au.com.sealink.quicktravel.client.retrofit;

import org.junit.Assert;
import org.junit.Test;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;

public class HostSelectionInterceptorTest {

    @Test
    public void testWithHost() throws Exception {
        MockWebServer mockWebServer = new MockWebServer();
        mockWebServer.enqueue(new MockResponse().setBody("hello, world"));
        mockWebServer.start();

        HostSelectionInterceptor interceptor = new HostSelectionInterceptor();
        interceptor.setHost(mockWebServer.url("/").host());

        OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        RequestBody body = RequestBody.create(MediaType.parse("application/json"), "{}");
        Request request = new Request.Builder().url(mockWebServer.url("/")).post(body).build();
        okHttpClient.newCall(request).execute();

        RecordedRequest recordedRequest = mockWebServer.takeRequest();
        Assert.assertEquals(mockWebServer.getHostName(), recordedRequest.getRequestUrl().host());

        mockWebServer.shutdown();
    }

}