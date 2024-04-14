package com.example.glowsync

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity38 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main38)

        val nextButton = findViewById<Button>(R.id.nextbtn)
        val backbttn = findViewById<Button>(R.id.backbtn)

        val btnHome = findViewById<Button>(R.id.btnhome)
        val btnVideo = findViewById<Button>(R.id.btnvideo)
        val btnContent = findViewById<Button>(R.id.btncontent)
        val btnProfile = findViewById<Button>(R.id.btnprofile)

        nextButton.setOnClickListener {
            // Handle Next button click
            val intent = Intent(this, MainActivity39::class.java)
            startActivity(intent)
        }

        backbttn.setOnClickListener {
            // Handle back button click
            val intent = Intent(this, MainActivity37::class.java)
            startActivity(intent)
        }

        // Set click listeners for buttons
        btnHome.setOnClickListener {
            startActivity(Intent(this, MainActivity11::class.java))
        }

        btnVideo.setOnClickListener {
            startActivity(Intent(this, MainActivity13::class.java))
        }

        btnContent.setOnClickListener {
            startActivity(Intent(this, MainActivity12::class.java))
        }

        btnProfile.setOnClickListener {
            startActivity(Intent(this, MainActivity43::class.java))
        }
    }
}