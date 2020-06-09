package com.soloingenios.api_prueba;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

import Responses.LoginResult;
import Responses.estaciones;
import model.ApiAdapter;
import model.Authuser;
import model.LoginData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements Callback<estaciones> {
    TextView test;
    String email = "moises@moises.com";
    String password = "admin";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test = (TextView)findViewById(R.id.resultado);

        Call<estaciones> call = ApiAdapter.getApiService().getDiseases();
        call.enqueue(this);
        LoginData datos = new LoginData();

        Authuser datos2 = new Authuser();
        datos2.params(datos);

        //test.setText(datos2.json);


        Call<LoginResult> calllogin= ApiAdapter.getApiService().getToken(datos2);
        calllogin.enqueue(new Callback<LoginResult>() {
            @Override
            public void onResponse(Call<LoginResult> call, Response<LoginResult> response) {
                LoginResult result1 = response.body();
                test.setText(result1.getUser().toString());
            }

            @Override
            public void onFailure(Call<LoginResult> call, Throwable t) {
                //for getting error in network put here Toast, so get the error on network
            }
        });
/*
        Call<LoginResult> callLogin = ApiAdapter.getApiService().getToken(datosLogin);
        callLogin.enqueue(new Callback<LoginResult>() {
            @Override
            public void onResponse(Call<LoginResult> call, Response<LoginResult> response) {
                test.setText(response.toString());
            }

            @Override
            public void onFailure(Call<LoginResult> call, Throwable t) {
                //for getting error in network put here Toast, so get the error on network
            }
        });*/


    }

    @Override
    public void onResponse(Call<estaciones> call, Response<estaciones> response) {
        if (response.isSuccessful()){
            estaciones estaciones1 = response.body();

            Log.d("onResponsEstaciones", String.valueOf(estaciones1.response));


        }

    }

    @Override
    public void onFailure(Call<estaciones> call, Throwable t) {

    }

}