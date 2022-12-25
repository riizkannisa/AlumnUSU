package com.example.alumnusu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent

class activity_login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
    }

    fun home() {
        val i = Intent(applicationContext, HomeFragment::class.java)
        startActivity(i)
    }
}