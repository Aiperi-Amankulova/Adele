package com.example.adele.ui.bottom_nav.home

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.adele.R
import com.example.adele.data.common.BaseFragment
import com.example.adele.data.model.HomeModel
import com.example.adele.data.model.SpModel
import com.example.adele.databinding.FragmentMoreBinding
import com.example.adele.ui.PhotoAdapter
import com.example.adele.utils.extensions.viewBinding

class ProductDetailsFragment : BaseFragment() {
    override fun resID() = R.layout.fragment_more
    private val binding by viewBinding(FragmentMoreBinding::bind)

    private val slideAdapter by lazy { PhotoAdapter() }
    private val relatedProductAdapter by lazy {
        ProductAdapter() {
            navigateToRelatedProductDetails()
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
        binding.img.adapter = slideAdapter
        slideAdapter.update(getDataForPhotoPager())

        binding.recyclerPro.adapter = relatedProductAdapter
        relatedProductAdapter.submitList(generateBestData())
    }

//    private fun navigateToDescription() {
//        val destination =
//                ProductDetailsFragmentDirections.actionProductDetailsFragmentToDescriptionFragment()
//        findNavController().navigate(destination)
//    }
//
//    private fun navigateToDetails() {
//        val destination = ProductDetailsFragmentDirections.actionProductDetailsFragmentToSpecificationFragment()
//        findNavController().navigate(destination)
//    }

    private fun navigateToRelatedProductDetails() {
        val destination =
                ProductDetailsFragmentDirections.actionProductDetailsFragmentToSpFragment()
        findNavController().navigate(destination)
    }

    private fun getDataForPhotoPager(): ArrayList<Int> {
        val list = arrayListOf<Int>()
        list.add(R.drawable.second_list)
        list.add(R.drawable.first_list)
        list.add(R.drawable.third_list)

        return list
    }

    private fun generateSpecData(): List<SpModel> {
        val list = arrayListOf<SpModel>()
        var newList = listOf<SpModel>()

        list.add(SpModel.generateMemory())
        list.add(SpModel.generateDisplay())
        list.add(SpModel.generateCamera())
        list.add(SpModel.generateOS())
        list.add(SpModel.generateBatteries())

        newList = if (list.size >= 3) {
            list.subList(0, 3)
        } else {
            list
        }

        return newList
    }

    private fun generateBestData(): List<HomeModel>? {
        val list2 = arrayListOf<HomeModel>()

        list2.add(
                HomeModel(
                        image = R.drawable.grey, title = "Samsung Galaxy s20 Ultra"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.t_thirds, title = "Xiaomi Mi 10 Pro"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.top, title = "Samsung Note 20 Ultra"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.top_jins, title = "Motorola One Edge"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.top, title = "Samsung Note 20 Ultra"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.top_jins, title = "Motorola One Edge"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.top, title = "Samsung Note 20 Ultra"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.top_jins, title = "Motorola One Edge"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.top, title = "Samsung Note 20 Ultra"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.top_jins, title = "Motorola One Edge"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.top, title = "Samsung Note 20 Ultra"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.top_jins, title = "Motorola One Edge"
                )
        )
        return list2
    }
}