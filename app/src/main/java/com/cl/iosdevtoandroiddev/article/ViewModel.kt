package com.cl.iosdevtoandroiddev.article

import androidx.lifecycle.*
import kotlinx.coroutines.launch

class ArticleViewModel : ViewModel() {

    private val _articles = MutableLiveData<List<Article>>()
    val articles: LiveData<List<Article>> = _articles

    private val _error = MutableLiveData<String>()
    val error: LiveData<String> = _error

    init {
        fetchArticles()
    }

    fun fetchArticles() {
        viewModelScope.launch {
            try {
                val response = RetrofitClient.api.getArticles()
                _articles.value = response.results
            } catch (e: Exception) {
                _error.value = e.message ?: "Unknown error"
            }
        }
    }
}