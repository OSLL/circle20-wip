package com.megaprojectsuperpuper.thecode

import android.app.ActivityManager
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_level1.*
import kotlinx.android.synthetic.main.activity_mainf.*
import java.util.*
import kotlin.concurrent.schedule
import kotlin.math.round

open class BackMusicActivity : AppCompatActivity() {
    private lateinit var prefs: SharedPreferences
    // Функция для включения и выключения музыки при запуске Activity
    override fun onResume() {
        prefs = getSharedPreferences("settings", Context.MODE_PRIVATE)
        super.onResume()
        if (prefs.getInt("soundcheck",0) == 1){
            stopService(Intent(this, BackgroundMusic::class.java))

        }
        else{
        startService(Intent(this, BackgroundMusic::class.java))
        }

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
