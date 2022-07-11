package com.sharad.daggermvvm.di

import android.content.Context
import androidx.room.Room
import com.sharad.daggermvvm.db.FakeDB
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideFckerDB(context:Context):FakeDB{
        return Room.databaseBuilder(context,FakeDB::class.java,"FakerDB")
             .build()
    }
}