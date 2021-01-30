package thenews.common.data.sharedpref

import android.content.SharedPreferences


class SharedPref(val sharedpref: SharedPreferences) {

    fun setString(type: String, data: String) {
        sharedpref.edit().putString(type, data).apply()
    }

    fun setInt(type: String, data: Int) {
        sharedpref.edit().putInt(type, data).apply()
    }

    fun getString(type: String): String? = sharedpref.getString(type, "")
    fun getInt(type: String) = sharedpref.getInt(type, 0)
}