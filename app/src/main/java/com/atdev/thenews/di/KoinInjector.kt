package com.atdev.thenews.di

import thenews.common.data.di.injectDataModules

class KoinInjector {

    fun injectModules() {

        injectDataModules()
    }
}