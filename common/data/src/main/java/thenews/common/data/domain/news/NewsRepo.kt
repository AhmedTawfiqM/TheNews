package thenews.common.data.domain.news

import thenews.common.data.model.LoadType
import thenews.common.data.model.NewsRequest

class NewsRepo(private val remoteDataSrc: NewsRemoteDataSrc) {

    fun getNews(newsRequest: NewsRequest, type: LoadType){
        when(type){
            LoadType.REMOTE ->  remoteDataSrc.getAllNews(newsRequest)
        }
    }
}