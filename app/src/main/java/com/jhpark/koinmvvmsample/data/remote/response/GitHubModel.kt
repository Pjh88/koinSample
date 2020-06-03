package com.jhpark.koinmvvmsample.data.remote.response

import com.google.gson.annotations.SerializedName

data class GitHubModel(
    @SerializedName("current_user_url")
    val current_user_url: String?,
    @SerializedName("current_user_authorizations_html_url")
    val current_user_authorizations_html_url: String?,
    @SerializedName("authorizations_url")
    val authorizations_url: String?,
    @SerializedName("code_search_url")
    val code_search_url: String?,
    @SerializedName("commit_search_url")
    val commit_search_url: String?,
    @SerializedName("emails_url")
    val emails_url: String?,
    @SerializedName("emojis_url")
    val emojis_url: String?,
    @SerializedName("events_url")
    val events_url: String?,
    @SerializedName("feeds_url")
    val feeds_url: String?,
    @SerializedName("followers_url")
    val followers_url: String?,
    @SerializedName("following_url")
    val following_url: String?,
    @SerializedName("gists_url")
    val gists_url: String?,
    @SerializedName("hub_url")
    val hub_url: String?,
    @SerializedName("issue_search_url")
    val issue_search_url: String?,
    @SerializedName("issues_url")
    val issues_url: String?,
    @SerializedName("keys_url")
    val keys_url: String?,
    @SerializedName("label_search_url")
    val label_search_url: String?,
    @SerializedName("notifications_url")
    val notifications_url: String?,
    @SerializedName("organization_url")
    val organization_url: String?,
    @SerializedName("organization_repositories_url")
    val organization_repositories_url: String?,
    @SerializedName("organization_teams_url")
    val organization_teams_url: String?,
    @SerializedName("public_gists_url")
    val public_gists_url: String?,
    @SerializedName("rate_limit_url")
    val rate_limit_url: String?,
    @SerializedName("repository_url")
    val repository_url: String?,
    @SerializedName("repository_search_url")
    val repository_search_url: String?,
    @SerializedName("current_user_repositories_url")
    val current_user_repositories_url: String?
)