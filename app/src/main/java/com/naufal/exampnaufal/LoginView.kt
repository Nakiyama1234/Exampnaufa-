package com.naufal.exampnaufal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_view)

        val editText = findViewById<EditText>(R.id.username)
        val ButtonLogin = findViewById<Button>(R.id.buttonlogin)

        ButtonLogin.setOnClickListener {
            val username = editText.text.toString().trim()
            if (username.isNotEmpty()) {
                val intent = Intent(this, DataDiri::class.java)
                intent.putExtra("USERNAME", username)
                startActivity(intent)
            } else Toast.makeText(this, "Please Enter Your Name", Toast.LENGTH_SHORT).show()
        }
    }
}