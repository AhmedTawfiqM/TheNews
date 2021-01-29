package com.atdev.thenews

import android.app.Activity
import android.app.Application

class App : Application() {

    private lateinit var activity: Activity

    fun setCurrentActivity(activity: Activity) {
        this.activity = activity
    }

    fun getCurrentActivity() = this.activity
}