package com.sharad.daggermvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sharad.daggermvvm.model.Product
import com.sharad.daggermvvm.repository.ProductRepository
import kotlinx.coroutines.launch

class MainViewModel(val repository: ProductRepository) :ViewModel() {

    val productLiveData:LiveData<List<Product>>
        get() = repository.products

    init {
        viewModelScope.launch {
            repository.getProducts()
        }
    }


}