package com.megaprojectsuperpuper.thecode

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_menu.*

class menu : BackMusicActivity() {
    private lateinit var prefs: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        prefs = getSharedPreferences("settings", Context.MODE_PRIVATE)
        var lvlcheck = prefs.getInt("lvlcheck", 1)
        if(lvlcheck == 2){
            block2.visibility = View.INVISIBLE
            lvl2.visibility = View.VISIBLE
        }
        if(lvlcheck == 3){
            block2.visibility = View.INVISIBLE
            lvl2.visibility = View.VISIBLE
            block3.visibility = View.INVISIBLE
            lvl3.visibility = View.VISIBLE
        }
        if(lvlcheck == 4){
            block2.visibility = View.INVISIBLE
            lvl2.visibility = View.VISIBLE
            block3.visibility = View.INVISIBLE
            lvl3.visibility = View.VISIBLE
            block4.visibility = View.INVISIBLE
            lvl4.visibility = View.VISIBLE
        }
        if(lvlcheck == 5){
            block2.visibility = View.INVISIBLE
            lvl2.visibility = View.VISIBLE
            block3.visibility = View.INVISIBLE
            lvl3.visibility = View.VISIBLE
            block4.visibility = View.INVISIBLE
            lvl4.visibility = View.VISIBLE
            block5.visibility = View.INVISIBLE
            lvl5.visibility = View.VISIBLE
        }
        if(lvlcheck == 6){
            block2.visibility = View.INVISIBLE
            lvl2.visibility = View.VISIBLE
            block3.visibility = View.INVISIBLE
            lvl3.visibility = View.VISIBLE
            block4.visibility = View.INVISIBLE
            lvl4.visibility = View.VISIBLE
            block5.visibility = View.INVISIBLE
            lvl5.visibility = View.VISIBLE
            block6.visibility = View.INVISIBLE
            lvl6.visibility = View.VISIBLE
        }
        if(lvlcheck == 7){
            block2.visibility = View.INVISIBLE
            lvl2.visibility = View.VISIBLE
            block3.visibility = View.INVISIBLE
            lvl3.visibility = View.VISIBLE
            block4.visibility = View.INVISIBLE
            lvl4.visibility = View.VISIBLE
            block5.visibility = View.INVISIBLE
            lvl5.visibility = View.VISIBLE
            block6.visibility = View.INVISIBLE
            lvl6.visibility = View.VISIBLE
            block7.visibility = View.INVISIBLE
            lvl7.visibility = View.VISIBLE
        }
        if(lvlcheck == 8){
            block2.visibility = View.INVISIBLE
            lvl2.visibility = View.VISIBLE
            block3.visibility = View.INVISIBLE
            lvl3.visibility = View.VISIBLE
            block4.visibility = View.INVISIBLE
            lvl4.visibility = View.VISIBLE
            block5.visibility = View.INVISIBLE
            lvl5.visibility = View.VISIBLE
            block6.visibility = View.INVISIBLE
            lvl6.visibility = View.VISIBLE
            block7.visibility = View.INVISIBLE
            lvl7.visibility = View.VISIBLE
            block8.visibility = View.INVISIBLE
            lvl8.visibility = View.VISIBLE
        }
        if(lvlcheck == 9){
            block2.visibility = View.INVISIBLE
            lvl2.visibility = View.VISIBLE
            block3.visibility = View.INVISIBLE
            lvl3.visibility = View.VISIBLE
            block4.visibility = View.INVISIBLE
            lvl4.visibility = View.VISIBLE
            block5.visibility = View.INVISIBLE
            lvl5.visibility = View.VISIBLE
            block6.visibility = View.INVISIBLE
            lvl6.visibility = View.VISIBLE
            block7.visibility = View.INVISIBLE
            lvl7.visibility = View.VISIBLE
            block8.visibility = View.INVISIBLE
            lvl8.visibility = View.VISIBLE
            block9.visibility = View.INVISIBLE
            lvl9.visibility = View.VISIBLE
        }
        if(lvlcheck == 10){
            block2.visibility = View.INVISIBLE
            lvl2.visibility = View.VISIBLE
            block3.visibility = View.INVISIBLE
            lvl3.visibility = View.VISIBLE
            block4.visibility = View.INVISIBLE
            lvl4.visibility = View.VISIBLE
            block5.visibility = View.INVISIBLE
            lvl5.visibility = View.VISIBLE
            block6.visibility = View.INVISIBLE
            lvl6.visibility = View.VISIBLE
            block7.visibility = View.INVISIBLE
            lvl7.visibility = View.VISIBLE
            block8.visibility = View.INVISIBLE
            lvl8.visibility = View.VISIBLE
            block9.visibility = View.INVISIBLE
            lvl9.visibility = View.VISIBLE
            block10.visibility = View.INVISIBLE
            lvl10.visibility = View.VISIBLE
        }
        if(lvlcheck == 11){
            block2.visibility = View.INVISIBLE
            lvl2.visibility = View.VISIBLE
            block3.visibility = View.INVISIBLE
            lvl3.visibility = View.VISIBLE
            block4.visibility = View.INVISIBLE
            lvl4.visibility = View.VISIBLE
            block5.visibility = View.INVISIBLE
            lvl5.visibility = View.VISIBLE
            block6.visibility = View.INVISIBLE
            lvl6.visibility = View.VISIBLE
            block7.visibility = View.INVISIBLE
            lvl7.visibility = View.VISIBLE
            block8.visibility = View.INVISIBLE
            lvl8.visibility = View.VISIBLE
            block9.visibility = View.INVISIBLE
            lvl9.visibility = View.VISIBLE
            block10.visibility = View.INVISIBLE
            lvl10.visibility = View.VISIBLE
            block11.visibility = View.INVISIBLE
            lvl11.visibility = View.VISIBLE
        }
        if(lvlcheck == 12){
            block2.visibility = View.INVISIBLE
            lvl2.visibility = View.VISIBLE
            block3.visibility = View.INVISIBLE
            lvl3.visibility = View.VISIBLE
            block4.visibility = View.INVISIBLE
            lvl4.visibility = View.VISIBLE
            block5.visibility = View.INVISIBLE
            lvl5.visibility = View.VISIBLE
            block6.visibility = View.INVISIBLE
            lvl6.visibility = View.VISIBLE
            block7.visibility = View.INVISIBLE
            lvl7.visibility = View.VISIBLE
            block8.visibility = View.INVISIBLE
            lvl8.visibility = View.VISIBLE
            block9.visibility = View.INVISIBLE
            lvl9.visibility = View.VISIBLE
            block10.visibility = View.INVISIBLE
            lvl10.visibility = View.VISIBLE
            block11.visibility = View.INVISIBLE
            lvl11.visibility = View.VISIBLE
            block12.visibility = View.INVISIBLE
            lvl12.visibility = View.VISIBLE
        }
        if(lvlcheck == 13){
            block2.visibility = View.INVISIBLE
            lvl2.visibility = View.VISIBLE
            block3.visibility = View.INVISIBLE
            lvl3.visibility = View.VISIBLE
            block4.visibility = View.INVISIBLE
            lvl4.visibility = View.VISIBLE
            block5.visibility = View.INVISIBLE
            lvl5.visibility = View.VISIBLE
            block6.visibility = View.INVISIBLE
            lvl6.visibility = View.VISIBLE
            block7.visibility = View.INVISIBLE
            lvl7.visibility = View.VISIBLE
            block8.visibility = View.INVISIBLE
            lvl8.visibility = View.VISIBLE
            block9.visibility = View.INVISIBLE
            lvl9.visibility = View.VISIBLE
            block10.visibility = View.INVISIBLE
            lvl10.visibility = View.VISIBLE
            block11.visibility = View.INVISIBLE
            lvl11.visibility = View.VISIBLE
            block12.visibility = View.INVISIBLE
            lvl12.visibility = View.VISIBLE
            block13.visibility = View.INVISIBLE
            lvl13.visibility = View.VISIBLE

        }
        if(lvlcheck == 14){
            block2.visibility = View.INVISIBLE
            lvl2.visibility = View.VISIBLE
            block3.visibility = View.INVISIBLE
            lvl3.visibility = View.VISIBLE
            block4.visibility = View.INVISIBLE
            lvl4.visibility = View.VISIBLE
            block5.visibility = View.INVISIBLE
            lvl5.visibility = View.VISIBLE
            block6.visibility = View.INVISIBLE
            lvl6.visibility = View.VISIBLE
            block7.visibility = View.INVISIBLE
            lvl7.visibility = View.VISIBLE
            block8.visibility = View.INVISIBLE
            lvl8.visibility = View.VISIBLE
            block9.visibility = View.INVISIBLE
            lvl9.visibility = View.VISIBLE
            block10.visibility = View.INVISIBLE
            lvl10.visibility = View.VISIBLE
            block11.visibility = View.INVISIBLE
            lvl11.visibility = View.VISIBLE
            block12.visibility = View.INVISIBLE
            lvl12.visibility = View.VISIBLE
            block13.visibility = View.INVISIBLE
            lvl13.visibility = View.VISIBLE
            block14.visibility = View.INVISIBLE
            lvl14.visibility = View.VISIBLE

        }
        if(lvlcheck == 15){
            block2.visibility = View.INVISIBLE
            lvl2.visibility = View.VISIBLE
            block3.visibility = View.INVISIBLE
            lvl3.visibility = View.VISIBLE
            block4.visibility = View.INVISIBLE
            lvl4.visibility = View.VISIBLE
            block5.visibility = View.INVISIBLE
            lvl5.visibility = View.VISIBLE
            block6.visibility = View.INVISIBLE
            lvl6.visibility = View.VISIBLE
            block7.visibility = View.INVISIBLE
            lvl7.visibility = View.VISIBLE
            block8.visibility = View.INVISIBLE
            lvl8.visibility = View.VISIBLE
            block9.visibility = View.INVISIBLE
            lvl9.visibility = View.VISIBLE
            block10.visibility = View.INVISIBLE
            lvl10.visibility = View.VISIBLE
            block11.visibility = View.INVISIBLE
            lvl11.visibility = View.VISIBLE
            block12.visibility = View.INVISIBLE
            lvl12.visibility = View.VISIBLE
            block13.visibility = View.INVISIBLE
            lvl13.visibility = View.VISIBLE
            block14.visibility = View.INVISIBLE
            lvl14.visibility = View.VISIBLE
            block15.visibility = View.INVISIBLE
            lvl15.visibility = View.VISIBLE

        }
        if(lvlcheck == 16){
            block2.visibility = View.INVISIBLE
            lvl2.visibility = View.VISIBLE
            block3.visibility = View.INVISIBLE
            lvl3.visibility = View.VISIBLE
            block4.visibility = View.INVISIBLE
            lvl4.visibility = View.VISIBLE
            block5.visibility = View.INVISIBLE
            lvl5.visibility = View.VISIBLE
            block6.visibility = View.INVISIBLE
            lvl6.visibility = View.VISIBLE
            block7.visibility = View.INVISIBLE
            lvl7.visibility = View.VISIBLE
            block8.visibility = View.INVISIBLE
            lvl8.visibility = View.VISIBLE
            block9.visibility = View.INVISIBLE
            lvl9.visibility = View.VISIBLE
            block10.visibility = View.INVISIBLE
            lvl10.visibility = View.VISIBLE
            block11.visibility = View.INVISIBLE
            lvl11.visibility = View.VISIBLE
            block12.visibility = View.INVISIBLE
            lvl12.visibility = View.VISIBLE
            block13.visibility = View.INVISIBLE
            lvl13.visibility = View.VISIBLE
            block14.visibility = View.INVISIBLE
            lvl14.visibility = View.VISIBLE
            block15.visibility = View.INVISIBLE
            lvl15.visibility = View.VISIBLE
            block16.visibility = View.INVISIBLE
            lvl16.visibility = View.VISIBLE

        }
        if(lvlcheck == 17){
            block2.visibility = View.INVISIBLE
            lvl2.visibility = View.VISIBLE
            block3.visibility = View.INVISIBLE
            lvl3.visibility = View.VISIBLE
            block4.visibility = View.INVISIBLE
            lvl4.visibility = View.VISIBLE
            block5.visibility = View.INVISIBLE
            lvl5.visibility = View.VISIBLE
            block6.visibility = View.INVISIBLE
            lvl6.visibility = View.VISIBLE
            block7.visibility = View.INVISIBLE
            lvl7.visibility = View.VISIBLE
            block8.visibility = View.INVISIBLE
            lvl8.visibility = View.VISIBLE
            block9.visibility = View.INVISIBLE
            lvl9.visibility = View.VISIBLE
            block10.visibility = View.INVISIBLE
            lvl10.visibility = View.VISIBLE
            block11.visibility = View.INVISIBLE
            lvl11.visibility = View.VISIBLE
            block12.visibility = View.INVISIBLE
            lvl12.visibility = View.VISIBLE
            block13.visibility = View.INVISIBLE
            lvl13.visibility = View.VISIBLE
            block14.visibility = View.INVISIBLE
            lvl14.visibility = View.VISIBLE
            block15.visibility = View.INVISIBLE
            lvl15.visibility = View.VISIBLE
            block16.visibility = View.INVISIBLE
            lvl16.visibility = View.VISIBLE
            block17.visibility = View.INVISIBLE
            lvl17.visibility = View.VISIBLE

        }
        if(lvlcheck == 18){
            block2.visibility = View.INVISIBLE
            lvl2.visibility = View.VISIBLE
            block3.visibility = View.INVISIBLE
            lvl3.visibility = View.VISIBLE
            block4.visibility = View.INVISIBLE
            lvl4.visibility = View.VISIBLE
            block5.visibility = View.INVISIBLE
            lvl5.visibility = View.VISIBLE
            block6.visibility = View.INVISIBLE
            lvl6.visibility = View.VISIBLE
            block7.visibility = View.INVISIBLE
            lvl7.visibility = View.VISIBLE
            block8.visibility = View.INVISIBLE
            lvl8.visibility = View.VISIBLE
            block9.visibility = View.INVISIBLE
            lvl9.visibility = View.VISIBLE
            block10.visibility = View.INVISIBLE
            lvl10.visibility = View.VISIBLE
            block11.visibility = View.INVISIBLE
            lvl11.visibility = View.VISIBLE
            block12.visibility = View.INVISIBLE
            lvl12.visibility = View.VISIBLE
            block13.visibility = View.INVISIBLE
            lvl13.visibility = View.VISIBLE
            block14.visibility = View.INVISIBLE
            lvl14.visibility = View.VISIBLE
            block15.visibility = View.INVISIBLE
            lvl15.visibility = View.VISIBLE
            block16.visibility = View.INVISIBLE
            lvl16.visibility = View.VISIBLE
            block17.visibility = View.INVISIBLE
            lvl17.visibility = View.VISIBLE
            block18.visibility = View.INVISIBLE
            lvl18.visibility = View.VISIBLE

        }
        if(lvlcheck == 19){
            block2.visibility = View.INVISIBLE
            lvl2.visibility = View.VISIBLE
            block3.visibility = View.INVISIBLE
            lvl3.visibility = View.VISIBLE
            block4.visibility = View.INVISIBLE
            lvl4.visibility = View.VISIBLE
            block5.visibility = View.INVISIBLE
            lvl5.visibility = View.VISIBLE
            block6.visibility = View.INVISIBLE
            lvl6.visibility = View.VISIBLE
            block7.visibility = View.INVISIBLE
            lvl7.visibility = View.VISIBLE
            block8.visibility = View.INVISIBLE
            lvl8.visibility = View.VISIBLE
            block9.visibility = View.INVISIBLE
            lvl9.visibility = View.VISIBLE
            block10.visibility = View.INVISIBLE
            lvl10.visibility = View.VISIBLE
            block11.visibility = View.INVISIBLE
            lvl11.visibility = View.VISIBLE
            block12.visibility = View.INVISIBLE
            lvl12.visibility = View.VISIBLE
            block13.visibility = View.INVISIBLE
            lvl13.visibility = View.VISIBLE
            block14.visibility = View.INVISIBLE
            lvl14.visibility = View.VISIBLE
            block15.visibility = View.INVISIBLE
            lvl15.visibility = View.VISIBLE
            block16.visibility = View.INVISIBLE
            lvl16.visibility = View.VISIBLE
            block17.visibility = View.INVISIBLE
            lvl17.visibility = View.VISIBLE
            block18.visibility = View.INVISIBLE
            lvl18.visibility = View.VISIBLE
            block19.visibility = View.INVISIBLE
            lvl19.visibility = View.VISIBLE

        }
        if(lvlcheck == 20){
            block2.visibility = View.INVISIBLE
            lvl2.visibility = View.VISIBLE
            block3.visibility = View.INVISIBLE
            lvl3.visibility = View.VISIBLE
            block4.visibility = View.INVISIBLE
            lvl4.visibility = View.VISIBLE
            block5.visibility = View.INVISIBLE
            lvl5.visibility = View.VISIBLE
            block6.visibility = View.INVISIBLE
            lvl6.visibility = View.VISIBLE
            block7.visibility = View.INVISIBLE
            lvl7.visibility = View.VISIBLE
            block8.visibility = View.INVISIBLE
            lvl8.visibility = View.VISIBLE
            block9.visibility = View.INVISIBLE
            lvl9.visibility = View.VISIBLE
            block10.visibility = View.INVISIBLE
            lvl10.visibility = View.VISIBLE
            block11.visibility = View.INVISIBLE
            lvl11.visibility = View.VISIBLE
            block12.visibility = View.INVISIBLE
            lvl12.visibility = View.VISIBLE
            block13.visibility = View.INVISIBLE
            lvl13.visibility = View.VISIBLE
            block14.visibility = View.INVISIBLE
            lvl14.visibility = View.VISIBLE
            block15.visibility = View.INVISIBLE
            lvl15.visibility = View.VISIBLE
            block16.visibility = View.INVISIBLE
            lvl16.visibility = View.VISIBLE
            block17.visibility = View.INVISIBLE
            lvl17.visibility = View.VISIBLE
            block18.visibility = View.INVISIBLE
            lvl18.visibility = View.VISIBLE
            block19.visibility = View.INVISIBLE
            lvl19.visibility = View.VISIBLE
            block20.visibility = View.INVISIBLE
            lvl20.visibility = View.VISIBLE

        }
        if(lvlcheck == 21){
            block2.visibility = View.INVISIBLE
            lvl2.visibility = View.VISIBLE
            block3.visibility = View.INVISIBLE
            lvl3.visibility = View.VISIBLE
            block4.visibility = View.INVISIBLE
            lvl4.visibility = View.VISIBLE
            block5.visibility = View.INVISIBLE
            lvl5.visibility = View.VISIBLE
            block6.visibility = View.INVISIBLE
            lvl6.visibility = View.VISIBLE
            block7.visibility = View.INVISIBLE
            lvl7.visibility = View.VISIBLE
            block8.visibility = View.INVISIBLE
            lvl8.visibility = View.VISIBLE
            block9.visibility = View.INVISIBLE
            lvl9.visibility = View.VISIBLE
            block10.visibility = View.INVISIBLE
            lvl10.visibility = View.VISIBLE
            block11.visibility = View.INVISIBLE
            lvl11.visibility = View.VISIBLE
            block12.visibility = View.INVISIBLE
            lvl12.visibility = View.VISIBLE
            block13.visibility = View.INVISIBLE
            lvl13.visibility = View.VISIBLE
            block14.visibility = View.INVISIBLE
            lvl14.visibility = View.VISIBLE
            block15.visibility = View.INVISIBLE
            lvl15.visibility = View.VISIBLE
            block16.visibility = View.INVISIBLE
            lvl16.visibility = View.VISIBLE
            block17.visibility = View.INVISIBLE
            lvl17.visibility = View.VISIBLE
            block18.visibility = View.INVISIBLE
            lvl18.visibility = View.VISIBLE
            block19.visibility = View.INVISIBLE
            lvl19.visibility = View.VISIBLE
            block20.visibility = View.INVISIBLE
            lvl20.visibility = View.VISIBLE

        }








        lvl1.setOnClickListener(){
            val intent = Intent(this, Level1::class.java)
            startActivity(intent)
            this.finish()
        }
        lvl2.setOnClickListener(){
            val intent = Intent(this, Level2::class.java)
            startActivity(intent)
            this.finish()
        }
        lvl3.setOnClickListener(){
            val intent = Intent(this, Level3::class.java)
            startActivity(intent)
            this.finish()
        }
        lvl4.setOnClickListener(){
            val intent = Intent(this, Level4::class.java)
            startActivity(intent)
            this.finish()
        }
        lvl5.setOnClickListener(){
            val intent = Intent(this, Level5::class.java)
            startActivity(intent)
            this.finish()
        }
        lvl6.setOnClickListener(){
            val intent = Intent(this, Level6::class.java)
            startActivity(intent)
            this.finish()
        }
        lvl7.setOnClickListener(){
            val intent = Intent(this, Level7::class.java)
            startActivity(intent)
            this.finish()
        }

        lvl8.setOnClickListener(){
            val intent = Intent(this, Level8::class.java)
            startActivity(intent)
            this.finish()
        }
        lvl9.setOnClickListener(){
            val intent = Intent(this, Level9::class.java)
            startActivity(intent)
            this.finish()
        }
        lvl10.setOnClickListener(){
            val intent = Intent(this, Level10::class.java)
            startActivity(intent)
            this.finish()
        }
        lvl11.setOnClickListener(){
            val intent = Intent(this, Level11::class.java)
            startActivity(intent)
            this.finish()
        }
        lvl12.setOnClickListener(){
            val intent = Intent(this, Level12::class.java)
            startActivity(intent)
            this.finish()
        }
        lvl13.setOnClickListener(){
            val intent = Intent(this, Level13::class.java)
            startActivity(intent)
            this.finish()
        }
        lvl14.setOnClickListener(){
            val intent = Intent(this, Level14::class.java)
            startActivity(intent)
            this.finish()
        }
        lvl15.setOnClickListener(){
            val intent = Intent(this, Level15::class.java)
            startActivity(intent)
            this.finish()
        }
        lvl16.setOnClickListener(){
            val intent = Intent(this, Level16::class.java)
            startActivity(intent)
            this.finish()
        }
        lvl17.setOnClickListener(){
            val intent = Intent(this, Level17::class.java)
            startActivity(intent)
            this.finish()
        }
        lvl18.setOnClickListener(){
            val intent = Intent(this, Level18::class.java)
            startActivity(intent)
            this.finish()
        }
        lvl19.setOnClickListener(){
            val intent = Intent(this, Level19::class.java)
            startActivity(intent)
            this.finish()
        }
        lvl20.setOnClickListener(){
            val intent = Intent(this, Level20::class.java)
            startActivity(intent)
            this.finish()
        }


    }
}