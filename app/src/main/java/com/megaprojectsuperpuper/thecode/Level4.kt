package com.megaprojectsuperpuper.thecode

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_level1.*
import kotlinx.android.synthetic.main.activity_mainf.*
import java.util.*
import kotlin.concurrent.schedule

class Level4 : AppCompatActivity() {
    var a : Float = 0.0f
    var i = 0
    var editcheck = true
    var text = ""
    var check = "1 2 3 4 "
    var name = "4.Прислушайся"
    var lvlcheck = 4
    private lateinit var prefs: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level1)
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        prefs = getSharedPreferences("settings", Context.MODE_PRIVATE)
        lvlcheck = prefs.getInt("lvlcheck", 4)
        lvl_name.setText(name)



        button.setOnClickListener(){
            val editor = prefs.edit()
            editor.putInt("lvlcheck", lvlcheck)
            editor.apply()
            val intent = Intent(this, menu::class.java)
            startActivity(intent)}




        mainbutton.setOnClickListener {
            mainbutton.visibility = View.INVISIBLE
            stol.visibility = View.INVISIBLE
            textView.visibility = View.VISIBLE
            textView4.visibility = View.VISIBLE
            imageView.visibility = View.VISIBLE
            num1.visibility = View.VISIBLE
            redbutton.visibility = View.VISIBLE
            num2.visibility = View.VISIBLE
            num3.visibility = View.VISIBLE
            num4.visibility = View.VISIBLE
            num5.visibility = View.VISIBLE
            num6.visibility = View.VISIBLE
            num7.visibility = View.VISIBLE
            num8.visibility = View.VISIBLE
            num9.visibility = View.VISIBLE
            num0.visibility = View.VISIBLE
        }
    }
    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
//setContentView(R.layout.activity_main)
        if (keyCode != KeyEvent.KEYCODE_VOLUME_UP) {
            return false
        }
        textView.text = check
        if (keyCode == KeyEvent.KEYCODE_VOLUME_UP) {
            a+=0.1f
            textView.alpha = a
            textView.visibility = View.VISIBLE
            if (a < 1) return false
        }
        num1.setOnClickListener{
            if (editcheck) {
                text += "1 "
                textView4.setText(text)
                bool()
            }
        }
        num2.setOnClickListener{
            if (editcheck) {
                text += "2 "
                textView4.setText(text)
                bool()
            }
        }
        num3.setOnClickListener{
            if (editcheck) {
                text += "3 "
                textView4.setText(text)
                bool()
            }
        }
        num4.setOnClickListener{
            if (editcheck) {
                text += "4 "
                textView4.setText(text)
                bool()
            }
        }
        num5.setOnClickListener{
            if (editcheck) {
                text += "5 "
                textView4.setText(text)
                bool()
            }
        }
        num6.setOnClickListener{
            if (editcheck) {
                text += "6 "
                textView4.setText(text)
                bool()
            }
        }
        num7.setOnClickListener{
            if (editcheck) {
                text += "7 "
                textView4.setText(text)
                bool()
            }
        }
        num8.setOnClickListener{
            if (editcheck) {
                text += "8 "
                textView4.setText(text)
                bool()
            }
        }
        num9.setOnClickListener{
            if (editcheck) {
                text += "9 "
                textView4.setText(text)
                bool()
            }
        }
        num0.setOnClickListener{
            if (editcheck) {
                text += "0 "
                textView4.setText(text)
                bool()
            }
        }
        return true
    }

    fun kubok(){
        if (prefs.getInt("lvlcheck", 4) <= 5) {
            lvlcheck = 5
            val editor = prefs.edit()
            editor.putInt("lvlcheck", lvlcheck)
            editor.apply()
        }
        setContentView(R.layout.activity_mainf)
        buttonlvl.setOnClickListener(){
            val intent = Intent(this, Level5::class.java)
            startActivity(intent)
            this.finish()
        }
    }
    fun bool(): Unit{
        i++
        if (i == 4){
            if(text.equals(check)){
                kubok()
            }
            else{
                text = ""
                i = 0
                editcheck = false
                textView.visibility = View.INVISIBLE
                error.visibility = View.VISIBLE
                Timer("settingUp", false).schedule(1500) {
                    textView4.setText(text)
                    editcheck = true
                    error.visibility = View.INVISIBLE

                    //textView.visibility = View.VISIBLE
                }
            }
        }
    }
}