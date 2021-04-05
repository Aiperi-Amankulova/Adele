package com.example.adele.ui.bottom_nav.home

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.adele.R
import com.example.adele.data.common.BaseFragment
import com.example.adele.data.model.HomeModel
import com.example.adele.databinding.FragmentCategoriesSeeBinding
import com.example.adele.databinding.FragmentProfileBinding
import com.example.adele.ui.main.ProductFragmentDirections
import com.example.adele.utils.extensions.viewBinding

class ProductFragment : BaseFragment() {
    override fun resID() = R.layout.fragment_categories_see
    private val binding by viewBinding(FragmentCategoriesSeeBinding::bind)

    private val productCategoryAdapter by lazy {
         ProductAdapter() {
            navigateToProductDetails()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        setupListeners()
    }

    private fun setupListeners() {
        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun setupRecyclerView() {
        binding.recyclerViewProductDis.adapter = productCategoryAdapter
        productCategoryAdapter.submitList(generateBestData())
        binding.recyclerViewProductDis.layoutManager = GridLayoutManager(context, 2)
    }

    private fun navigateToProductDetails() {
        val destination = ProductFragmentDirections.actionProductFragmentToProductDetFragment()
        findNavController().navigate(destination)
    }

    private fun generateBestData(): ArrayList<HomeModel> {
        val list = arrayListOf<HomeModel>()

        list.add(
                HomeModel(
                        image = R.drawable.top_jins, title = "kdfnbndflz"
                )
        )
        list.add(
                HomeModel(
                        image = R.drawable.top, title = "fnvbjdfk"
                )
        )
        list.add(
                HomeModel(
                        image = R.drawable.t_thirds, title = "lmc;sdkMV"
                )
        )
        list.add(
                HomeModel(
                        image = R.drawable.skeerd, title = "vdfnvbklf"
                )
        )
        list.add(
                HomeModel(
                        image = R.drawable.skeert, title = "fmdvldkzfv"
                )
        )
        list.add(
                HomeModel(
                        image = R.drawable.grey, title = "dfvsd"
                )
        )
        list.add(
                HomeModel(
                        image = R.drawable.t_thirds, title = "vfsfv"
                )
        )
        list.add(
                HomeModel(
                        image = R.drawable.grey, title = "defsd"
                )
        )
        return list
    }
}