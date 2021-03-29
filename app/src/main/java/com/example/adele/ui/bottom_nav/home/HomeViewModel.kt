package com.example.adele.ui.bottom_nav.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.adele.R
import com.example.adele.data.model.HomeModel

class HomeViewModel : ViewModel() {

    val data = MutableLiveData<List<HomeModel>>()
    val dataSales = MutableLiveData<List<HomeModel>>()
    val dataBest = MutableLiveData<List<HomeModel>>()

    init {
        generateData()
        generateBestData()
    }
    private fun generateBestData(){
        val list2 = arrayListOf<HomeModel>()

        list2.add(
                HomeModel(
                        image = R.drawable.t_thirds, title = "Samsung Galaxy s20 Ultra"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.top_jins, title = "Xiaomi Mi 10 Pro"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.skeert, title = "Samsung Note 20 Ultra"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.top, title = "Motorola One Edge"
                )
        )
        dataBest.postValue(list2)
    }

    private fun generateData(){
        val list1 = arrayListOf<HomeModel>()

        list1.add(
                HomeModel(
                        image = R.drawable.first_list, title = "Iphone 12"
                )
        )
        list1.add(
                HomeModel(
                        image = R.drawable.second_list, title = "Iphone 12"
                )
        )
        list1.add(
                HomeModel(
                        image = R.drawable.third_list, title = "Iphone 12"
                )
        )

        dataSales.postValue(list1)

    }


}