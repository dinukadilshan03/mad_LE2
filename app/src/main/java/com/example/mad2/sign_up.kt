package com.example.mad2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class sign_up : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)


        val signup = findViewById<Button>(R.id.buttonCreateAccount)
        val login = findViewById<TextView>(R.id.textViewLoginLink)

        login.setOnClickListener {
            val intent = Intent(this@sign_up, com.example.mad2.home::class.java)
            startActivity(intent)
        }

        signup.setOnClickListener {
            val intent = Intent(this@sign_up, com.example.mad2.login::class.java)
            startActivity(intent)
        }
    }
}