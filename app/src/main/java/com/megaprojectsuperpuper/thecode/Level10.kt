package com.megaprojectsuperpuper.thecode

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_level1.*
import kotlinx.android.synthetic.main.activity_mainf.*
import java.util.*
import kotlin.concurrent.schedule

class Level10 : AppCompatActivity() {
    var i = 0
    var editcheck = true
    var text = ""
    var check = "6 6 6 6 "
    var name = "10. Вечное возвращение"

    private lateinit var prefs: SharedPreferences
    var lvlcheck = 10
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level1)
        prefs = getSharedPreferences("settings", Context.MODE_PRIVATE)
        lvlcheck = prefs.getInt("lvlcheck", 10)
        lvl_name.setText(name)




        pausebutton.setOnClickListener(){
            pauseupdate(clickable = true, alpha = 1f, visibility = View.INVISIBLE)
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
                pauseupdate(clickable = false, alpha = 0.8f, visibility = View.VISIBLE)
            }

        }



        Level11()
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
    fun kubok(){
        if (prefs.getInt("lvlcheck", 10) <= 11) {
            lvlcheck = 11
            val editor = prefs.edit()
            editor.putInt("lvlcheck", lvlcheck)
            editor.apply()
        }
        setContentView(R.layout.activity_mainf)
        buttonlvl.setOnClickListener(){
            val intent = Intent(this, Level11::class.java)
            startActivity(intent)
            this.finish()
        }
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