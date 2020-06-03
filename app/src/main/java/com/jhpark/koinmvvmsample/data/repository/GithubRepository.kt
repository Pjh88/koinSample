package com.jhpark.koinmvvmsample.data.repository

import com.jhpark.koinmvvmsample.data.datasource.GithubRemoteDataSource
import com.jhpark.koinmvvmsample.data.datasource.source.GithubSource
import com.jhpark.koinmvvmsample.data.remote.DisposableManager
import com.jhpark.koinmvvmsample.data.remote.response.GitHubModel

class GithubRepository(private val githubRemoteDataSource: GithubRemoteDataSource): GithubSource {

    private var disposableManager: DisposableManager = DisposableManager()

    override fun getGithubList(success: (GitHubModel) -> Unit, failed: () -> Unit) {
        githubRemoteDataSource.getGithubList(success, failed)
    }

    override fun close() {
        disposableManager.dispose()
    }
}