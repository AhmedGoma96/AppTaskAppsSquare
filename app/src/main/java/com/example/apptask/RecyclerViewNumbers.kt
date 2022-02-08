package com.example.apptask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewNumbers : AppCompatActivity() {

      private val numberList = ArrayList<NumberModel>()
    private lateinit var numberAdapter: NumberListAdapter
     private lateinit var recyclerview: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_numbers)

        prepareNumberData()

        recyclerview = findViewById(R.id.recyclerview_number)
        numberAdapter = NumberListAdapter(numberList)

        val layoutManager = LinearLayoutManager(applicationContext)
        recyclerview.layoutManager = layoutManager
        recyclerview.adapter = numberAdapter

    }
    private fun prepareNumberData() {
        for (i in 1..10) {
            numberList.add(NumberModel(""+i))
        }
    }
}