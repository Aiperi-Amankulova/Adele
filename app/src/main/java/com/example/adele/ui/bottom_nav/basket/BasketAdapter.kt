package com.example.adele.ui.bottom_nav.basket

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.adele.R
import com.example.adele.data.model.HomeModel
import com.example.adele.utils.diffUtils.DiffUtils
import kotlinx.android.synthetic.main.item_basket.view.*

class BasketAdapter(private val listener: () -> Unit) : ListAdapter<HomeModel, FavoriteViewHolder>(DiffUtils.diffUtils) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_basket, parent, false)
        return FavoriteViewHolder(view)
    }

    override fun onBindViewHolder(holder: FavoriteViewHolder, position: Int) {
        holder.bind(getItem(position), listener)
    }
}

class FavoriteViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(item: HomeModel, listener: () -> Unit) {
        itemView.textView9.text = item.title
        itemView.imageView2.setImageResource(item.image)

        itemView.item_basket.setOnClickListener {
            listener.invoke()
        }

    }
}