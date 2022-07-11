package com.sharad.daggermvvm.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.sharad.daggermvvm.db.FakeDB
import com.sharad.daggermvvm.model.Product
import com.sharad.daggermvvm.retrofit.FakerApi
import javax.inject.Inject

class ProductRepository @Inject constructor(private val fakerApi: FakerApi,private val fakeDB: FakeDB) {
    private val _products = MutableLiveData<List<Product>>()
    val products:LiveData<List<Product>>
    get() = _products

    suspend fun getProducts(){
        val result = fakerApi.getProducts()
        if (result.isSuccessful && result.body() !=null){
            fakeDB.getFackerDAO().addProducts(result.body()!!)
            _products.postValue(result.body())
        }
    }
}