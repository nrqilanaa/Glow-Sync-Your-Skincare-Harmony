package com.example.glowsync

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity36 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main36)

        val btnHome = findViewById<Button>(R.id.btnhome)
        val btnVideo = findViewById<Button>(R.id.btnvideo)
        val btnContent = findViewById<Button>(R.id.btncontent)
        val btnProfile = findViewById<Button>(R.id.btnprofile)

        // CardView 1 click listener
        val cardView1 = findViewById<CardView>(R.id.cardView1)
        cardView1?.setOnClickListener {
            val intent = Intent(this, MainActivity37::class.java)
            startActivity(intent)
        }

        // CardView 2 click listener
        val cardView2 = findViewById<CardView>(R.id.cardView2)
        cardView2?.setOnClickListener {
            val intent = Intent(this, MainActivity30::class.java)
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
