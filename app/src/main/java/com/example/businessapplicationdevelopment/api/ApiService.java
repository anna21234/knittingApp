package com.example.businessapplicationdevelopment.api;


import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiService extends IntentService {

    public ApiService() {

        super("ApiService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Retrofit.Builder builder = new Retrofit.Builder().baseUrl("https://api.ravelry.com/current_user.json").addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit = builder.build();

        RaverlyClient raverlyClient = retrofit.create(RaverlyClient.class);
        String accessToken = "";
        Call<RaverlyProjects> raverlyProjectCall = raverlyClient.projectsForUser("theyarnturtle");
        try {
            Response<RaverlyProjects> result = raverlyProjectCall.execute();
            Log.i("Retrofit", "Yay it works");
        } catch (IOException e) {
            Log.i("Retrofit", "Fail");
        }
    }
}
