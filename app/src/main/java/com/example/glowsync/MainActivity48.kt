package com.example.glowsync

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity48 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main48)

        val btnHome = findViewById<Button>(R.id.btnhome)
        val btnVideo = findViewById<Button>(R.id.btnvideo)
        val btnContent = findViewById<Button>(R.id.btncontent)
        val btnProfile = findViewById<Button>(R.id.btnprofile)

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
