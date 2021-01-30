package com.atdev.thenews.di

import android.content.Context
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import thenews.common.data.di.injectDataModules
import thenews.common.presentation.di.injectPresModules

class KoinInjector {

    fun injectModules(context: Context) {
        startKoin { androidContext(context) }
        injectPresModules()
        injectDataModules()
    }
}