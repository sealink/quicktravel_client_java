package au.com.sealink.quicktravel.client.retrofit;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;

public class TokenInterceptor implements Interceptor {
    private volatile String token;

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        if (!request.method().equals("GET")) {
            String token = this.token;
            if (token != null) {
                request = request.newBuilder()
                        .addHeader("X-CSRF-Token", token)
                        .build();
            }
        }
        return chain.proceed(request);
    }
}
