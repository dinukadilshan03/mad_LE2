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
import com.google.android.material.bottomnavigation.BottomNavigationView

class recipe_info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.recipe_info)



        val back = findViewById<ImageView>(R.id.back_button1)

        back.setOnClickListener {
            val intent = Intent(this@recipe_info, com.example.mad2.home::class.java)
            startActivity(intent)
        }
    }
}