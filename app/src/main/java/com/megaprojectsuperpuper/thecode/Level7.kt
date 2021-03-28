package com.megaprojectsuperpuper.thecode

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import kotlinx.android.synthetic.main.activity_level1.*
import kotlinx.android.synthetic.main.activity_mainf.*
import java.util.*

class Level7 : AppCompatActivity() {
    var i = 0
    var second = 1
    var timer: Timer? = null
    var text = ""
    var check = "1 2 3 4 "
    var name = "7. Вовремя остановись"
    var lvlcheck = 7
    private lateinit var prefs: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_level1)
        prefs = getSharedPreferences("settings", Context.MODE_PRIVATE)
        lvlcheck = prefs.getInt("lvlcheck", 7)
        lvl_name.setText(name)
        timer = Timer()





        pausebutton.setOnClickListener(){
            pauseupdate(clickable = true, alpha = 1f, visibility = View.INVISIBLE)
            menubutton.setOnClickListener(){
                val intent = Intent(this, First_screen::class.java)
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
                pauseupdate(clickable = false, alpha = 0.8f, visibility = View.VISIBLE)
            }

        }





        Level11()
    }
    fun kubok(){
        if (prefs.getInt("lvlcheck", 7) <= 8) {
            lvlcheck = 8
            val editor = prefs.edit()
            editor.putInt("lvlcheck", lvlcheck)
            editor.apply()
        }
        setContentView(R.layout.activity_mainf)
        buttonlvl.setOnClickListener(){
            val intent = Intent(this, Level8::class.java)
            startActivity(intent)
            this.finish()
        }

    }

    fun go_back(){
        timer?.cancel()
        val intent = Intent(this, Level7::class.java)
        startActivity(intent)
        this.finish()
    }
    fun pauseupdate(clickable:Boolean, alpha:Float, visibility:Int){
        var visres: Int = if (visibility== View.INVISIBLE){
            View.VISIBLE }

        else
            View.INVISIBLE
        var alphares: Float = if (alpha == 1f){
            0.8f
        }
        else
            1f
        var clres: Boolean = clickable != true

        pausebutton.visibility = visibility
        resumebutton.visibility = visres
        menubutton.visibility = visres
        soundoffbutton.visibility = visres
        soundbutton.visibility = visres
        textView.alpha = alphares
        textView4.alpha = alphares
        imageView.alpha = alphares
        stol.alpha = alphares
        redbutton.isClickable = clres
        num1.isClickable = clres
        num2.isClickable = clres
        num3.isClickable = clres
        num4.isClickable = clres
        num5.isClickable = clres
        num6.isClickable = clres
        num7.isClickable = clres
        num8.isClickable = clres
        num9.isClickable = clres
        num0.isClickable = clres
        mainbutton.isClickable = clres
        stol.isClickable = clres



    }
    fun Level11(){
        mainbutton.setOnClickListener{
            //запуска второй активити в вводом кода
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
        redbutton.setOnClickListener{
            textView.text = check
            val timer = object: CountDownTimer(8000, 1000) {

                override fun onFinish() {
                    kubok()
                }

                override fun onTick(millisUntilFinished: Long) {
                }
            }
            timer.start()
        }
        num1.setOnClickListener{
            text += "1 "
            textView4.setText(text)
            go_back()
        }
        num2.setOnClickListener{
            text += "2 "
            textView4.setText(text)
            go_back()
        }
        num3.setOnClickListener{
            text += "3 "
            textView4.setText(text)
            go_back()
        }
        num4.setOnClickListener{
            text += "4 "
            textView4.setText(text)
            go_back()
        }
        num5.setOnClickListener{
            text += "5 "
            textView4.setText(text)
            go_back()
        }
        num6.setOnClickListener{
            text += "6 "
            textView4.setText(text)
            go_back()
        }
        num7.setOnClickListener{
            text += "7 "
            textView4.setText(text)
            go_back()
        }
        num8.setOnClickListener{
            text += "8 "
            textView4.setText(text)
            go_back()
        }
        num9.setOnClickListener{
            text += "9 "
            textView4.setText(text)
            go_back()
        }
        num0.setOnClickListener{
            text += "0 "
            textView4.setText(text)
            go_back()
        }

    }
    fun bool(): Unit{
        i++
        if (i == 4){
            if(text.equals(check)){
                return
            }
            else {
                text = ""
                i = 0
                }
            }
        }
    }