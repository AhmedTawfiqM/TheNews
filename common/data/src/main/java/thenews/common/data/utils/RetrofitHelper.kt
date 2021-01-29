package thenews.common.data.utils

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitHelper {

    fun <T> create(baseUrl: String, client: OkHttpClient, service: Class<T>): T {

        val gson = GsonBuilder().setPrettyPrinting().create()

        return Retrofit.Builder()
            .client(client)
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(service)
    }
}