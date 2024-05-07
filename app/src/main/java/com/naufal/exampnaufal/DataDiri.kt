package com.naufal.exampnaufal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DataDiri : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_diri)

        val textview = findViewById<TextView>(R.id.nama_ygtd)

        val username = intent.getStringExtra("USERNAME")
        textview.text = "$username"
    }
}