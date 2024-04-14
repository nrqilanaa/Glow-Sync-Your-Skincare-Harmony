package com.example.glowsync

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        val nextButton = findViewById<Button>(R.id.nextbtn)
        val backButton = findViewById<Button>(R.id.backbtn)

        nextButton.setOnClickListener {
            // Handle Next button click
            val intent = Intent(this, MainActivity8::class.java)
            startActivity(intent)
        }

        backButton.setOnClickListener {
            // Handle Back button click
            finish() // Close MainActivity7 and return to the previous activity
        }
    }
}