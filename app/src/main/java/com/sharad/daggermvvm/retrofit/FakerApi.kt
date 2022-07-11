package com.sharad.daggermvvm.retrofit

import com.sharad.daggermvvm.model.Product
import retrofit2.Response
import retrofit2.http.GET

interface FakerApi {

    @GET("products")
   suspend fun getProducts():Response<List<Product>>
}