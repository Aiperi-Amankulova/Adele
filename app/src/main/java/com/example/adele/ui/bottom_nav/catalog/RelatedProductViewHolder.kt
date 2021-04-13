package com.example.adele.ui.bottom_nav.catalog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.adele.R
import com.example.adele.data.model.HomeModel
import com.example.adele.utils.diffUtils.DiffUtils
import kotlinx.android.synthetic.main.item_next_catalog.view.*

class NextCatalogAdapter (private val listener: () -> Unit) : ListAdapter<HomeModel,ProductViewHolder>(DiffUtils.diffUtils) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_next_catalog, parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(getItem(position), listener)
    }
}

class ProductViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(item: HomeModel, listener: () -> Unit) {
        itemView.tv_price.text = item.title
        itemView.img_pr.setImageResource(item.image)

        itemView.recycler_card.setOnClickListener {
            listener.invoke()
        }
    }
}