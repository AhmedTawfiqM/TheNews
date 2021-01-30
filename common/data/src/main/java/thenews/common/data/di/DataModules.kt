package thenews.common.data.di

import org.koin.android.ext.koin.androidContext
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module
import thenews.common.data.BuildConfig
import thenews.common.data.domain.news.NewsApi
import thenews.common.data.domain.news.NewsRemoteDataSrc
import thenews.common.data.domain.news.NewsRepo
import thenews.common.data.sharedpref.SharedPref
import thenews.common.data.utils.RetrofitHelper


fun injectDataModules() = loadModules

private val loadModules by lazy {
    loadKoinModules(
        listOf(
            newsModules,
            sharedModule
        )
    )
}
private val newsModules = module {

    single {
        RetrofitHelper().create(BuildConfig.API_BASE_URL, get(), NewsApi::class.java)
    }
    factory { NewsRemoteDataSrc(get()) }
    factory { NewsRepo(get()) }
}

val sharedModule = module {
    val PREF_FILE_NAME = "News"
    single { androidContext().getSharedPreferences(PREF_FILE_NAME, 0) }
    single { SharedPref(get()) }
}