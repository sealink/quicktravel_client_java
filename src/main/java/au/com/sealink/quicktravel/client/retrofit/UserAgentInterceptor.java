package au.com.sealink.quicktravel.client.retrofit;

import java.io.IOException;
import java.util.ResourceBundle;

import okhttp3.Interceptor;
import okhttp3.Request;

public class UserAgentInterceptor implements Interceptor {
    private ResourceBundle bundle = ResourceBundle.getBundle("version");

    private volatile String userAgent = "quicktravel_client-java/" + bundle.getString("version");

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        request = request.newBuilder()
                .addHeader("User-Agent", this.userAgent)
                .build();
        return chain.proceed(request);
    }
}
