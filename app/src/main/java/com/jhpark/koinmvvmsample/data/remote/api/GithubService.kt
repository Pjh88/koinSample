package com.jhpark.koinmvvmsample.data.remote.api

import com.jhpark.koinmvvmsample.data.remote.response.GitHubModel
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.HeaderMap

interface GithubService {
    @GET(".")
    fun getGithubList(@HeaderMap request: Map<String, String>): Single<Response<GitHubModel>>
}