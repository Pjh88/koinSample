package com.jhpark.koinmvvmsample.di

import com.jhpark.koinmvvmsample.vm.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainViewModel(get()) }

}