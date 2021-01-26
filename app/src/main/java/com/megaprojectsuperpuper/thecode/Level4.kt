package com.megaprojectsuperpuper.thecode

import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_level1.*

class Level4 : AppCompatActivity() {
    var a : Float = 0.0f
    var i = 0
    var text = ""
    var check = "1 2 3 4 "
    var name = "4. Прислушайся"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level1)
        textView3.setText(name)
        mainbutton.setOnClickListener {
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
    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
//setContentView(R.layout.activity_main)
        textView.text = check
        if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN) {
            a+=0.1f
            textView.alpha = a
        }
        button1.setOnClickListener{
            text += "1 "
            textView4.setText(text)
            bool()
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
        return true
    }
    fun bool(): Unit{
        i++
        if (i == 4){
            if(text.equals(check)){
                this.finish()
            }
            else{
                text = ""
                i = 0
            }
        }
    }
}