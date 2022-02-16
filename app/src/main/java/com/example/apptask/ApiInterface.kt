package com.example.apptask

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("products")
    fun getProducts() : Call<List<ProductModel>>
}