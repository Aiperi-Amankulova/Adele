package com.example.adele.ui.bottom_nav

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.adele.R
import kotlinx.android.synthetic.main.item_img.view.*

class PhotoAdapter : RecyclerView.Adapter<PagerViewHolder>() {

    private val list = arrayListOf<Int>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_img, parent, false)
        return PagerViewHolder(view)
    }

    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
        holder.bind(list[position])
    }

    fun update(list: ArrayList<Int>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    override fun getItemCount() = list.size
}

class PagerViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(position: Int) {
        itemView.img_prog.setImageResource(position)
    }
}
