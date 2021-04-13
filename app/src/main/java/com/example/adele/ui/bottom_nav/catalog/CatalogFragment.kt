package com.example.adele.ui.bottom_nav.catalog

import android.os.Bundle
import android.view.Gravity
import android.view.View
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.SnapHelper
import com.example.adele.R
import com.example.adele.data.common.BaseFragment
import com.example.adele.data.model.HomeModel
import com.example.adele.databinding.FragmentBasketBinding
import com.example.adele.databinding.FragmentCatalogBinding
import com.example.adele.databinding.FragmentCategoriesSeeBinding
import com.example.adele.databinding.FragmentNextPtoductBinding
import com.example.adele.ui.MultipleAdapter
import com.example.adele.ui.bottom_nav.PhotoAdapter
import com.example.adele.ui.bottom_nav.basket.BasketAdapter
import com.example.adele.ui.bottom_nav.home.ProductAdapter
import com.example.adele.ui.bottom_nav.home.ProductCategoryFragmentDirections
import com.example.adele.ui.bottom_nav.home.ProductFragmentDirections
import com.example.adele.utils.GravitySnapHelper
import com.example.adele.utils.extensions.viewBinding

class CatalogFragment : BaseFragment() {

    override fun resID() = R.layout.fragment_catalog
    private val binding by viewBinding(FragmentCatalogBinding::bind)
    private val favoriteAdapter by lazy {
        CatalogAdapter() {
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        binding.recyclerView.layoutManager = GridLayoutManager(context, 3)
        val helper: SnapHelper = GravitySnapHelper(Gravity.START)
        helper.attachToRecyclerView(binding.recyclerView)
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