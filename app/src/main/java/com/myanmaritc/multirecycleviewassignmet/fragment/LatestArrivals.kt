package com.myanmaritc.multirecycleviewassignmet.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.myanmaritc.multirecycleviewassignmet.model.LatestArrivals
import com.myanmaritc.multirecycleviewassignmet.R
import com.myanmaritc.multirecycleviewassignmet.adapter.LatestArrivalAdapter
import kotlinx.android.synthetic.main.fragment_latest_arrivals.*


class LatestArrivals : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_latest_arrivals, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var arrivallist=ArrayList<LatestArrivals>()
        arrivallist.add(LatestArrivals("HORNS PINK","Lady GaGa","72000ks",R.drawable.lady))
        arrivallist.add(LatestArrivals("HORNS PINK","Lady GaGa","72000ks",R.drawable.lady))
        arrivallist.add(LatestArrivals("HORNS PINK","Lady GaGa","72000ks",R.drawable.lady))
        var adapter=LatestArrivalAdapter(arrivallist)
        latest.layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        latest.adapter=adapter
    }

    
}