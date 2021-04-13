package com.example.adele.ui.bottom_nav.home

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.adele.R
import com.example.adele.data.common.BaseFragment
import com.example.adele.data.model.HomeModel
import com.example.adele.data.model.SpModel
import com.example.adele.databinding.FragmentMoreBinding
import com.example.adele.ui.MultipleAdapter
import com.example.adele.ui.bottom_nav.PhotoAdapter
import com.example.adele.utils.extensions.viewBinding

class ProductDetailsFragment : BaseFragment() {
    override fun resID() = R.layout.fragment_more
    private val binding by viewBinding(FragmentMoreBinding::bind)

    private val slideAdapter by lazy { PhotoAdapter() }
    private val spAdapter by lazy { MultipleAdapter() }
    private val relatedProductAdapter by lazy {
        DiscountsAdapter() {
            navigateToRelatedProductDetails()
        }
    }



    private fun setupViewPager() {
        binding.img.adapter = slideAdapter
        slideAdapter.update(getDataForPhotoPager())

        binding.recyclerPro.adapter = spAdapter
        spAdapter.update(generateSpecData())
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

    private fun navigateToRelatedProductDetails() {
        val destination =
                ProductFragmentDirections.actionProductCategoryFragmentToProductDetailsFragment()
        findNavController().navigate(destination)
    }

    private fun getDataForPhotoPager(): ArrayList<Int> {
        val list = arrayListOf<Int>()
        list.add(R.drawable.list1)
        list.add(R.drawable.list3)
        list.add(R.drawable.list5)

        return list
    }

    private fun generateSpecData(): List<SpModel> {
        val list = arrayListOf<SpModel>()
        var newList = listOf<SpModel>()

        list.add(SpModel.generateSize())
        list.add(SpModel.generateColor())
        list.add(SpModel.generateFrom())



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
                        image = R.drawable.grey, title = "fvdfvb"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.t_thirds, title = "fvdfvb"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.top, title = "fvdfvb"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.top_jins, title = "fvdfvb"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.top, title = "fvdfvb"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.top_jins, title = "fvdfvb"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.top, title = "fvdfvb"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.top, title = "fvdfvb"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.top_jins, title = "fvdfvb"
                )
        )
        list2.add(
                HomeModel(
                        image = R.drawable.top, title = "fvdfvb")
        )
        return list2
    }
}