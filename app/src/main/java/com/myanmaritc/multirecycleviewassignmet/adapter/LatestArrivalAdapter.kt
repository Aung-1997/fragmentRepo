package com.myanmaritc.multirecycleviewassignmet.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.myanmaritc.multirecycleviewassignmet.R

import com.myanmaritc.multirecycleviewassignmet.model.LatestArrivals
import kotlinx.android.synthetic.main.item_latest_arrival.view.*

class LatestArrivalAdapter(var arrivalList:ArrayList<LatestArrivals>):RecyclerView.Adapter<LatestArrivalAdapter.LatestArrivalViewHolder>() {
    class LatestArrivalViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(arrival :LatestArrivals){
           itemView.latestNumber.text=arrival.number
            itemView.latestBrandName.text=arrival.brand
            itemView.latestprice.text=arrival.price
            itemView.latestImage.setImageResource(arrival.img)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestArrivalViewHolder {
        var view =LayoutInflater.from(parent.context).inflate(R.layout.item_latest_arrival,parent,false)
        return LatestArrivalViewHolder(view)
    }

    override fun getItemCount(): Int =arrivalList.size

    override fun onBindViewHolder(holder: LatestArrivalViewHolder, position: Int) {
        holder.bind(arrivalList[position])
    }
}