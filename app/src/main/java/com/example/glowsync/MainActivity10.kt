package com.example.glowsync

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)

        val btnHome = findViewById<Button>(R.id.btnhome)
        val btnVideo = findViewById<Button>(R.id.btnvideo)
        val btnContent = findViewById<Button>(R.id.btncontent)
        val btnProfile = findViewById<Button>(R.id.btnprofile)

        // Cleanser
        val cardView15 = findViewById<CardView>(R.id.cardView15)
        cardView15.setOnClickListener {

            val intent = Intent(this, MainActivity14::class.java)
            startActivity(intent)
        }

        val cardView6 = findViewById<CardView>(R.id.cardView6)
        cardView6.setOnClickListener {

            val intent = Intent(this, MainActivity21::class.java)
            startActivity(intent)
        }


        // Serum
        val cardView13 = findViewById<CardView>(R.id.cardView13)
        cardView13.setOnClickListener {

            val intent = Intent(this, MainActivity32::class.java)
            startActivity(intent)
        }


        val cardView12 = findViewById<CardView>(R.id.cardView12)
        cardView12.setOnClickListener {

            val intent = Intent(this, MainActivity36::class.java)
            startActivity(intent)
        }


        //moisturizer
        val cardView35 = findViewById<CardView>(R.id.cardView35)
        cardView35.setOnClickListener {

            val intent = Intent(this, MainActivity25::class.java)
            startActivity(intent)
        }

        val cardView32 = findViewById<CardView>(R.id.cardView32)
        cardView32.setOnClickListener {

            val intent = Intent(this, MainActivity28::class.java)
            startActivity(intent)
        }

        //Toner

        val cardView48 = findViewById<CardView>(R.id.cardView48)
        cardView48.setOnClickListener {

            val intent = Intent(this, MainActivity25::class.java)
            startActivity(intent)
        }

        val cardView45 = findViewById<CardView>(R.id.cardView45)
        cardView45.setOnClickListener {

            val intent = Intent(this, MainActivity28::class.java)
            startActivity(intent)
        }

        //Sunscreen
        val cardView60 = findViewById<CardView>(R.id.cardView60)
        cardView60.setOnClickListener {

            val intent = Intent(this, MainActivity25::class.java)
            startActivity(intent)
        }

        val cardView57 = findViewById<CardView>(R.id.cardView57)
        cardView57.setOnClickListener {

            val intent = Intent(this, MainActivity28::class.java)
            startActivity(intent)
        }

        // Set click listeners for buttons
        btnHome.setOnClickListener {
            startActivity(Intent(this, MainActivity10::class.java))
        }

        btnVideo.setOnClickListener {
            startActivity(Intent(this, MainActivity13::class.java))
        }

        btnContent.setOnClickListener {
            startActivity(Intent(this, MainActivity12::class.java))
        }

        btnProfile.setOnClickListener {
            startActivity(Intent(this, MainActivity44::class.java))
        }
    }
}
