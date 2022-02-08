package com.example.apptask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SpalashScreen : AppCompatActivity() {
    private val spalashScreenTime:Long=2000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spalash_screen)
        Handler().postDelayed({
            startActivity(Intent(this,Choose_screen::class.java))
            finish()
        }, spalashScreenTime)
    }
}