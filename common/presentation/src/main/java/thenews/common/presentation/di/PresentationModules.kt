package thenews.common.presentation.di

import org.koin.android.ext.koin.androidContext
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module
import thenews.common.data.sharedpref.SharedPref

fun injectPresModules() = loadPresModules

private val loadPresModules by lazy {
    loadKoinModules(
        listOf()
    )
}
