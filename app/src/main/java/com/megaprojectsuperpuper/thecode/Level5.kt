package com.megaprojectsuperpuper.thecode

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_level1.*
import kotlinx.android.synthetic.main.activity_mainf.*
import java.lang.Math.sqrt
import java.util.*
import kotlin.concurrent.schedule
import kotlin.math.round


class Level5 : BackMusicActivity() {
    var i = 0
    var editcheck = true
    var text = ""
    var check = ""
    var name = "5.Ты тряси-тряси смартфон"
    var soundcheck = 0

    private var sensorManager: SensorManager? = null
    private var acceleration = 0f
    private var currentAcceleration = 0f
    private var lastAcceleration = 0f
    private lateinit var prefs: SharedPreferences
    var lvlcheck = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level1)
        lvl_name.setText(name)
        prefs = getSharedPreferences("settings", Context.MODE_PRIVATE)
        lvlcheck = prefs.getInt("lvlcheck", 5)

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
            soundcheck = prefs.getInt("soundcheck", 0)
            if (soundcheck == 1){
                soundbutton.visibility = View.INVISIBLE
                soundoffbutton.visibility = View.VISIBLE
                stopService(Intent(this, BackgroundMusic::class.java))
            }
            menubutton.setOnClickListener(){
                val intent = Intent(this, First_screen::class.java)
                startActivity(intent)
                this.finish()
            }
            soundbutton.setOnClickListener(){
                val editor = prefs.edit()
                editor.putInt("soundcheck", 1)
                editor.apply()
                soundbutton.visibility = View.INVISIBLE
                soundoffbutton.visibility = View.VISIBLE
            }
            soundoffbutton.setOnClickListener(){
                val editor = prefs.edit()
                editor.putInt("soundcheck", 0)
                editor.apply()
                soundbutton.visibility = View.VISIBLE
                soundoffbutton.visibility = View.INVISIBLE
                startService(Intent(this, BackgroundMusic::class.java))
            }
            resumebutton.setOnClickListener(){
                pauseupdate(clickable = false, alpha = 0.8f, visibility = View.VISIBLE)
            }

        }

        Level11()

        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        Objects.requireNonNull(sensorManager)!!.registerListener(sensorListener, sensorManager!!.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL)
        acceleration = 10f
        currentAcceleration = SensorManager.GRAVITY_EARTH
        lastAcceleration = SensorManager.GRAVITY_EARTH
    }

    private val sensorListener: SensorEventListener = object : SensorEventListener {
        override fun onSensorChanged(event: SensorEvent) {
            val x = event.values[0]
            val y = event.values[1]
            val z = event.values[2]
            lastAcceleration = currentAcceleration
            currentAcceleration = sqrt((x * x + y * y + z * z).toDouble()).toFloat()
            val delta = currentAcceleration - lastAcceleration
            acceleration = acceleration * 0.9f + delta
            if (acceleration > 25) {
                //Toast.makeText(applicationContext, "Shake event detected", Toast.LENGTH_SHORT).show()
                Level12()
            }
        }
        override fun onAccuracyChanged(sensor: Sensor, accuracy: Int) {}
    }
    override fun onResume() {
        sensorManager?.registerListener(sensorListener, sensorManager!!.getDefaultSensor(Sensor .TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL)
        super.onResume()
    }

    override fun onPause() {
        sensorManager?.unregisterListener(sensorListener)
        super.onPause()
    }


    fun kubok(){

        if (prefs.getInt("lvlcheck", 5) <= 6) {
            lvlcheck = 6
            val editor = prefs.edit()
            editor.putInt("lvlcheck", lvlcheck)
            editor.apply()
        }

        setContentView(R.layout.activity_mainf)
        buttonlvl.setOnClickListener(){
            val intent = Intent(this, Level6::class.java)
            startActivity(intent)
            this.finish()
        }
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
        }
    }

    fun Level12() {
        if (editcheck) {
            textView.visibility = View.VISIBLE
            textView.text = check
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