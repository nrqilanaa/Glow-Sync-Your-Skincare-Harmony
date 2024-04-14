package com.example.glowsync

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        val oilySkinButton = findViewById<Button>(R.id.button3)
        val drySkinButton = findViewById<Button>(R.id.button2)
        val combinationSkinButton = findViewById<Button>(R.id.button1)

        // Set onClickListener for the oily skin button
        oilySkinButton.setOnClickListener {
            // Launch MainActivity42 for oily skin
            val intent = Intent(this, MainActivity42::class.java)
            startActivity(intent)
        }

        // Set onClickListener for the dry skin button
        drySkinButton.setOnClickListener {
            // Launch MainActivity10 for dry skin
            val intent = Intent(this, MainActivity10::class.java)
            startActivity(intent)
        }

        // Set onClickListener for the combination skin button
        combinationSkinButton.setOnClickListener {
            // Launch MainActivity11 for combination skin
            val intent = Intent(this, MainActivity11::class.java)
            startActivity(intent)
        }
    }
}