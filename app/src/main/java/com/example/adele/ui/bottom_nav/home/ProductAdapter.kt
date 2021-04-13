package com.example.adele.ui.bottom_nav.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.adele.R
import com.example.adele.data.model.HomeModel
import com.example.adele.utils.diffUtils.DiffUtils
import kotlinx.android.synthetic.main.item_new_shops.view.*

class ProductAdapter(private val listener: () -> Unit) : ListAdapter<HomeModel, ProductCategoryViewHolder>(DiffUtils.diffUtils) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductCategoryViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_new_shops, parent, false)
        return ProductCategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductCategoryViewHolder, position: Int) {
        holder.bind(getItem(position), listener)
    }
}

class ProductCategoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(item: HomeModel, listener: () -> Unit) {
        //itemView.tv_title_for_new.text = item.title
        itemView.imageView.setImageResource(item.image)
        itemView.main_card.setOnClickListener {
            listener.invoke()
        }
    }
}