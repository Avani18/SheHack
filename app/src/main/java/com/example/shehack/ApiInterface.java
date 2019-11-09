package com.example.shehack;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiInterface {
    @GET("metroStation.json")
    Call<Station> getStation();
}
