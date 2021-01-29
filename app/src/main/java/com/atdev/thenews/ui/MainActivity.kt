package com.atdev.thenews.ui

import android.os.Bundle
import thenews.common.presentation.ui.BaseActivity
import com.atdev.thenews.R
import com.luseen.spacenavigation.SpaceNavigationView
import thenews.common.presentation.navigation.FragmentNavigator
import thenews.common.presentation.navigation.Fragments
import thenews.common.presentation.navigation.fragmentFrom

//todo  1- clean architecture
//todo  2- di  koin kodein
//todo  3- build variants
//todo  4- clean code
//todo  5- modular architecture
//
class MainActivity : BaseActivity() {

    private lateinit var spaceNavigationView: SpaceNavigationView  //Main Bottom Bar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null)
            FragmentNavigator(this, R.id.mainFrame).replace(fragmentFrom(Fragments.Splash), false)

        spaceNavigationView = findViewById(R.id.space)
        AppBarSetup(this)
            .setUpAppBar(findViewById(R.id.space), savedInstanceState)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)   //keep selected item position and badge on device rotation //spaceNavigationView
        spaceNavigationView.onSaveInstanceState(outState)
    }
}