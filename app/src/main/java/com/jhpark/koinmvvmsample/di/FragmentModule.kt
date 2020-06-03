package com.jhpark.koinmvvmsample.di

import com.jhpark.koinmvvmsample.ui.main.MainFragment
import org.koin.androidx.fragment.dsl.fragment
import org.koin.dsl.module

val fragmentModule = module {
    fragment { MainFragment() }
}