package thenews.common.data

import thenews.common.data.domain.news.NewsRepo
import thenews.common.data.sharedpref.SharedPref

data class DataManager(
    val shared: SharedPref,
    val newsRepo: NewsRepo
)