package com.megaprojectsuperpuper.thecode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_level1.*
import kotlinx.android.synthetic.main.activity_mainf.*

class Level3 : AppCompatActivity() {
    var i = 0
    var text = ""
    var check = "1 2 3 4 "
    var name = "3. ..--- ----. --... ....."
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level1)
        textView3.setText(name)
        textView2.setText(name)
        Level11()
    }
    fun kubok(){
        setContentView(R.layout.activity_mainf)
        //var b = findViewById<RadioGroup>(R.id.buttonlvl)
        buttonlvl.setOnClickListener(){
            val intent = Intent(this, Level4::class.java)
            startActivity(intent)
        }
    }
    fun Level11(){
        mainbutton.setOnClickListener{
            //val intent = Intent(this, MainActivity2::class.java)
            //startActivity(intent)
            //запуска второй активити в вводом кода
            mainbutton.visibility = View.INVISIBLE
            textView3.visibility = View.INVISIBLE
            textView.visibility = View.VISIBLE
            textView2.visibility = View.VISIBLE
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
            button322.visibility = View.VISIBLE
            Level12()
        }
    }
    fun Level12() {
        var str = ""
        button4.setOnClickListener{
            textView.text = check
        }
        button1.setOnClickListener{
            text += "1 "
            textView4.setText(text)
            bool()
            //a()
        }
        button5.setOnClickListener{
            text += "2 "
            textView4.setText(text)
            bool()
        }
        button6.setOnClickListener{
            text += "3 "
            textView4.setText(text)
            bool()
        }
        button7.setOnClickListener{
            text += "4 "
            textView4.setText(text)
            bool()
        }
        button8.setOnClickListener{
            text += "5 "
            textView4.setText(text)
            bool()
        }
        button9.setOnClickListener{
            text += "6 "
            textView4.setText(text)
            bool()
        }
        button10.setOnClickListener{
            text += "7 "
            textView4.setText(text)
            bool()
        }
        button11.setOnClickListener{
            text += "8 "
            textView4.setText(text)
            bool()
        }
        button12.setOnClickListener{
            text += "9 "
            textView4.setText(text)
            bool()
        }
        button13.setOnClickListener{
            text += "0 "
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
                text = ""
                i = 0
            }
        }
    }
}