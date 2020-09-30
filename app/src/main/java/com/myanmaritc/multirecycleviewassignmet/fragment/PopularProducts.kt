package com.myanmaritc.multirecycleviewassignmet.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.myanmaritc.multirecycleviewassignmet.R
import com.myanmaritc.multirecycleviewassignmet.adapter.PopularProductsAdapter
import com.myanmaritc.multirecycleviewassignmet.model.Popular
import kotlinx.android.synthetic.main.fragment_popular_products.*


class PopularProducts : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_popular_products, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var popularProductList=ArrayList<Popular>()
        popularProductList.add(Popular("10 % off","Iphone 11 Plus","Apple","980000Ks","1100000Ks",R.drawable.rediphone))
        popularProductList.add(Popular("10 % off","Iphone 11 Plus","Apple","980000Ks","1100000Ks",R.drawable.rediphone))
        popularProductList.add(Popular("10 % off","Iphone 11 Plus","Apple","980000Ks","1100000Ks",R.drawable.rediphone))
        popularProductList.add(Popular("10 % off","Iphone 11 Plus","Apple","980000Ks","1100000Ks",R.drawable.rediphone))


        var popularAdapter= PopularProductsAdapter(popularProductList)
        popularProduct.layoutManager=LinearLayoutManager(context)
        popularProduct.adapter=popularAdapter

    }


}