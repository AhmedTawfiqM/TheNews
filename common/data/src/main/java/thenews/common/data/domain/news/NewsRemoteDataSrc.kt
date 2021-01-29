package thenews.common.data.domain.news

import thenews.common.data.model.NewsRequest
import thenews.common.data.model.NewsResponse

class NewsRemoteDataSrc(private val api: NewsApi) {

    fun getAllNews(newsRequest: NewsRequest) : NewsResponse{
        return  api.getEveryThing(q = newsRequest.country, from = newsRequest.date)
    }
}