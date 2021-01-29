package com.atdev.thenews.ui

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import com.atdev.thenews.R
import com.luseen.spacenavigation.SpaceItem
import com.luseen.spacenavigation.SpaceNavigationView
import com.luseen.spacenavigation.SpaceOnClickListener
import com.luseen.spacenavigation.SpaceOnLongClickListener

class AppBarSetup(val context: Context) {

     fun setUpAppBar(spaceNavigationView: SpaceNavigationView, savedInstanceState: Bundle?) {
        //https://github.com/armcha/Space-Navigation-View

        spaceNavigationView.initWithSaveInstanceState(savedInstanceState)
        spaceNavigationView.addSpaceItem(SpaceItem("HOME",
            R.drawable.near_me
        ))
        spaceNavigationView.addSpaceItem(SpaceItem("SEARCH",
            R.drawable.near_me
        ))
        //
        spaceNavigationView.setSpaceOnClickListener(object : SpaceOnClickListener {
            override fun onCentreButtonClick() {
                Toast.makeText(context, "onCentreButtonClick", Toast.LENGTH_SHORT).show()
            }

            override fun onItemClick(itemIndex: Int, itemName: String) {
                Toast.makeText(context, "$itemIndex $itemName", Toast.LENGTH_SHORT).show()
            }

            override fun onItemReselected(itemIndex: Int, itemName: String) {
                Toast.makeText(context, "$itemIndex $itemName", Toast.LENGTH_SHORT).show()
            }
        })

        spaceNavigationView.setSpaceOnLongClickListener(object : SpaceOnLongClickListener {
            override fun onCentreButtonLongClick() {
                Toast.makeText(context, "onCentreButtonLongClick", Toast.LENGTH_SHORT)
                    .show()
            }

            override fun onItemLongClick(itemIndex: Int, itemName: String) {
                Toast.makeText(context, "$itemIndex $itemName", Toast.LENGTH_SHORT).show()
            }
        })
    }
}