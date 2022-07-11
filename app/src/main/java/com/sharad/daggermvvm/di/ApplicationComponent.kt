package com.sharad.daggermvvm.di

import android.app.Application
import android.content.Context
import com.sharad.daggermvvm.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class,DatabaseModule::class])
interface ApplicationComponent {

    fun inject(activity:MainActivity)

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance context:Context):ApplicationComponent
    }
}