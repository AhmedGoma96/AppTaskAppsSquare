package com.example.apptask

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NumberListAdapter(numberList: ArrayList<NumberModel>) : RecyclerView.Adapter<NumberListAdapter.NumberViewHolder>() {
    private val numberList = numberList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
           return NumberViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.number_list_item,parent,false))
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.numberTV.text = numberList[position].number
    }

    override fun getItemCount(): Int {
        return numberList.size
    }

    class NumberViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val numberTV: TextView = itemView.findViewById(R.id.numberTV)

    }
}