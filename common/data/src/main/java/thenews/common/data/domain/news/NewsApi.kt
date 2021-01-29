package thenews.common.data.domain.news

import retrofit2.http.GET
import retrofit2.http.Query
import thenews.common.data.model.NewsResponse

interface NewsApi {

    @GET("everything?sortBy=publishedAt") //q=tesla&from=2020-12-29&
    fun getEveryThing(@Query("q") q: String, @Query("from") from: String): NewsResponse
}