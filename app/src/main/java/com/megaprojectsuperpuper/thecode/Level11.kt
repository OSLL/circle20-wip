package com.megaprojectsuperpuper.thecode


import android.R.attr.button
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


class Level11 : AppCompatActivity() {
    var i = 0
    var editcheck = true
    var text = ""
    var check = "1 2 3 4 "
    var name = "11. Нужно больше энергии"
    var lvlcheck = 1
    private lateinit var prefs: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        prefs = getSharedPreferences("settings", Context.MODE_PRIVATE)
        lvlcheck = prefs.getInt("lvlcheck", 11)
        setContentView(R.layout.activity_level1)
        lvl_name.setText(name)



        menubutton.setOnClickListener(){
            val editor = prefs.edit()
            editor.putInt("lvlcheck", lvlcheck)
            editor.apply()
            val intent = Intent(this, menu::class.java)
            startActivity(intent)
        }




        Level11()
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
            val intent = Intent(this, Level1::class.java)
            startActivity(intent)
            this.finish()
        }
    }
    fun Level11(){
        mainbutton.setOnClickListener{
            //запуска второй активити в вводом кода
            textView.alpha = 0.2f
            textView4.alpha = 0.2f
            imageView.alpha = 0.2f
            num1.alpha = 0.2f
            num2.alpha = 0.2f
            num3.alpha = 0.2f
            num4.alpha = 0.2f
            num5.alpha = 0.2f
            num6.alpha = 0.2f
            num7.alpha = 0.2f
            num8.alpha = 0.2f
            num9.alpha = 0.2f
            num0.alpha = 0.2f


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
                textView.alpha = 1f
                textView4.alpha = 1f
                imageView.alpha = 1f
                num1.alpha = 1f
                redbutton.alpha = 1f
                num2.alpha = 1f
                num3.alpha = 1f
                num4.alpha = 1f
                num5.alpha = 1f
                num6.alpha = 1f
                num7.alpha = 1f
                num8.alpha = 1f
                num9.alpha = 1f
                num0.alpha = 1f
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