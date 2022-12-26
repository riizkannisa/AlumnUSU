package com.example.alumnusu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // access the items of the list
        val fakultas = resources.getStringArray(R.array.fakultas)
        val programstudi = resources.getStringArray(R.array.programstudi)
        val tahunMasuk = resources.getStringArray(R.array.tahunMasuk)

        // access the spinner
        val spinnerFakultas = findViewById<Spinner>(R.id.spinnerFakultas)
        if (spinnerFakultas != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, fakultas)
            spinnerFakultas.adapter = adapter

            spinnerFakultas.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    Toast.makeText(this@register,
                        getString(R.string.selected_item) + " " +
                                "" + fakultas[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }

        // access the spinner
        val spinnerProdi = findViewById<Spinner>(R.id.spinnerProdi)
        if (spinnerProdi != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, programstudi)
            spinnerProdi.adapter = adapter

            spinnerProdi.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    Toast.makeText(this@register,
                        getString(R.string.selected_item) + " " +
                                "" + programstudi[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }

        // access the spinner
        val spinnerTahun = findViewById<Spinner>(R.id.spinnerTahun)
        if (spinnerTahun != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, tahunMasuk)
            spinnerTahun.adapter = adapter

            spinnerTahun.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    Toast.makeText(this@register,
                        getString(R.string.selected_item) + " " +
                                "" + tahunMasuk[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }

    }

    fun login() {
        val i = Intent(applicationContext, activity_login::class.java)
        startActivity(i)
    }
}