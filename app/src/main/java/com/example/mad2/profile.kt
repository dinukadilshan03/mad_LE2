package com.example.mad2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)



        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        val fav = findViewById<ImageView>(R.id.favArrow)
        val logoutbtn = findViewById<ImageView>(R.id.logout1)
        val settingsbtn = findViewById<ImageView>(R.id.btn1)

        bottomNav.selectedItemId = R.id.profile
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        fav.setOnClickListener {
            val intent = Intent(this@profile, com.example.mad2.saved::class.java)
            startActivity(intent)
        }

        settingsbtn.setOnClickListener {
            val intent = Intent(this@profile, com.example.mad2.settings::class.java)
            startActivity(intent)
        }
        logoutbtn.setOnClickListener {
            val intent = Intent(this@profile, com.example.mad2.login::class.java)
            startActivity(intent)
        }

        // Handle Bottom Navigation Clicks
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    val intent = Intent(
                        this@profile,
                        home::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.ai -> {
                    val intent = Intent(
                        this@profile,
                        AIrecipeGen::class.java)
                    startActivity(intent)
                    true
                }
                R.id.saved -> {
                    val intent = Intent(
                        this@profile,
                        saved::class.java)
                    startActivity(intent)
                    true
                }
                R.id.profile -> {
                    val intent = Intent(
                        this@profile,
                        profile::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
    }
}