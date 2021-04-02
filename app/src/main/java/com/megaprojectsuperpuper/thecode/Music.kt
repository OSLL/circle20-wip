package com.megaprojectsuperpuper.thecode

import android.app.ActivityManager
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

open class BackMusicActivity : AppCompatActivity() {
    override fun onResume() {
        super.onResume()
        startService(Intent(this, BackgroundMusic::class.java))
    }

    override fun onPause() {
        val context: Context = applicationContext
        val am = context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        val taskInfo = am.getRunningTasks(1)
        if (taskInfo.isNotEmpty()) {
            val topActivity = taskInfo[0].topActivity
            if (topActivity!!.packageName != context.packageName) {
                stopService(Intent(this, BackgroundMusic::class.java))
            }
        }
        super.onPause()
    }
}
