package com.example.mad2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_settings)

        val back1 = findViewById<ImageView>(R.id.back11)
        val profile = findViewById<ImageView>(R.id.pr1)



        back1.setOnClickListener {
            val intent = Intent(this@settings, com.example.mad2.profile::class.java)
            startActivity(intent)
        }

        profile.setOnClickListener {
            val intent = Intent(this@settings, com.example.mad2.profile::class.java)
            startActivity(intent)
        }

    }
}