package com.example.mad2

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet.Constraint
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.home)


        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        val recipe = findViewById<TextView>(R.id.recipe_title)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        bottomNav.selectedItemId = R.id.home

        recipe.setOnClickListener {
            val intent = Intent(this@home, com.example.mad2.recipe_info::class.java)
            startActivity(intent)
        }


        // Handle Bottom Navigation Clicks
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    val intent = Intent(
                        this@home,
                        home::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.ai -> {
                    val intent = Intent(
                        this@home,
                        AIrecipeGen::class.java)
                    startActivity(intent)
                    true
                }
                R.id.saved -> {
                    val intent = Intent(
                        this@home,
                        saved::class.java)
                    startActivity(intent)
                    true
                }
                R.id.profile -> {
                    val intent = Intent(
                        this@home,
                        profile::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }


    }
}