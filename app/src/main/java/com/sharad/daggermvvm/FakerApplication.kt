package com.sharad.daggermvvm

import android.app.Application
import android.content.Context
import com.sharad.daggermvvm.di.ApplicationComponent
import com.sharad.daggermvvm.di.DaggerApplicationComponent
import dagger.Component

 class FakerApplication:Application() {

    lateinit var applicationComponent:ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.factory().create(this)
    }


}