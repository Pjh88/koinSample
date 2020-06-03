package com.jhpark.koinmvvmsample.di

import com.jhpark.koinmvvmsample.data.remote.api.GithubService
import com.jhpark.koinmvvmsample.data.remote.api.ServiceManager
import org.koin.core.module.Module
import org.koin.dsl.module
import retrofit2.Retrofit

val apiManagerModule: Module = module{
    single{
        ServiceManager((get() as Retrofit).create(GithubService::class.java))
    }
}