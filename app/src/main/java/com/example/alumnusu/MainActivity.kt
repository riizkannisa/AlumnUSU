package com.example.alumnusu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import com.project.core.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun login(view : View) {
        val i = Intent(applicationContext, LoginActivity::class.java)
        startActivity(i)
    }

    fun register(view : View) {
        val i = Intent(applicationContext, RegisterActivity::class.java)
        startActivity(i)
    }

}