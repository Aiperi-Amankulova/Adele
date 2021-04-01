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
                        image = R.drawable.t_thirds, title = "nv hdfv"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.top_jins, title = "jvb shdfvb dk"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.skeert, title = " mdfvljndf"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.top, title = "vfdv"
                )
        )
        dataDiscounts.postValue(list2)
    }

    private fun newData(){
        val list1 = arrayListOf<HomeModel>()

        list1.add(
                HomeModel(
                        image = R.drawable.first_list, title = "fdvfsev"
                )
        )
        list1.add(
                HomeModel(
                        image = R.drawable.second_list, title = "vfwvfwsv"
                )
        )
        list1.add(
                HomeModel(
                        image = R.drawable.third_list, title = "evwsfv"
                )
        )

        dataNews.postValue(list1)

    }


}