package com.mertkok.retrofit_version2.Services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestServiceClient {

    private CryptoAPI restServiceClient;

    public RestServiceClient(String restApiServiceUrl) {

        // you can choose one of two ways according to your wish . ( Gson or OkHttpClient )

        Gson gson = new GsonBuilder().setLenient().create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(restApiServiceUrl)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

/*
        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .connectTimeout(3, TimeUnit.SECONDS);

        OkHttpClient okHttpClient = builder.build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(restApiServiceUrl)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
*/


        restServiceClient = retrofit.create(CryptoAPI.class);
    }

    public CryptoAPI getRestApiClient(){
        return  restServiceClient;
    }
}
