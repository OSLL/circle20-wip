package com.megaprojectsuperpuper.thecode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main2.*
//import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.activity_mainf.*

class MainActivityf : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainf)
        //var b = findViewById<RadioGroup>(R.id.buttonlvl)
        buttonlvl.setOnClickListener(){
            val intent = Intent(this, Level21::class.java)
            startActivity(intent)
        }
    }
}