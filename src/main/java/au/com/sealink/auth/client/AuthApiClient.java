package au.com.sealink.auth.client;

import io.reactivex.Single;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface AuthApiClient {
    @FormUrlEncoded
    @POST("oauth/token")
    Single<Token> requestToken(
        @Field("grant_type") String grantType,
        @Field("client_id") String clientId,
        @Field("client_secret") String clientSecret,
        @Field("username") String username,
        @Field("password") String password
    );
}
