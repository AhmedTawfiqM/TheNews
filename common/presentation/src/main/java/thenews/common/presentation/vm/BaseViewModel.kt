package thenews.common.presentation.vm

import androidx.lifecycle.ViewModel
import thenews.common.data.DataManager
import thenews.common.presentation.requester.Requester

open class BaseViewModel(val dm: DataManager) : ViewModel() {

    suspend fun <T> request(request: suspend () -> T): T {

        val requester: Requester<T> by lazy { Requester<T>() }
        try {

        } catch (ex: Exception) {
            ex.printStackTrace()
        } finally {
            //hide Loading
        }

        return requester.executeCall { request() }.invoke()
    }

}