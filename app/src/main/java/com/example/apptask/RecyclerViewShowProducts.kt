package com.example.apptask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

class RecyclerViewShowProducts : AppCompatActivity() {
    private lateinit var recyclerviewProduct: RecyclerView
    private lateinit var productAdapter: ProductAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_show_products)
        val addProductButton: Button = findViewById(R.id.addProductButton)



        recyclerviewProduct=findViewById(R.id.showProductsRecyclerView)
        val layoutManager = GridLayoutManager(applicationContext,2)


        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://android-training.appssquare.com/api/")
            .build()
        val apiInterface=retrofit.create(ApiInterface::class.java)
        val productList=apiInterface.getProducts()
        productList.enqueue( object : Callback<List<ProductModel>>{
            override fun onResponse(call: Call<List<ProductModel>>?, response: Response<List<ProductModel>>?) {

                if (response?.body() != null){
                    recyclerviewProduct.layoutManager = layoutManager
                    productAdapter= response.body()?.let { ProductAdapter(it) }!!
                    recyclerviewProduct.layoutManager = layoutManager
                    recyclerviewProduct.adapter=productAdapter
                }


            }

            override fun onFailure(call: Call<List<ProductModel>>?, t: Throwable?) {

            }
        })

       /* addProductButton.setOnClickListener {
            val intent = Intent(this, AddProduct::class.java)
            startActivity(intent)
        }*/

    }

}