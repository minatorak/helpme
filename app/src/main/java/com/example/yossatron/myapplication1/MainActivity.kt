package com.example.yossatron.myapplication1


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }
    fun init(){
        supportFragmentManager.beginTransaction()
                .replace(R.id.contrainer, BlankFragment.newinstance())
                .commit()
    }
    fun changeFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
                .replace(R.id.contrainer, fragment)
                .addToBackStack(null)
                .commit()
    }
}
