package com.jhpark.koinmvvmsample.vm

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.jhpark.koinmvvmsample.base.BaseViewModel
import com.jhpark.koinmvvmsample.data.datasource.source.GithubSource
import com.jhpark.koinmvvmsample.data.remote.response.GitHubModel

class MainViewModel(private val githubSource: GithubSource): BaseViewModel() {

    private val _github = MutableLiveData<GitHubModel>()

    val github: LiveData<GitHubModel> get() = _github


    fun getGitHubs(){
        isLoadingObservable.value = true

//        val githubList = listOf<GitHubModel>().toMutableList()

        githubSource.getGithubList(success = {
//            githubList.addAll(it)

            isLoadingObservable.value = false
            _github.value = it
        }, failed = {
            Log.e("JHTEST", "failed")
            isLoadingObservable.value = false
//            _githubs.value = githubList
        })
    }

    override fun close() {
        githubSource.close()
    }
}