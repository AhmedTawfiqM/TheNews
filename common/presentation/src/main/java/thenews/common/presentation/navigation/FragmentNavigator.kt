package thenews.common.presentation.navigation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

class FragmentNavigator(
    private val activity: FragmentActivity,
    val frameResourceId: Int

) {

    fun addFragment(fragment: Fragment, addBackStack: Boolean = true) {

    }

}