package com.example.alumnusu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun login() {
        val i = Intent(applicationContext, activity_login::class.java)
        startActivity(i)
    }

    fun register() {
        val i = Intent(applicationContext, register::class.java)
        startActivity(i)
    }

}