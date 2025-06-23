package com.cl.iosdevtoandroiddev.article

import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface SpaceflightApi {
    @GET("articles/")
    suspend fun getArticles(@Query("format") format: String = "json"): ArticleResponse
}

object RetrofitClient {
    val api: SpaceflightApi by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.spaceflightnewsapi.net/v4/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(SpaceflightApi::class.java)
    }
}
