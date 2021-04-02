package com.megaprojectsuperpuper.thecode


import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.SharedPreferences
import android.os.BatteryManager
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_level1.*
import kotlinx.android.synthetic.main.activity_mainf.*
import java.util.*
import kotlin.concurrent.schedule
import kotlin.math.round


class Level11 : BackMusicActivity() {
    var i = 0
    var editcheck = true
    var text = ""
    var check = ""
    var name = "11. Нужно больше энергии"
    var lvlcheck = 1
    var light = 0.4f
    private lateinit var prefs: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        prefs = getSharedPreferences("settings", Context.MODE_PRIVATE)
        lvlcheck = prefs.getInt("lvlcheck", 11)
        setContentView(R.layout.activity_level1)
        lvl_name.setText(name)

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
    fun pauseupdate(clickable:Boolean, alpha:Float, visibility:Int){
        var visres: Int = if (visibility== View.INVISIBLE){
            View.VISIBLE }

        else
            View.INVISIBLE
        var alphares: Float = if (alpha == 1f){
            light - 0.2f
        }
        else
            light
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
    fun isPhonePluggedIn(context: Context): Boolean {
        var charging = false
        val batteryIntent = context.registerReceiver(
            null,
            IntentFilter(Intent.ACTION_BATTERY_CHANGED)
        )
        val status = batteryIntent!!.getIntExtra(BatteryManager.EXTRA_STATUS, -1)
        val batteryCharge = status == BatteryManager.BATTERY_STATUS_CHARGING
        val chargePlug = batteryIntent.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1)
        val usbCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_USB
        val acCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_AC
        if (batteryCharge) charging = true
        if (usbCharge) charging = true
        if (acCharge) charging = true
        return charging
    }


    fun kubok(){
        if (prefs.getInt("lvlcheck", 11) <= 12) {
            lvlcheck = 12
            val editor = prefs.edit()
            editor.putInt("lvlcheck", lvlcheck)
            editor.apply()
        }
        setContentView(R.layout.activity_mainf)
        buttonlvl.setOnClickListener(){
            val intent = Intent(this, Level13::class.java)
            startActivity(intent)
            this.finish()
        }
    }
    fun Level11(){
        mainbutton.setOnClickListener{
            //запуска второй активити в вводом кода
            textView.alpha = (light +0.1f)
            textView4.alpha = (light + 0.1f)
            imageView.alpha = (light+0.1f)


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
        redbutton.setOnClickListener {
            if (isPhonePluggedIn(this)) {
                light = 1f
                textView.alpha = light
                textView4.alpha = light
                imageView.alpha = light
                redbutton.setOnClickListener {
                    if (editcheck) {
                        textView.visibility = View.VISIBLE
                        textView.text = check
                    }
                }
                num1.setOnClickListener{
                    vvod(1)
                }
                num2.setOnClickListener{
                    vvod(2)
                }
                num3.setOnClickListener{
                    vvod(3)
                }
                num4.setOnClickListener{
                    vvod(4)
                }
                num5.setOnClickListener{
                    vvod(5)
                }
                num6.setOnClickListener{
                    vvod(6)
                }
                num7.setOnClickListener{
                    vvod(7)
                }
                num8.setOnClickListener{
                    vvod(8)
                }
                num9.setOnClickListener{
                    vvod(9)
                }
                num0.setOnClickListener{
                    vvod(0)
                }

                }

            }
        }
    fun vvod(num: Int){
        if (editcheck){
            text+= "$num "
            textView4.setText(text)
            bool()
        }
    }
    fun bool(): Unit{
        i++
        if (i == 4){
            if(text.equals(check)){
                kubok()
            }
            else{
                textView.visibility = View.INVISIBLE
                text = ""
                i = 0
                editcheck = false
                error.visibility = View.VISIBLE
                Timer("settingUp", false).schedule(1500) {
                    textView4.setText(text)
                    editcheck = true
                    error.visibility = View.INVISIBLE
                    //Log.d("pupok", "gjrj")
                    //textView.visibility = View.VISIBLE
                }
                //Log.d("pupok","kok")
                //if (i == 0) textView.visibility = View.VISIBLE

            }
        }
    }
}