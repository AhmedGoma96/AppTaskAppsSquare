package com.example.apptask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myName: TextView = findViewById(R.id.mynameTV)
        val printButton: Button = findViewById(R.id.printButton)
        printButton.setOnClickListener{
            Toast.makeText(this@MainActivity, myName.text, Toast.LENGTH_SHORT).show()
        }


    }
}