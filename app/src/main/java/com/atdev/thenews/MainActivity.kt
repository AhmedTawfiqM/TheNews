package com.atdev.thenews

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.luseen.spacenavigation.SpaceItem
import com.luseen.spacenavigation.SpaceNavigationView
import com.luseen.spacenavigation.SpaceOnClickListener
import com.luseen.spacenavigation.SpaceOnLongClickListener

//todo  1- clean architecture
//todo  2- di  koin kodein
//todo  3- build variants
//todo  4- clean code
//todo  5- modular architecture
//
class MainActivity : AppCompatActivity() {
    //
    lateinit var spaceNavigationView: SpaceNavigationView
//
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        if (savedInstanceState == null)
//            FragmentNavigator(this).replace(fragmentFrom(Fragments.Splash), false)



        setUpAppBar(savedInstanceState)
    }

    private fun setUpAppBar(savedInstanceState: Bundle?) {
        //https://github.com/armcha/Space-Navigation-View
        spaceNavigationView = findViewById(R.id.space)
        spaceNavigationView.initWithSaveInstanceState(savedInstanceState)
        spaceNavigationView.addSpaceItem(SpaceItem("HOME", R.drawable.near_me))
        spaceNavigationView.addSpaceItem(SpaceItem("SEARCH", R.drawable.near_me))
        //
        spaceNavigationView.setSpaceOnClickListener(object : SpaceOnClickListener {
            override fun onCentreButtonClick() {
                Toast.makeText(this@MainActivity, "onCentreButtonClick", Toast.LENGTH_SHORT).show()
            }

            override fun onItemClick(itemIndex: Int, itemName: String) {
                Toast.makeText(this@MainActivity, "$itemIndex $itemName", Toast.LENGTH_SHORT).show()
            }

            override fun onItemReselected(itemIndex: Int, itemName: String) {
                Toast.makeText(this@MainActivity, "$itemIndex $itemName", Toast.LENGTH_SHORT).show()
            }
        })

        spaceNavigationView.setSpaceOnLongClickListener(object : SpaceOnLongClickListener {
            override fun onCentreButtonLongClick() {
                Toast.makeText(this@MainActivity, "onCentreButtonLongClick", Toast.LENGTH_SHORT)
                    .show()
            }

            override fun onItemLongClick(itemIndex: Int, itemName: String) {
                Toast.makeText(this@MainActivity, "$itemIndex $itemName", Toast.LENGTH_SHORT).show()
            }
        })
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)   //keep selected item position and badge on device rotation //spaceNavigationView
        spaceNavigationView.onSaveInstanceState(outState)
    }
}