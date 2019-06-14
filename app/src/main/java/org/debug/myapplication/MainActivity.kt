package org.debug.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.afollestad.materialdialogs.MaterialDialog

class MainActivity : AppCompatActivity() {

    class PvrChannelGroup(@JvmField val label: String? = null, @JvmField val channelGroupId: Long = -1, @JvmField val channelType: String? = null) {

        override fun toString(): String {
            return "$label ($channelType)"
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val filterList: List<PvrChannelGroup>? = null

        MaterialDialog.Builder(this)
            .items(filterList?.mapNotNull { it.label } ?: emptyList())
            .build()
    }
}
