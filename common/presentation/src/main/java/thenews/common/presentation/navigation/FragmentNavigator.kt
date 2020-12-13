package thenews.common.presentation.navigation

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

class FragmentNavigator(
    private val activity: FragmentActivity,
    val frameResourceId: Int
) {

    fun addFragment(fragment: Fragment, addBackStack: Boolean = true) {
        navigate(fragment, addBackStack, TransactionBehavior.ADD)
    }

    fun replace(fragment: Fragment, addToBackStack: Boolean = true) {
        navigate(fragment, addToBackStack, TransactionBehavior.REPLACE)
    }

    fun remove(fragment: Fragment) {
        activity.supportFragmentManager
            .beginTransaction()
            .remove(fragment)
            .commitAllowingStateLoss()
    }

    private fun navigate(
        fragment: Fragment,
        addToBackStack: Boolean,
        transactionBehavior: TransactionBehavior
    ) {
        val ft = activity.supportFragmentManager.beginTransaction()

        when (transactionBehavior) {
            TransactionBehavior.ADD -> ft.add(
                frameResourceId,
                fragment,
                fragment.javaClass.name
            )

            TransactionBehavior.REPLACE -> ft.replace(
                frameResourceId,
                fragment,
                fragment.javaClass.name
            )
        }

        if (addToBackStack)
            ft.addToBackStack(fragment.javaClass.name)

        ft.commitAllowingStateLoss()
    }

    fun showDialogFragment(dialog: DialogFragment, tag: String) {
        dialog.show(activity.supportFragmentManager, tag)
    }

    fun showDialogFragment(dialog: DialogFragment) {
        showDialogFragment(dialog, dialog.javaClass.name)
    }

    private enum class TransactionBehavior {
        REPLACE,
        ADD
    }
}