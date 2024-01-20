package com.vedruna.navarrovegam01.interfaces;

import com.vedruna.navarrovegam01.model.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CRUDInterface {


    @GET("api/products")
    Call<List<Product>> getAll();
}
