package com.sharad.daggermvvm.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sharad.daggermvvm.model.Product

@Database(entities = [Product::class],version = 1)
 abstract class FakeDB:RoomDatabase() {

     abstract fun getFackerDAO():FakerDao

}