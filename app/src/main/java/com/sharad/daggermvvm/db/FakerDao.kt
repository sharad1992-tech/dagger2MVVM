package com.sharad.daggermvvm.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.sharad.daggermvvm.model.Product

@Dao
interface FakerDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addProducts(product: List<Product>)

    @Query("SELECT * FROM Product")
   suspend fun getProducts() :List<Product>
}