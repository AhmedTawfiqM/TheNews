package thenews.common.presentation.requester

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class Requester<T> {

    suspend fun executeCall(repoCall: () -> suspend () -> T)
            : suspend () -> T {
        val job = coroutineScope {
            async {
                repoCall
            }
        }
        println("result starting...")
        val type = job.await()
        job.cancel()

        return type
    }
}