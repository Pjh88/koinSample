package com.jhpark.koinmvvmsample.di

import com.jhpark.koinmvvmsample.data.datasource.GithubRemoteDataSource
import com.jhpark.koinmvvmsample.data.datasource.source.GithubSource
import com.jhpark.koinmvvmsample.data.repository.GithubRepository
import io.reactivex.schedulers.Schedulers.single
import org.koin.dsl.module

val repositoryModule = module{
    single{ GithubRepository(get()) as GithubSource }
}

val dataSourceModule = module {
    single{ GithubRemoteDataSource(get())}
}