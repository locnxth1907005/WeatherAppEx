package com.example.weatherappex.network;

import com.example.weatherappex.model.Wheather;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiManager {
    public static String BASE_URL= "http://dataservice.accuweather.com";
    @GET("/forecasts/vhourly/12hour/353412?apikey=PBukKmK5a6454sutWv5qR4BvK5rrTxA4")
    Call<List<Wheather>> getHour();
    @GET("/forecasts/v1/daily/5day/353412?apikey=PBukKmK5a6454sutWv5qR4BvK5rrTxA4")
    Call<List<Wheather>> getDay();
}
