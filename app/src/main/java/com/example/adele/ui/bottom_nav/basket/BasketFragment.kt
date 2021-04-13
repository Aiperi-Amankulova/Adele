package com.example.adele.ui.bottom_nav.basket

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.adele.R
import com.example.adele.data.common.BaseFragment
import com.example.adele.data.model.HomeModel
import com.example.adele.databinding.FragmentBasketBinding
import com.example.adele.utils.extensions.viewBinding

class BasketFragment : BaseFragment() {

    override fun resID() = R.layout.fragment_basket
    private val binding by viewBinding(FragmentBasketBinding::bind)
    private val favoriteAdapter by lazy {
        BasketAdapter() {
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        binding.recyclerView.adapter = favoriteAdapter
        favoriteAdapter.submitList(generateBestData())

    }

    private fun generateBestData(): List<HomeModel>? {
        val list = arrayListOf<HomeModel>()

        list.add(
                HomeModel(
                        image = R.drawable.grey, title = "vfdv"
                )
        )
        list.add(
                HomeModel(
                        image = R.drawable.t_thirds, title = "fvd"
                )
        )
        list.add(
                HomeModel(
                        image = R.drawable.top, title = "ebdf"
                )
        )
        list.add(
                HomeModel(
                        image = R.drawable.top_jins, title = "beb"
                )
        )

        return list
    }
}