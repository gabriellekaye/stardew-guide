package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.util

import android.content.Context
import android.content.SharedPreferences

class StoragePreferences {
    //similar to settings
    private var appPreferences: SharedPreferences? = null
    private val PREFS = "appPreferences"

    constructor(context: Context) {
        //MODE_PRIVATE: this shared preferences is specific to this application
        appPreferences = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
    }

    /*  Saving shared preference. Identify the ff:
        1. ID/Key of item you want to save
        2. value you want to save
     */
    fun saveStringPreferences(key: String?, value: String?) {
        val prefsEditor = appPreferences!!.edit()
        prefsEditor.putString(key, value)
        prefsEditor.commit()
    }

    //retrieve
    fun getStringPreferences(key: String?): String? {
        //(key, defValue)
        //"Nothing Saved" to indicate nothing has been saved to that key yet
        return appPreferences!!.getString(key, "")
    }

    //retrieve
    fun clearStringPreferences(){
        //(key, defValue)
        val prefsEditor = appPreferences!!.edit()
        prefsEditor.clear()
        prefsEditor.apply()
    }
}