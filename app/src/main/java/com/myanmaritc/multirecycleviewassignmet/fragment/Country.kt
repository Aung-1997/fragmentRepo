package com.myanmaritc.multirecycleviewassignmet.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.myanmaritc.multirecycleviewassignmet.model.CountryModel
import com.myanmaritc.multirecycleviewassignmet.R
import com.myanmaritc.multirecycleviewassignmet.adapter.CountryAdapter
import kotlinx.android.synthetic.main.fragment_country.*


class Country : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_country, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var countryList=ArrayList<CountryModel>()
        countryList.add(CountryModel("England",R.drawable.sugar))
        countryList.add(CountryModel("England",R.drawable.sugar))
        countryList.add(CountryModel("England",R.drawable.sugar))
        countryList.add(CountryModel("England",R.drawable.sugar))
        var countryAdapter= CountryAdapter(countryList)
        countryItem.layoutManager=GridLayoutManager(context,2)
        countryItem.adapter=countryAdapter


    }
}