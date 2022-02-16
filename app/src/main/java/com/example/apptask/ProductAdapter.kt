package com.example.apptask

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class ProductAdapter(productList:List<ProductModel>): RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {
    private val productList =productList
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        var view :View = LayoutInflater.from(parent.context).inflate(R.layout.show_product_list_item,parent,false)
        return ProductAdapter.ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        var product: ProductModel= productList[position]
        holder.productNameTV.text=product.name
        holder.priceTV.text= product.price.toString()

    }

    override fun getItemCount(): Int {
        return productList.size
    }

    class ProductViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val productImage: CircleImageView = itemView.findViewById(R.id.productImage)
        val productNameTV: TextView = itemView.findViewById(R.id.productNameTV)
        val priceTV: TextView = itemView.findViewById(R.id.priceTV)
    }
}