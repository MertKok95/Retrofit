package com.mertkok.retrofit_version2.Manager;

import com.mertkok.retrofit_version2.Models.CryptoService;
import com.mertkok.retrofit_version2.Services.BaseApiUrl;

import retrofit2.Call;

public class ManagerAll extends BaseManager {

    private static ManagerAll managerInstance = new ManagerAll();

    public static synchronized ManagerAll getInstance(){
        return managerInstance;
    }

    public Call<CryptoService> getInformation(){

        Call<CryptoService> serviceCall = getRestApiClient(BaseApiUrl.baseCryptoUrl).getCryptoData();
        return serviceCall;
    }

}
