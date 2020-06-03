package com.jhpark.koinmvvmsample.data.remote.api

import com.jhpark.koinmvvmsample.data.remote.response.GitHubModel
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import retrofit2.Response

class ServiceManager(private val githubService: GithubService) {

    private val requestType1 = mutableMapOf("Authorization" to "token 4a71105ed14c2316c1aa133ce935558580b87a49")

    fun getGithubList(): Single<Response<GitHubModel>>{
        return githubService.getGithubList(requestType1)
            .subscribeOn(Schedulers.io())
    }
}