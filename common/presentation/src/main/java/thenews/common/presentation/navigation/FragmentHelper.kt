package thenews.common.presentation.navigation

import androidx.fragment.app.Fragment

fun <T: Fragment> fragmentFrom(addressableFragment: AddressableFragment): T {
    return Class.forName(addressableFragment.className).newInstance() as T
}


