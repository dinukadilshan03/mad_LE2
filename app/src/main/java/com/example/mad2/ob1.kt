package com.example.mad2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ob1 : AppCompatActivity() {

    private lateinit var nextButton: Button
    private lateinit var skipButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ob1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        nextButton = findViewById(R.id.nextButton)
        skipButton = findViewById(R.id.skipButton)

        nextButton.setOnClickListener {
            val intent = Intent(this@ob1, ob2::class.java)
            startActivity(intent)
        }

        skipButton.setOnClickListener {
            val intent = Intent(this@ob1, home::class.java)
            startActivity(intent)

        }
    }


}