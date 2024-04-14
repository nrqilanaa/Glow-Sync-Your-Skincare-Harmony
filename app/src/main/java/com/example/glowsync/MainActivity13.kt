package com.example.glowsync

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button

class MainActivity13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main13)

        val btnHome = findViewById<Button>(R.id.btnhome)
        val btnVideo = findViewById<Button>(R.id.btnvideo)
        val btnContent = findViewById<Button>(R.id.btncontent)
        val btnProfile = findViewById<Button>(R.id.btnprofile)
        val webView1: WebView = findViewById(R.id.webView1)
        val webView2: WebView = findViewById(R.id.webView2)

        webView1.settings.javaScriptEnabled = true
        webView1.webChromeClient = WebChromeClient() // Enable HTML5 video support

        // Load YouTube video URL for webView1
        val html1 =
            "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/I3tqyVR4_NI?si=opgyjZag2O9onOFi\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>"

        webView1.loadData(html1, "text/html", "utf-8")
        webView1.webViewClient = WebViewClient() // Handle redirects in the WebView

        webView2.settings.javaScriptEnabled = true
        webView2.webChromeClient = WebChromeClient() // Enable HTML5 video support

        // Load YouTube video URL for webView2
        val html2 =
            "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/0XDiG5lL0Dw?si=JiYZoonFRJGwOnya\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>"

        webView2.loadData(html2, "text/html", "utf-8")
        webView2.webViewClient = WebViewClient() // Handle redirects in the WebView

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
