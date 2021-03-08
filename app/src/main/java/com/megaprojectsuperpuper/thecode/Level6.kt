package com.megaprojectsuperpuper.thecode

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_level1.*
import kotlinx.android.synthetic.main.activity_mainf.*
import java.util.*
import kotlin.concurrent.schedule
import kotlin.math.round


class Level6 : AppCompatActivity() {
    var i = 0
    var editcheck = true
    var text = ""
    var check = ""
    var name = "6. Не тот угол"
    var lvlcheck = 6
    private lateinit var prefs: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level1)
        prefs = getSharedPreferences("settings", Context.MODE_PRIVATE)
        lvlcheck = prefs.getInt("lvlcheck", 6)
        lvl_name.setText(name)

        pausebutton.setOnClickListener(){
            pausebutton.visibility = View.INVISIBLE
            resumebutton.visibility = View.VISIBLE
            soundoffbutton.visibility = View.VISIBLE
            soundbutton.visibility = View.VISIBLE
            menubutton.visibility = View.VISIBLE
            redbutton.isClickable = false
            num1.isClickable = false
            num2.isClickable = false
            num3.isClickable = false
            num4.isClickable = false
            num5.isClickable = false
            num6.isClickable = false
            num7.isClickable = false
            num8.isClickable = false
            num9.isClickable = false
            num0.isClickable = false
            mainbutton.isClickable = false
            stol.isClickable = false

            textView.alpha = 0.8f
            textView4.alpha = 0.8f
            imageView.alpha = 0.8f
            stol.alpha = 0.8f
            menubutton.setOnClickListener(){
                val intent = Intent(this, menu::class.java)
                startActivity(intent)
                this.finish()
            }
            soundbutton.setOnClickListener(){
                soundbutton.visibility = View.INVISIBLE
                soundoffbutton.visibility = View.VISIBLE
            }
            soundoffbutton.setOnClickListener(){
                soundbutton.visibility = View.VISIBLE
                soundoffbutton.visibility = View.INVISIBLE
            }
            resumebutton.setOnClickListener(){
                pausebutton.visibility = View.VISIBLE
                resumebutton.visibility = View.INVISIBLE
                soundoffbutton.visibility = View.INVISIBLE
                menubutton.visibility = View.INVISIBLE
                soundbutton.visibility = View.INVISIBLE
                redbutton.isClickable = true
                num1.isClickable = true
                num2.isClickable = true
                num3.isClickable = true
                num4.isClickable = true
                num5.isClickable = true
                num6.isClickable = true
                num7.isClickable = true
                num8.isClickable = true
                num9.isClickable = true
                num0.isClickable = true
                mainbutton.isClickable = true
                stol.isClickable = true
                textView.alpha = 1f
                textView4.alpha = 1f
                imageView.alpha = 1f
                stol.alpha = 1f
            }

        }

        for (i in 1..4){
            var a = Math.random()
            while (round(a*10).toInt() ==10)
            {
                a = Math.random()
            }
            if (round(a*10).toInt() != 10) {
                check += (round(a*10).toInt())
                check += " "
            }
        }

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            val params =
                mainbutton.getLayoutParams()
            params.width += 1000
            params.height += 250
            mainbutton.setLayoutParams(params)
        }
        else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            name = "6. Теперь лучше!"
            lvl_name.setText(name)
            Level11()
        }
    }


    fun kubok(){
        if (prefs.getInt("lvlcheck", 6) <= 7) {
            lvlcheck = 7
            val editor = prefs.edit()
            editor.putInt("lvlcheck", lvlcheck)
            editor.apply()
        }
        setContentView(R.layout.activity_mainf)
        buttonlvl.setOnClickListener(){
            val intent = Intent(this, Level7::class.java)
            startActivity(intent)
            this.finish()
        }
    }
    fun Level11(){
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE)

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
            Level12()
        }

    }
    fun Level12() {
            setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE)

            redbutton.setOnClickListener {
                if (editcheck) {
                    textView.visibility = View.VISIBLE
                    textView.text = check
                }
            }
            num1.setOnClickListener {
                if (editcheck) {
                    text += "1 "
                    textView4.setText(text)
                    bool()
                }
            }
            num2.setOnClickListener {
                if (editcheck) {
                    text += "2 "
                    textView4.setText(text)
                    bool()
                }
            }
            num3.setOnClickListener {
                if (editcheck) {
                    text += "3 "
                    textView4.setText(text)
                    bool()
                }
            }
            num4.setOnClickListener {
                if (editcheck) {
                    text += "4 "
                    textView4.setText(text)
                    bool()
                }
            }
            num5.setOnClickListener {
                if (editcheck) {
                    text += "5 "
                    textView4.setText(text)
                    bool()
                }
            }
            num6.setOnClickListener {
                if (editcheck) {
                    text += "6 "
                    textView4.setText(text)
                    bool()
                }
            }
            num7.setOnClickListener {
                if (editcheck) {
                    text += "7 "
                    textView4.setText(text)
                    bool()
                }
            }
            num8.setOnClickListener {
                if (editcheck) {
                    text += "8 "
                    textView4.setText(text)
                    bool()
                }
            }
            num9.setOnClickListener {
                if (editcheck) {
                    text += "9 "
                    textView4.setText(text)
                    bool()
                }
            }
            num0.setOnClickListener {
                if (editcheck) {
                    text += "0 "
                    textView4.setText(text)
                    bool()
                }
            }

    }
    fun bool(): Unit{
        i++
        if (i == 4){
            if(text.equals(check)){
                kubok()
            }
            else {
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