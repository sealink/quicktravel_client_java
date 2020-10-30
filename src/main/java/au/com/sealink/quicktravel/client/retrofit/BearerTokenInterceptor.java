package au.com.sealink.quicktravel.client.retrofit;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;

public class BearerTokenInterceptor implements Interceptor {
    private volatile String token;

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        String token = this.token;
        if (token != null) {
            request = request.newBuilder()
                    .addHeader("Authorization", "Bearer " + token)
                    .build();
        }
        return chain.proceed(request);
    }
}
