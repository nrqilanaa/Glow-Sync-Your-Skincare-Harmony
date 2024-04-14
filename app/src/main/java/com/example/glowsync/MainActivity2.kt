package com.example.glowsync

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.content.Intent

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val userNameInput = findViewById<EditText>(R.id.name)
        val NextButton = findViewById<Button>(R.id.nextbtn)


        NextButton.setOnClickListener {
            val userName = userNameInput.text.toString()

            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("USER_NAME", userName)
            startActivity(intent)
        }
    }
}
