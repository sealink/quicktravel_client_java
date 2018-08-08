package au.com.sealink.quicktravel.client;

import au.com.sealink.quicktravel.client.models.BoardRequest;
import au.com.sealink.quicktravel.client.models.BoardResult;
import au.com.sealink.quicktravel.client.models.Booking;
import au.com.sealink.quicktravel.client.models.EncryptedData;
import au.com.sealink.quicktravel.client.models.PassengerType;
import au.com.sealink.quicktravel.client.models.PaymentType;
import au.com.sealink.quicktravel.client.models.ProductType;
import au.com.sealink.quicktravel.client.models.Resource;
import au.com.sealink.quicktravel.client.models.ResourceCategory;
import au.com.sealink.quicktravel.client.models.Route;
import au.com.sealink.quicktravel.client.models.User;
import au.com.sealink.quicktravel.client.models.reservationFor.core.Product;
import au.com.sealink.quicktravel.client.models.reservationFor.scheduledTrip.Create;
import au.com.sealink.quicktravel.client.models.reservationFor.scheduledTrip.Search;
import au.com.sealink.quicktravel.client.models.timetable.TimeTable;
import io.reactivex.Single;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.*;

public interface QuickTravelApiClient {
    @FormUrlEncoded
    @POST("api/login")
    Single<User> login(
            @Field("login") String username,
            @Field("password") String password
    );

    @GET("api/logout")
    Single<Response<ResponseBody>> logout(
            @Header("X-CSRF-Token") String token
    );

    @GET("api/issued_tickets/barcodes/{reference}")
    Single<EncryptedData> getBarcode(@Path("reference") String reference);

    @GET("api/resources")
    Single<List<Resource>> getResources(
            @Query("product_type_ids") List<Integer> productTypeIds,
            @Query("web_site_id") Integer websiteId,
            @Query("price") Boolean price,
            @Query("children") Boolean children,
            @Query("active_only") Boolean activeOnly
    );

    @GET("api/resource_categories")
    Single<List<ResourceCategory>> resourceCategories(
            @Query("ids") List<Integer> ids,
            @Query("product_type_ids") List<Integer> productTypeIds
    );

    @GET("api/passenger_types.json")
    Single<List<PassengerType>> getPassengerTypes();

    @GET("api/payment_types.json")
    Single<List<PaymentType>> getPaymentTypes(
            @Query("ids[]") List<Integer> paymentTypeIds
    );

    @GET("api/services/daily_timetable")
    Single<TimeTable> getDailyTimetable(
            @Query("product_type_id") int productTypeId,
            @Query("date") String date,
            @Query("scope") String scope
    );

    @GET("api/product_types")
    Single<List<ProductType>> productTypes();

    @GET("api/routes")
    Single<List<Route>> getRoutes(@Path("productTypeId") int productTypeId);

    @POST("api/issued_tickets/board")
    Single<List<BoardResult>> board(
            @Header("X-CSRF-Token") String token,
            @Body BoardRequest boardRequest
    );

    @POST("reservation_for/scheduled_trips/find_services_for.json")
    Single<List<Product>> findServicesFor(
            @Header("X-CSRF-Token") String token,
            @Body Search search);

    @POST("reservation_for/scheduled_trips")
    Single<Booking> reservationFor(
            @Header("X-CSRF-Token") String token,
            @Body Create create);
}
