package com.example.firstdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDownload = findViewById<Button>(R.id.btnDownload)
        val btnUpload = findViewById<Button>(R.id.btnUpload)

        btnUpload.setOnClickListener {
            Toast.makeText(applicationContext,"Upload..", Toast.LENGTH_SHORT).show()
        }

        btnDownload.setOnClickListener {
            Toast.makeText(applicationContext,"Download..",Toast.LENGTH_LONG).show()
        }
    }
}