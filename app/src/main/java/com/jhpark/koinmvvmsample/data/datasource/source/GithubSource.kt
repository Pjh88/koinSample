package com.jhpark.koinmvvmsample.data.datasource.source

import com.jhpark.koinmvvmsample.base.BaseSource
import com.jhpark.koinmvvmsample.data.remote.response.GitHubModel

interface GithubSource: BaseSource {

    fun getGithubList(success: (GitHubModel) -> Unit, failed: () -> Unit)
}