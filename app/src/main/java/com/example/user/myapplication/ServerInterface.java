package com.example.user.myapplication;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ServerInterface {

    @GET("/api/climate/{temp}")
    Call<JsonObject> setTemperature(
            @Path("temp") int temp,
            @Query("token") String token
    );

    @GET("api/climate/{temp}/{start}/{end}")
    Call<JsonObject> scheduleClimate(
            @Path("temp") int temp,
            @Path("start") String start,
            @Path("end") String end,
            @Query("token") String token
    );
}
