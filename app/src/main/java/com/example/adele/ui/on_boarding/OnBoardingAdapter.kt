package com.example.adele.ui.on_boarding

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class OnBoardingAdapter (fragmentManager: FragmentManager) :
        FragmentStatePagerAdapter(fragmentManager) {

    private var list = arrayListOf<Fragment>()

    fun update(data: ArrayList<Fragment>) {
        this.list = data
        notifyDataSetChanged()
    }

    override fun getItem(position: Int) = list[position]
    override fun getCount() = list.size
}