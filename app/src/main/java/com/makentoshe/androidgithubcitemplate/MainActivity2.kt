package com.megaprojectsuperpuper.thecode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    var i = 0
    var text = ""
    var check = "1 2 3 4 "
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
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
        textView2.text = text
        if (i == 4){
            if(text.equals(check)){
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
            }
            else{
                text = ""
                i = 0
            }
        }
    }
}