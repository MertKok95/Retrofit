package com.mertkok.retrofit_version2.Manager;

import com.mertkok.retrofit_version2.Services.CryptoAPI;
import com.mertkok.retrofit_version2.Services.RestServiceClient;

public class BaseManager {

    protected CryptoAPI getRestApiClient(String url){

        RestServiceClient restApiClient = new RestServiceClient(url);
        return restApiClient.getRestApiClient();
    }


}
