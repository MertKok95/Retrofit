package com.mertkok.retrofit_version2.Services;

import com.mertkok.retrofit_version2.Models.CryptoService;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    @GET("v1/cryptocurrency/listings/latest?CMC_PRO_API_KEY=2fc85f6a-59e3-4ec1-a60a-b8e98e4eb42f")
    Call<CryptoService> getCryptoData();
}
