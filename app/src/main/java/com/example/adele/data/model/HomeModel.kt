package com.example.adele.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class HomeModel(
        val image: Int,
        val title: String
) : Parcelable