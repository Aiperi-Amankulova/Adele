package com.example.adele.ui.bottom_nav.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.adele.R
import com.example.adele.data.model.HomeModel

class HomeViewModel : ViewModel() {

    val data = MutableLiveData<List<HomeModel>>()
    val dataNews = MutableLiveData<List<HomeModel>>()
    val dataDiscounts = MutableLiveData<List<HomeModel>>()

    init {
        newData()
        discountsBestData()
    }
    private fun discountsBestData(){
        val list2 = arrayListOf<HomeModel>()

        list2.add(
                HomeModel(
                        image = R.drawable.t_thirds, title = "T-Thirds"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.top_jins, title = "Jeans top"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.skeert, title = " Skirt"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.top, title = "Top"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.t_thirds, title = "T-Thirds"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.top_jins, title = "Jeans top"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.skeert, title = " Skirt"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.top, title = "Top"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.top_jins, title = "Top"
                )
        )
        dataDiscounts.postValue(list2)
    }

    private fun newData(){
        val list1 = arrayListOf<HomeModel>()

        list1.add(
                HomeModel(
                        image = R.drawable.list1, title = "fdvfsev"
                )
        )
        list1.add(
                HomeModel(
                        image = R.drawable.list2, title = "vfwvfwsv"
                )
        )
        list1.add(
                HomeModel(
                        image = R.drawable.list3, title = "evwsfv"
                )
        )
        list1.add(
                HomeModel(
                        image = R.drawable.list4, title = "evwsfv"
                )
        )
        list1.add(
                HomeModel(
                        image = R.drawable.list5, title = "evwsfv"
                )
        )
        dataNews.postValue(list1)
    }
}