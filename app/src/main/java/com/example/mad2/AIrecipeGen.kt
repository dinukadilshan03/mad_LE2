package com.example.mad2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class AIrecipeGen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_airecipe_gen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNav.selectedItemId = R.id.ai

        // Handle Bottom Navigation Clicks
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    val intent = Intent(
                        this@AIrecipeGen,
                        home::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.ai -> {
                    val intent = Intent(
                        this@AIrecipeGen,
                        AIrecipeGen::class.java)
                    startActivity(intent)
                    true
                }
                R.id.saved -> {
                    val intent = Intent(
                        this@AIrecipeGen,
                        saved::class.java)
                    startActivity(intent)
                    true
                }
                R.id.profile -> {
                    val intent = Intent(
                        this@AIrecipeGen,
                        profile::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
    }
}