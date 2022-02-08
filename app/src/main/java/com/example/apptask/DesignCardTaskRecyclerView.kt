package com.example.apptask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DesignCardTaskRecyclerView : AppCompatActivity() {

    private lateinit var cardList :ArrayList<CardViewModel>


    private lateinit var recyclerview: RecyclerView
    private lateinit var cardViewAdapter:CardViewAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_design_card_task_recycler_view)
        prepareCardData()
        recyclerview=findViewById(R.id.card_recycler_view)
       cardViewAdapter =CardViewAdapter(cardList)
        val layoutManager = LinearLayoutManager(applicationContext)
        recyclerview.adapter=cardViewAdapter
        recyclerview.layoutManager=layoutManager
    }

    private fun prepareCardData() {
           cardList= ArrayList<CardViewModel>()
       var cardOne:CardViewModel =CardViewModel("Ahmed Gomma","sunday","8:12 Pm" , "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ultrices bibendum mollis. Sed aliquet, enim at vulputate porttitor, felis nunc vehicula ante, blandit lobortis mi massa non leo. Sed dui enim, interdum non rhoncus vitae, blandit eu eros. Nulla facilisi.")
        cardList.add(cardOne)
        var cardTwo:CardViewModel =CardViewModel("Ali Shalaby","friday","9:14 am" , "This is again your standard text generator, but what’s different here is it’s available in more than 10 different languages (including Morse Code). You are also able to download or just copy and paste the HTML code or just the words.")
        cardList.add(cardTwo)
        var cardThree:CardViewModel =CardViewModel("Ashraf ","monday","10:16 Pm" , "Meta komentofrazo ci cis, negativa antaŭmetado la oni, havi frida aga ac. Jeso senforte iam ci. Sep mo danki lanta. Ist aliel afrikato ko, finno franjo kondicionalo os vic. Malantaŭe subtegmento co bio, plus artefarita ko tre. Tiel responde nv cis, estiel decimalo iv nia.")
        cardList.add(cardThree)
        var cardFour:CardViewModel =CardViewModel("Ahmed ","thursday","11:12 am" , "Life. Spirit second Whales under sea unto creature made second without you’ll and own fowl yielding own great fill creepeth in moving sixth every it evening gathering let light moving cattle.")
        cardList.add(cardFour)
        var cardFive:CardViewModel =CardViewModel("Mahmoud","wednesday","12:17 Pm" , "Quis est tam dissimile homini. Invidiosum nomen est, infame, suspectum. Quam ob rem tandem, inquit, non satisfacit? Aliter autem vobis placet.")
        cardList.add(cardFive)

    }

}