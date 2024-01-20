package com.vedruna.navarrovegam01;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import com.vedruna.navarrovegam01.interfaces.CRUDInterface;
import com.vedruna.navarrovegam01.model.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiFragment extends Fragment {
    List<Product> products;
    CRUDInterface crudInterface;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getAll();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_api, container, false);
    }

    private void getAll() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.42.1:8080/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        crudInterface = retrofit.create(CRUDInterface.class);

        Call<List<Product>> call = crudInterface.getAll();
        call.enqueue(new Callback<List<Product>>() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
                if (!response.isSuccessful()){
                    Log.e("Response err: ",response.message());

                    return;
                }
                products = response.body();
                products.forEach(p -> Log.i("Prods: ",p.toString()));
            }

            @Override
            public void onFailure(Call<List<Product>> call, Throwable t) {
                Log.e("Throw err: ",t.getMessage());

            }
        });

    }
}
