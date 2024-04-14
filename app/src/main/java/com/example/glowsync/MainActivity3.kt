package com.example.glowsync

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.content.Intent

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val userName = intent.getStringExtra("USER_NAME")
        val signMessage = "Welcome, $userName!"

        val textView = findViewById<TextView>(R.id.signmsg)
        textView.text = signMessage

        val nextButton = findViewById<Button>(R.id.nextbtn)
        val backButton = findViewById<Button>(R.id.backbtn)

        nextButton.setOnClickListener {
            // Handle Next button click
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }

        backButton.setOnClickListener {
            // Handle Back button click
            finish() // Close MainActivity3 and return to the previous activity
        }
    }
}
