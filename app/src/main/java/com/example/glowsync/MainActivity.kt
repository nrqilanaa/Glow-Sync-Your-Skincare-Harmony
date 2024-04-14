package com.example.glowsync

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var progressBar: ProgressBar
    private val progressMax = 100
    private val progressTime = 5000L // 5 seconds in milliseconds
    private val progressIncrement = (progressMax * 50 / progressTime).toLong()
    private val handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progressBar = findViewById(R.id.progressBar)

        Thread(Runnable {
            var progressStatus = 0

            while (progressStatus < progressMax) {
                progressStatus += progressIncrement.toInt()

                if (progressStatus > progressMax) {
                    progressStatus = progressMax
                }

                handler.post {
                    progressBar.progress = progressStatus
                }

                try {
                    Thread.sleep(50)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }

            if (progressStatus == progressMax) {
                navigateToMainActivity4()
            }
        }).start()
    }

    private fun navigateToMainActivity4() {
        val intent = Intent(this@MainActivity, MainActivity2::class.java)
        startActivity(intent)
        finish() // Finish MainActivity to prevent going back
    }
}
