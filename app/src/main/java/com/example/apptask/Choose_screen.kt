package com.example.apptask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Choose_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_screen)
        val taskOneButton: Button = findViewById(R.id.taskOneButton)
        val recyclerViewNumbersButton: Button = findViewById(R.id.recyclerViewNumbersButton)
        val recyclerViewCardDesignButton: Button = findViewById(R.id.recyclerViewCardDesignButton)

        taskOneButton.setOnClickListener{
            val intent = Intent(this, TaskOne::class.java)
            startActivity(intent)
        }
        recyclerViewNumbersButton.setOnClickListener{
            val intent = Intent(this, RecyclerViewNumbers::class.java)
            startActivity(intent)
        }
        recyclerViewCardDesignButton.setOnClickListener{
            val intent = Intent(this, DesignCardTaskRecyclerView::class.java)
            startActivity(intent)
        }
    }

}