package Services;

import java.util.ArrayList;

import Responses.EstacionesResponse;
import Responses.LoginResult;
import Responses.estaciones;
import model.Authuser;
import model.LoginData;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {
    @GET("estacion/list")
    Call<estaciones> getDiseases();

    @POST("user/login")
    Call<LoginResult> getToken(@Body Authuser body);
}
