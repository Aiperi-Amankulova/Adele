package com.example.adele.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.adele.data.model.FeaturesModel
import com.example.adele.data.model.SpModel
import com.example.adele.databinding.ItemBodyBinding
import com.example.adele.databinding.ItemNextBinding

class MultipleAdapter : RecyclerView.Adapter<HeaderViewHolder>() {

    private val list = arrayListOf<SpModel>()

    fun update(list: List<SpModel>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeaderViewHolder {
        return HeaderViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: HeaderViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount() = list.size

}


class HeaderViewHolder(private val binding: ItemBodyBinding) : RecyclerView.ViewHolder(binding.root) {

    private val adapter = FeaturesAdapter()

    init {
        binding.recyclerViewBody.adapter = adapter
    }

    fun bind(response: SpModel) {
        binding.tvHeader.text = response.title
        adapter.update(response.specs)
    }

    companion object {
        fun create(parent: ViewGroup): HeaderViewHolder {
            val binding =
                    ItemBodyBinding.inflate(LayoutInflater.from(parent.context), parent, false)

            return HeaderViewHolder(binding)
        }
    }
}

class FeaturesAdapter : RecyclerView.Adapter<FeaturesViewHolder>(){

    private val list = arrayListOf<FeaturesModel>()

    fun update(list: ArrayList<FeaturesModel>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeaturesViewHolder {
        return FeaturesViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: FeaturesViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount() = list.size

}

class FeaturesViewHolder(private val binding: ItemNextBinding) : RecyclerView.ViewHolder(binding.root){
    fun bind(featuresModel: FeaturesModel) {
        binding.tvDetails.text = featuresModel.features
        binding.tvTitle.text = featuresModel.title
    }

    companion object {
        fun create(parent: ViewGroup): FeaturesViewHolder {
            val binding =
                    ItemNextBinding.inflate(LayoutInflater.from(parent.context), parent, false)

            return FeaturesViewHolder(binding)
        }
    }
}