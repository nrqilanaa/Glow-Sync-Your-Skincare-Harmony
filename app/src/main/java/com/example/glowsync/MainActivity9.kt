package com.example.glowsync

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9)

        val userName = intent.getStringExtra("USER_NAME")
        val SignMessage = "$userName!"

        val TextView = findViewById<TextView>(R.id.signmsg)
        TextView.text =SignMessage

    }
}