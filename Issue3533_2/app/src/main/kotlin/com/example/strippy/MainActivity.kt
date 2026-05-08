package com.example.strippy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this).apply {
            text = "Hello, World!"
            textSize = 24f
            setPadding(32, 32, 32, 32)
        }
        setContentView(textView)
    }
}
