package com.jhpark.koinmvvmsample.ui.main

import android.os.Bundle
import com.jhpark.koinmvvmsample.AppApplication
import com.jhpark.koinmvvmsample.R
import com.jhpark.koinmvvmsample.base.BaseActivity
import com.jhpark.koinmvvmsample.databinding.ActivityMainBinding
import org.koin.android.ext.android.inject
import org.koin.androidx.fragment.android.setupKoinFragmentFactory
import org.koin.core.parameter.parametersOf

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {


    private val mainFragment by inject<MainFragment> {
        parametersOf(null)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        setupKoinFragmentFactory()
        super.onCreate(savedInstanceState)




        try {
            val fragmentManager = supportFragmentManager
            fragmentManager.beginTransaction().replace(R.id.container, mainFragment).commit()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
