package com.megaprojectsuperpuper.thecode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class Level21 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level21)
        mainbutton.setOnClickListener{
            val intent = Intent(this, Level22::class.java)
            startActivity(intent)
            //запуска второй активити в вводом кода
        }
    }
}