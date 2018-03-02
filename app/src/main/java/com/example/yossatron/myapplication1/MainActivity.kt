package com.example.yossatron.myapplication1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var btn1:Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1 = findViewById(R.id.button)
        btn1.setOnClickListener {
            var xxx = Intent(this,Main2Activity::class.java)
            startActivity(xxx)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
    }
}
