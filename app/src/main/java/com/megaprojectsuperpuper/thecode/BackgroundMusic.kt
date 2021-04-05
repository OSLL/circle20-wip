package com.megaprojectsuperpuper.thecode

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class BackgroundMusic : Service() {

    var alreadyRunning = false

    var mediaPlayer: MediaPlayer? = null
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
        mediaPlayer = MediaPlayer.create(this, R.raw.background_theme)
        mediaPlayer?.isLooping = true;
        mediaPlayer?.setVolume(10F, 100F)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int):Int {
        if (alreadyRunning)
            return super.onStartCommand(intent, flags, startId)
        mediaPlayer?.start()
        alreadyRunning = true
        return super.onStartCommand(intent, flags, startId)
    }


    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer?.stop()
        mediaPlayer?.release()
        mediaPlayer = null
    }
}
