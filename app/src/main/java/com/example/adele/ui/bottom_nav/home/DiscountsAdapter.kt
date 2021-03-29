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

class DiscountsAdapter(private val listener: () -> Unit) : ListAdapter<HomeModel, HotSalesViewHolder>(DiffUtils.diffUtils) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotSalesViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_new_shops, parent, false)
        return HotSalesViewHolder(view)
    }

    override fun onBindViewHolder(holder: HotSalesViewHolder, position: Int) {
        holder.bind(getItem(position), listener)
    }
}
class HotSalesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(item: HomeModel, listener: () -> Unit) {
        itemView.imageView.setImageResource(item.image)

        itemView.main_card.setOnClickListener {
            listener.invoke()
        }
    }
}