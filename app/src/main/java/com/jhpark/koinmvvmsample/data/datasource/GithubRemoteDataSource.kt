package com.jhpark.koinmvvmsample.data.datasource

import com.jhpark.koinmvvmsample.data.datasource.source.GithubSource
import com.jhpark.koinmvvmsample.data.remote.DisposableManager
import com.jhpark.koinmvvmsample.data.remote.api.ServiceManager
import com.jhpark.koinmvvmsample.data.remote.response.GitHubModel
import io.reactivex.android.schedulers.AndroidSchedulers

class GithubRemoteDataSource(private val serviceManager: ServiceManager): GithubSource {

    private var disposableManager: DisposableManager = DisposableManager()

    override fun getGithubList(success: (GitHubModel) -> Unit, failed: () -> Unit) {
        disposableManager.add(
            serviceManager.getGithubList()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    it.body()?.let(success)
                }, {
                    failed.invoke()
                })
        )
    }

    override fun close() {
        disposableManager.dispose()
    }

}