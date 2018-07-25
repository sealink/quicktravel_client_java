package au.com.sealink.quicktravel.client;

import au.com.sealink.quicktravel.client.models.BoardRequest;
import au.com.sealink.quicktravel.client.models.BoardResult;
import au.com.sealink.quicktravel.client.models.EncryptedData;
import au.com.sealink.quicktravel.client.models.PassengerType;
import au.com.sealink.quicktravel.client.models.PaymentType;
import au.com.sealink.quicktravel.client.models.ProductType;
import au.com.sealink.quicktravel.client.models.Resource;
import au.com.sealink.quicktravel.client.models.ResourceCategory;
import au.com.sealink.quicktravel.client.models.Route;
import au.com.sealink.quicktravel.client.models.User;
import au.com.sealink.quicktravel.client.models.timetable.TimeTable;
import io.reactivex.Single;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.*;

public interface QuickTravelApiClient {
    @FormUrlEncoded
    @POST("login")
    Single<User> login(
            @Field("login") String username,
            @Field("password") String password
    );

    @GET("logout")
    Single<Response<ResponseBody>> logout(
            @Header("X-CSRF-Token") String token
    );

    @GET("issued_tickets/barcodes/{reference}")
    Single<EncryptedData> getBarcode(@Path("reference") String reference);

    @GET("resources")
    Single<List<Resource>> getResources(
            @Query("product_type_ids") List<Integer> productTypeIds,
            @Query("web_site_id") Integer websiteId,
            @Query("price") Boolean price,
            @Query("children") Boolean children,
            @Query("active_only") Boolean activeOnly
    );

    @GET("resource_categories")
    Single<List<ResourceCategory>> resourceCategories(
            @Query("ids") List<Integer> ids,
            @Query("product_type_ids") List<Integer> productTypeIds
    );

    @GET("passenger_types.json")
    Single<List<PassengerType>> getPassengerTypes();

    @GET("payment_types.json")
    Single<List<PaymentType>> getPaymentTypes(
            @Query("ids[]") List<Integer> paymentTypeIds
    );

    @GET("services/daily_timetable")
    Single<TimeTable> getDailyTimetable(
            @Query("product_type_id") int productTypeId,
            @Query("date") String date,
            @Query("scope") String scope
    );

    @GET("product_types")
    Single<List<ProductType>> productTypes();

    @GET("routes")
    Single<List<Route>> getRoutes(@Path("productTypeId") int productTypeId);

    @POST("issued_tickets/board")
    Single<List<BoardResult>> board(
            @Header("X-CSRF-Token") String token,
            @Body BoardRequest boardRequest
    );
}
