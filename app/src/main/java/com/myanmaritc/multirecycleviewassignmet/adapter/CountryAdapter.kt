package com.myanmaritc.multirecycleviewassignmet.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.myanmaritc.multirecycleviewassignmet.R
import com.myanmaritc.multirecycleviewassignmet.model.CountryModel
import kotlinx.android.synthetic.main.item_country.view.*

class CountryAdapter(var countryModelList: ArrayList<CountryModel>):RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {
    class CountryViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bind(countryModel: CountryModel){
            itemView.tv_country.text=countryModel.name
            itemView.iv_country.setImageResource(countryModel.image)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
       var view=LayoutInflater.from(parent.context).inflate(R.layout.item_country,parent,false)
        return CountryViewHolder(view)
    }

    override fun getItemCount(): Int =countryModelList.size

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bind(countryModelList[position])
    }
}