package com.example.glowsync

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main12)

        val btnHome = findViewById<Button>(R.id.btnhome)
        val btnVideo = findViewById<Button>(R.id.btnvideo)
        val btnContent = findViewById<Button>(R.id.btncontent)
        val btnProfile = findViewById<Button>(R.id.btnprofile)

        // CardView 1 click listener
        val cardView1 = findViewById<CardView>(R.id.cardView1)
        cardView1.setOnClickListener {

            val intent = Intent(this, MainActivity14::class.java)
            startActivity(intent)
        }

        // CardView 2 click listener
        val cardView2 = findViewById<CardView>(R.id.cardView2)
        cardView2.setOnClickListener {

            val intent = Intent(this, MainActivity21::class.java)
            startActivity(intent)
        }

        // CardView 3 click listener
        val cardView3 = findViewById<CardView>(R.id.cardView3)
        cardView3.setOnClickListener {

            val intent = Intent(this, MainActivity25::class.java)
            startActivity(intent)
        }

        // CardView 4 click listener
        val cardView4 = findViewById<CardView>(R.id.cardView4)
        cardView4.setOnClickListener {

            val intent = Intent(this, MainActivity28::class.java)
            startActivity(intent)
        }

        // CardView 5 click listener
        val cardView5 = findViewById<CardView>(R.id.cardView5)
        cardView5.setOnClickListener {

            val intent = Intent(this, MainActivity32::class.java)
            startActivity(intent)
        }

        // CardView 6 click listener
        val cardView6 = findViewById<CardView>(R.id.cardView6)
        cardView6.setOnClickListener {

            val intent = Intent(this, MainActivity36::class.java)
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
