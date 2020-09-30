package com.myanmaritc.multirecycleviewassignmet.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.myanmaritc.multirecycleviewassignmet.R
import com.myanmaritc.multirecycleviewassignmet.model.Popular
import kotlinx.android.synthetic.main.item_popular_product.view.*

class PopularProductsAdapter(var popular:ArrayList<Popular>):RecyclerView.Adapter<PopularProductsAdapter.PopularProductsViewHolder>() {
    class PopularProductsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bind(popularProduct:Popular){
            itemView.tv_discountPercent.text = popularProduct.discountPercent
            itemView.tv_p_p_Name.text = popularProduct.product_name
            itemView.tv_product_brandName.text = popularProduct.brand_name
            itemView.tv_p_product_price.text = popularProduct.product_price
            itemView.tv_p_cancelPrice.text = popularProduct.cancel_price
            itemView.iv_product.setImageResource(popularProduct.product_image)


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularProductsViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.item_popular_product,parent,false)
        return PopularProductsViewHolder(view)
    }

    override fun getItemCount(): Int =popular.size

    override fun onBindViewHolder(holder: PopularProductsViewHolder, position: Int) {
       holder.bind(popular[position])
    }
}