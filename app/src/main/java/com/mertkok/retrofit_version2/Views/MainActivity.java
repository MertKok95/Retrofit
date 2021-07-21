package com.mertkok.retrofit_version2.Views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.mertkok.retrofit_version2.Adapters.RecyclerViewAdapter;
import com.mertkok.retrofit_version2.Manager.ManagerAll;
import com.mertkok.retrofit_version2.Models.CryptoService;
import com.mertkok.retrofit_version2.Models.DataItem;
import com.mertkok.retrofit_version2.R;
import com.mertkok.retrofit_version2.Services.CryptoAPI;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private ArrayList<DataItem> dataItems;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        loadData();
    }

    private void loadData() {

        Call<CryptoService> serviceCall = ManagerAll.getInstance().getInformation();
        serviceCall.enqueue(new Callback<CryptoService>() {
            @Override
            public void onResponse(Call<CryptoService> call, Response<CryptoService> response) {

                if(response.isSuccessful()) {

                    CryptoService responseList = response.body();
                    dataItems = new ArrayList<>(responseList.getData());
                    setRecyclerViewAdapter(dataItems);
                }
            }
            @Override
            public void onFailure(Call<CryptoService> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }


    private void setRecyclerViewAdapter(ArrayList<DataItem> cryptoModelList) {

        //RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(cryptoModelList);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}