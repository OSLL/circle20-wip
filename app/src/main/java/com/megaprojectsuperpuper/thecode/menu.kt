package com.megaprojectsuperpuper.thecode

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_level1.*
import kotlinx.android.synthetic.main.activity_mainf.*
import kotlinx.android.synthetic.main.activity_menu.*
import java.util.*
import kotlin.concurrent.schedule
class menu : AppCompatActivity() {
    private lateinit var prefs: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        prefs = getSharedPreferences("settings", Context.MODE_PRIVATE)
        var lvlcheck = prefs.getInt("lvlcheck", 0)
        if(lvlcheck == 2){
            block2.visibility = View.INVISIBLE
            lvl2.visibility = View.VISIBLE
        }
        if(lvlcheck == 3){
            block2.visibility = View.INVISIBLE
            lvl2.visibility = View.VISIBLE
            block3.visibility = View.INVISIBLE
            lvl3.visibility = View.VISIBLE
        }








        lvl1.setOnClickListener(){
            val intent = Intent(this, Level1::class.java)
            startActivity(intent)
            this.finish()
        }
        lvl2.setOnClickListener(){
            val intent = Intent(this, Level2::class.java)
            startActivity(intent)
            this.finish()
        }
        lvl3.setOnClickListener(){
            val intent = Intent(this, Level3::class.java)
            startActivity(intent)
            this.finish()
        }
        lvl4.setOnClickListener(){
            val intent = Intent(this, Level4::class.java)
            startActivity(intent)
            this.finish()
        }
        lvl5.setOnClickListener(){
            val intent = Intent(this, Level5::class.java)
            startActivity(intent)
            this.finish()
        }
        lvl6.setOnClickListener(){
            val intent = Intent(this, Level6::class.java)
            startActivity(intent)
            this.finish()
        }
        lvl7.setOnClickListener(){
            val intent = Intent(this, Level7::class.java)
            startActivity(intent)
            this.finish()
        }

    }
}