package au.com.sealink.quicktravel.client;

import au.com.sealink.quicktravel.client.models.PassengerType;
import au.com.sealink.quicktravel.client.models.VehicleType;
import okhttp3.OkHttpClient;
import org.junit.Assert;
import org.junit.Test;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;


public class QuickTravelServiceTest {

    private QuickTravelService getApi() {
        HeaderInterceptor addAuth = new HeaderInterceptor();
        addAuth.setAccessKey("<APIKEY>");

        OkHttpClient defaultHttpClient = new OkHttpClient.Builder().addInterceptor(addAuth).build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://private-92c4a-quicktravel.apiary-mock.com/")
                .client(defaultHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(QuickTravelService.class);
    }

    @Test
    public void listPassengerTypes() {
        QuickTravelService service = this.getApi();
        Call<List<PassengerType>> request = service.listPassengerTypes();
        try {
            List<PassengerType> list = request.execute().body();
            Assert.assertSame(5, list.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void listVehicleTypes() {
        QuickTravelService service = this.getApi();
        Call<List<VehicleType>> request = service.listVehicleTypes();
        try {
            List<VehicleType> list = request.execute().body();
            Assert.assertSame(14, list.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}