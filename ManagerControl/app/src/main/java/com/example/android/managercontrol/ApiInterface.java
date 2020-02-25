package com.example.android.managercontrol;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    //this could be test1_database/getAllUser.json
    @GET("slides?page=1&size=20")
    Call<Post> getWorkers();


}