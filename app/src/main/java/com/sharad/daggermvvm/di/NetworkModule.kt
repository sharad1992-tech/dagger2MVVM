package com.sharad.daggermvvm.di

import com.sharad.daggermvvm.retrofit.FakerApi
import com.sharad.daggermvvm.utils.Constant
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl(Constant.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideFakerApi(retrofit: Retrofit):FakerApi{
        return  retrofit.create(FakerApi::class.java)
    }
}