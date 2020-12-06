package com.example.androidauthenticationapp;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.POST;

public interface API {

    @POST("register")
    Call<ResponseBody> CreateUser (
            @Field("Username") String username,
            @Field("Password") String password
    );

}
