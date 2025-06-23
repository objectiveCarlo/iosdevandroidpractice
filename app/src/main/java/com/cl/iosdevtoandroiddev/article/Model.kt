package com.cl.iosdevtoandroiddev.article

data class ArticleResponse(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Article>
)

data class Article(
    val id: Int,
    val title: String,
    val summary: String,
    val image_url: String,
    val published_at: String,
    val url: String
)
