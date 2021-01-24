package com.megaprojectsuperpuper.thecode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_level22.*
import kotlinx.android.synthetic.main.activity_level22.button1
import kotlinx.android.synthetic.main.activity_level22.button10
import kotlinx.android.synthetic.main.activity_level22.button11
import kotlinx.android.synthetic.main.activity_level22.button12
import kotlinx.android.synthetic.main.activity_level22.button13
import kotlinx.android.synthetic.main.activity_level22.button4
import kotlinx.android.synthetic.main.activity_level22.button5
import kotlinx.android.synthetic.main.activity_level22.button6
import kotlinx.android.synthetic.main.activity_level22.button7
import kotlinx.android.synthetic.main.activity_level22.button8
import kotlinx.android.synthetic.main.activity_level22.button9
import kotlinx.android.synthetic.main.activity_level22.textView
import kotlinx.android.synthetic.main.activity_level22.textView4
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
//import kotlinx.android.synthetic.main.activity_main2.button1
//import kotlinx.android.synthetic.main.activity_main2.button10
//import kotlinx.android.synthetic.main.activity_main2.button11
//import kotlinx.android.synthetic.main.activity_main2.button12
//import kotlinx.android.synthetic.main.activity_main2.button13
//import kotlinx.android.synthetic.main.activity_main2.button5
//import kotlinx.android.synthetic.main.activity_main2.button6
//import kotlinx.android.synthetic.main.activity_main2.button7
//import kotlinx.android.synthetic.main.activity_main2.button8
//import kotlinx.android.synthetic.main.activity_main2.button9
//import kotlinx.android.synthetic.main.activity_main2.textView
//import kotlinx.android.synthetic.main.activity_main2.textView4

class Level22 : AppCompatActivity() {
    var i = 0
    var text = ""
    var check = "1 2 3 4 "
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level22)
        button14.setOnClickListener{
            textView.text = check
        }
        button1.setOnClickListener{
            text += "4 "
            textView4.setText(text)
            bool()

        }
        button4.setOnClickListener{
            textView.text = check
        }
        button5.setOnClickListener{
            text += "5 "
            textView4.setText(text)
            bool()
        }
        button6.setOnClickListener{
            text += "2 "
            textView4.setText(text)
            bool()
        }
        button7.setOnClickListener{
            text += "7 "
            textView4.setText(text)
            bool()
        }
        button8.setOnClickListener{
            text += "8 "
            textView4.setText(text)
            bool()
        }
        button9.setOnClickListener{
            text += "1 "
            textView4.setText(text)
            bool()
        }
        button10.setOnClickListener{
            text += "9 "
            textView4.setText(text)
            bool()
        }
        button11.setOnClickListener{
            text += "6 "
            textView4.setText(text)
            bool()
        }
        button12.setOnClickListener{
            text += "0 "
            textView4.setText(text)
            bool()
        }
        button13.setOnClickListener{
            text += "3 "
            textView4.setText(text)
            bool()
        }

    }
    fun bool(): Unit{
        i++
        if (i == 4){
            if(text.equals(check)){
                val intent = Intent(this, MainActivityf::class.java)
                startActivity(intent)
            }
            else{
                text = ""
                i = 0
            }
        }
    }
}