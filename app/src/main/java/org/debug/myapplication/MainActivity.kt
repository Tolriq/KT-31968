package org.debug.myapplication

import android.content.pm.PackageManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    fun isApplicationInstalled(uri: String): Boolean {
        return try {
            applicationContext.packageManager?.getPackageInfo(uri, PackageManager.GET_ACTIVITIES) != null ?: false
        } catch (e: PackageManager.NameNotFoundException) {
            false
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
