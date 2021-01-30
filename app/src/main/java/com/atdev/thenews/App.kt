package com.atdev.thenews

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Application
import android.content.Context
import androidx.annotation.StringRes
import com.atdev.thenews.di.KoinInjector

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        context = applicationContext
        KoinInjector().injectModules(this)
    }


    companion object {

        @SuppressLint("StaticFieldLeak")
        private lateinit var context: Context

        fun getContext() = context

        @JvmStatic
        fun string(@StringRes res: Int): String {
            return context.getString(res)
        }

    }


}