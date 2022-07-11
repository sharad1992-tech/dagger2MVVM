package com.sharad.daggermvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.sharad.daggermvvm.viewmodel.MainViewModel
import com.sharad.daggermvvm.viewmodel.MainViewModelFactory
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel
    @Inject
    lateinit var mainViewModelFactory: MainViewModelFactory
    private val  product:TextView
        get() = findViewById<TextView>(R.id.products)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as FakerApplication).applicationComponent.inject(this)

        mainViewModel = ViewModelProvider(this,mainViewModelFactory)
            .get(MainViewModel::class.java)

        mainViewModel.productLiveData.observe(this, Observer {

            product.text = it.joinToString { x -> x.title + "\n\n" }

        })
    }
}