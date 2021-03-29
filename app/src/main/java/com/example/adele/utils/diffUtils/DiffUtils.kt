package com.example.adele.utils.diffUtils

import androidx.recyclerview.widget.DiffUtil
import com.example.adele.data.model.HomeModel

class DiffUtils {
    val diffUtils = object : DiffUtil.ItemCallback<HomeModel>() {
        override fun areItemsTheSame(oldItem: HomeModel, newItem: HomeModel): Boolean {
            return oldItem.image == newItem.image
                    && oldItem.title == newItem.title
        }

        override fun areContentsTheSame(oldItem: HomeModel, newItem: HomeModel): Boolean {
            return oldItem == newItem
        }
    }
}
