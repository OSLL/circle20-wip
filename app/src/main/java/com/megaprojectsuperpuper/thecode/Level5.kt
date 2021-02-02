package com.megaprojectsuperpuper.thecode

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_level1.*
import kotlinx.android.synthetic.main.activity_mainf.*
import java.lang.Math.sqrt
import java.util.*
import kotlin.concurrent.schedule


class Level5 : AppCompatActivity() {
    var i = 0
    var editcheck = true
    var text = ""
    var check = "1 2 3 4 "
    var name = "5.Ты тряси-тряси смартфон"

    private var sensorManager: SensorManager? = null
    private var acceleration = 0f
    private var currentAcceleration = 0f
    private var lastAcceleration = 0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_level1)
        textView3.setText(name)
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
            if (acceleration > 30) {
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


    fun kubok(){
        setContentView(R.layout.activity_mainf)
        buttonlvl.setOnClickListener(){
            val intent = Intent(this, Level6::class.java)
            startActivity(intent)
            this.finish()
        }
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
        }
    }

    fun Level12() {
        textView.visibility = View.VISIBLE
        textView.text = check
        button4.setOnClickListener{
            if (editcheck) {
                textView.visibility = View.VISIBLE
                textView.text = check
            }
        }
        button1.setOnClickListener{
            if (editcheck){
                text += "1 "
                textView4.setText(text)
                bool()
            }
        }
        button5.setOnClickListener{
            if (editcheck) {
                text += "2 "
                textView4.setText(text)
                bool()
            }
        }
        button6.setOnClickListener{
            if (editcheck) {
                text += "3 "
                textView4.setText(text)
                bool()
            }
        }
        button7.setOnClickListener{
            if (editcheck) {
                text += "4 "
                textView4.setText(text)
                bool()
            }
        }
        button8.setOnClickListener{
            if (editcheck) {
                text += "5 "
                textView4.setText(text)
                bool()
            }
        }
        button9.setOnClickListener{
            if (editcheck) {
                text += "6 "
                textView4.setText(text)
                bool()
            }
        }
        button10.setOnClickListener{
            if (editcheck) {
                text += "7 "
                textView4.setText(text)
                bool()
            }
        }
        button11.setOnClickListener{
            if (editcheck) {
                text += "8 "
                textView4.setText(text)
                bool()
            }
        }
        button12.setOnClickListener{
            if (editcheck) {
                text += "9 "
                textView4.setText(text)
                bool()
            }
        }
        button13.setOnClickListener{
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