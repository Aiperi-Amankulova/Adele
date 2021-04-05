package com.example.adele.ui.bottom_nav.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.adele.R
import com.example.adele.data.model.HomeModel
import com.example.adele.utils.diffUtils.DiffUtils
import com.example.adele.utils.extensions.strikeThroughSpan
import kotlinx.android.synthetic.main.item_new_shops.view.*
import kotlinx.android.synthetic.main.item_new_shops.view.imageView
import kotlinx.android.synthetic.main.item_recucler_home.view.*

class DiscountsAdapter(private val listener: () -> Unit) : ListAdapter<HomeModel, DiscountsViewHolder>(DiffUtils.diffUtils) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiscountsViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_dis,  parent, false)
        return DiscountsViewHolder(view)
    }

    override fun onBindViewHolder(holder: DiscountsViewHolder, position: Int) {
        holder.bind(getItem(position), listener)
    }
}
class DiscountsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(item: HomeModel, listener: () -> Unit) {
        itemView.tv_title.text = item.title
        itemView.tv_price.text = "$52"
        itemView.img_pr.setImageResource(item.image)

        itemView.recycler_card.setOnClickListener {
            listener.invoke()
        }
    }
}