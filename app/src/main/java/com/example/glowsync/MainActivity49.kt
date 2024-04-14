package com.example.glowsync

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.RatingBar
import android.widget.Button
import android.widget.TextView  // Import TextView
import android.widget.Toast

class MainActivity49 : AppCompatActivity() {

    private lateinit var ratingBar: RatingBar
    private lateinit var commentEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main49)

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


        ratingBar = findViewById(R.id.ratingBar)
        commentEditText = findViewById(R.id.commentEditText)

        // Set a listener to handle rating changes
        ratingBar.setOnRatingBarChangeListener { _, rating, _ ->
            // Handle rating change here (if needed)
            Toast.makeText(this, "Rating: $rating", Toast.LENGTH_SHORT).show()
        }

        // Add a button click listener to submit the review
        val submitButton: Button = findViewById(R.id.btnsubmit)
        submitButton.setOnClickListener { submitReview() }
    }

    private fun submitReview() {
        val rating = ratingBar.rating
        val comment = commentEditText.text.toString()


        val textViewReview: TextView = findViewById(R.id.TextViewReview)
        textViewReview.text = "Rating: $rating\nQila: \n$comment"
    }


}
