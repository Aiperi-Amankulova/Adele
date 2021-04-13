package com.example.adele.ui.bottom_nav.catalog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.adele.R
import com.example.adele.data.model.CatalogModel
import com.example.adele.data.model.HomeModel
import com.example.adele.utils.diffUtils.DiffUtils
import kotlinx.android.synthetic.main.item_catalog.view.*
import kotlinx.android.synthetic.main.item_recucler_home.view.*

class CatalogAdapter (private val listener: () -> Unit) : ListAdapter<HomeModel, DiscountsViewHolder>(DiffUtils.diffUtils) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiscountsViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_catalog,  parent, false)
        return DiscountsViewHolder(view)
    }
    private val list = arrayListOf<CatalogModel>()

    fun update(list: List<CatalogModel>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }
    override fun onBindViewHolder(holder: DiscountsViewHolder, position: Int) {
        holder.bind(getItem(position), listener)
    }
}
class DiscountsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(item: HomeModel, listener: () -> Unit) {
        itemView.tv_title_ca.text = item.title
        itemView.imageView4.setImageResource(item.image)
        itemView.recycler_card.setOnClickListener {
            listener.invoke()
        }
    }
}
