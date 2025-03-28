package com.example.mad2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class login : AppCompatActivity() {
    private lateinit var login: Button
    private lateinit var signup: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)


        login = findViewById(R.id.btnLogin)
        signup = findViewById(R.id.textViewLoginLink3)

        login.setOnClickListener {
            val intent = Intent(this@login, com.example.mad2.home::class.java)
            startActivity(intent)
        }

        signup.setOnClickListener {
            val intent = Intent(this@login, com.example.mad2.sign_up::class.java)
            startActivity(intent)
        }

    }
}