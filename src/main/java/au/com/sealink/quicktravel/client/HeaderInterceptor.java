package au.com.sealink.quicktravel.client;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class HeaderInterceptor implements Interceptor {
    private String accessKey;

    public void setAccessKey(String key) {
        this.accessKey = key;
    }

    @Override
    public Response intercept(Chain chain)
            throws IOException {
        Request request = chain.request();
        request = request.newBuilder()
                .addHeader("X-API-KEY", this.accessKey)
                .build();
        Response response = chain.proceed(request);
        return response;
    }
}