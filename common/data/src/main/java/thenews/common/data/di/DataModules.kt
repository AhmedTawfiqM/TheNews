package thenews.common.data.di

import org.koin.core.context.loadKoinModules
import org.koin.dsl.module
import thenews.common.data.BuildConfig
import thenews.common.data.domain.news.NewsApi
import thenews.common.data.domain.news.NewsRemoteDataSrc
import thenews.common.data.domain.news.NewsRepo
import thenews.common.data.utils.RetrofitHelper


fun injectDataModules() = loadModules

private val loadModules by lazy {
    loadKoinModules(
        listOf(newsModules)
    )
}
private val newsModules = module {

    single {
        RetrofitHelper().create(BuildConfig.LIBRARY_PACKAGE_NAME, get(), NewsApi::class.java)
    }
    factory { NewsRemoteDataSrc(get()) }
    factory { NewsRepo(get()) }

}