package com.example.android.managercontrol;

import com.example.android.managercontrol.ApiInterface;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static final String BASE_URL="http://192.168.1.215:3012/api/";
    public static Retrofit retrofit = null;
    public static ApiInterface instance=null;

    public static Retrofit getApiClient(){

        if (retrofit==null){
            retrofit=new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }

    public static ApiInterface getInterface(){

        if (instance==null){
            instance=getApiClient().create(ApiInterface.class);
        }


        return instance;
    }

}