package com.example.lenovo.motherandbabycare.Remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

import com.example.lenovo.motherandbabycare.Model.MyPlaces;

public interface IGoogleAPIService {
    @GET
    Call<MyPlaces> getNearByPlaces(@Url String url);

}
