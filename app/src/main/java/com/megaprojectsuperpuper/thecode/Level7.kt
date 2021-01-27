package com.megaprojectsuperpuper.thecode

import android.content.Intent
import android.content.pm.ActivityInfo
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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_level1)
        textView3.setText(name)
        timer = Timer()

        Level11()
    }
    fun kubok(){
        setContentView(R.layout.activity_mainf)
        buttonlvl.setOnClickListener(){
            val intent = Intent(this, Level2::class.java)
            startActivity(intent)
        }

    }
    fun go_back(){
        timer?.cancel()
        val intent = Intent(this, Level7::class.java)
        startActivity(intent)

    }
    fun Level11(){
        mainbutton.setOnClickListener{
            //запуска второй активити в вводом кода
            mainbutton.visibility = View.INVISIBLE
            textView.visibility = View.VISIBLE
            textView4.visibility = View.VISIBLE
            imageView.visibility = View.VISIBLE
            button1.visibility = View.VISIBLE
            button4.visibility = View.VISIBLE
            button5.visibility = View.VISIBLE
            button6.visibility = View.VISIBLE
            button7.visibility = View.VISIBLE
            button8.visibility = View.VISIBLE
            button9.visibility = View.VISIBLE
            button10.visibility = View.VISIBLE
            button11.visibility = View.VISIBLE
            button12.visibility = View.VISIBLE
            button13.visibility = View.VISIBLE
            Level12()
        }
    }
    fun Level12() {
        button4.setOnClickListener{
            textView.text = check
            val timer = object: CountDownTimer(20000, 1000) {

                override fun onFinish() {
                    kubok()
                }

                override fun onTick(millisUntilFinished: Long) {
                }
            }
            timer.start()
        }
        button1.setOnClickListener{
            text += "1 "
            textView4.setText(text)
            go_back()
        }
        button5.setOnClickListener{
            text += "2 "
            textView4.setText(text)
            go_back()
        }
        button6.setOnClickListener{
            text += "3 "
            textView4.setText(text)
            go_back()
        }
        button7.setOnClickListener{
            text += "4 "
            textView4.setText(text)
            go_back()
        }
        button8.setOnClickListener{
            text += "5 "
            textView4.setText(text)
            go_back()
        }
        button9.setOnClickListener{
            text += "6 "
            textView4.setText(text)
            go_back()
        }
        button10.setOnClickListener{
            text += "7 "
            textView4.setText(text)
            go_back()
        }
        button11.setOnClickListener{
            text += "8 "
            textView4.setText(text)
            go_back()
        }
        button12.setOnClickListener{
            text += "9 "
            textView4.setText(text)
            go_back()
        }
        button13.setOnClickListener{
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
            else{
                text = ""
                i = 0
            }
        }
    }
}