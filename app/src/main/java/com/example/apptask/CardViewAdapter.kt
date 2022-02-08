package com.example.apptask

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CardViewAdapter(cardList:ArrayList<CardViewModel>): RecyclerView.Adapter<CardViewAdapter.CardViewViewHolder>() {
    private val cardList = cardList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        var view :View =LayoutInflater.from(parent.context).inflate(R.layout.card_list_item,parent,false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        var card: CardViewModel = cardList[position]
        holder.name.text=card.name
        holder.day.text=card.day
        holder.date.text=card.date
        holder.description.text=card.description
    }

    override fun getItemCount(): Int {
       return cardList.size
    }
    class CardViewViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val name: TextView = itemView.findViewById(R.id.name)
        val day: TextView = itemView.findViewById(R.id.day)
        val date: TextView = itemView.findViewById(R.id.date)
        val description: TextView = itemView.findViewById(R.id.description)

    }
}