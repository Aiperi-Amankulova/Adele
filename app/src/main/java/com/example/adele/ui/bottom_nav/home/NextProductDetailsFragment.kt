package com.example.adele.ui.bottom_nav.home

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.adele.R
import com.example.adele.data.common.BaseFragment
import com.example.adele.data.model.SpModel
import com.example.adele.data.model.SpModel.Companion.generatePrise
import com.example.adele.databinding.FragmentNextPtoductBinding
import com.example.adele.ui.MultipleAdapter
import com.example.adele.ui.bottom_nav.PhotoAdapter
import com.example.adele.utils.extensions.viewBinding

class NextProductDetailsFragment: BaseFragment() {
    override fun resID() = R.layout.fragment_next_ptoduct
    private val binding by viewBinding(FragmentNextPtoductBinding::bind)
    private val spAdapter by lazy { MultipleAdapter() }
    private val slideAdapter by lazy { PhotoAdapter() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPager()
        setupListeners()
    }

    private fun setupListeners() {
        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun setupViewPager() {
        binding.img.adapter = slideAdapter
        slideAdapter.update(getDataForPhotoPager())

      binding.recyclerViewNew.adapter = spAdapter
                spAdapter.update(generateSpecData())
    }

//    private fun navigateToDescription() {
//        val destination = RelatedProductDetailsFragmentDirections.actionRelatedProductDetailsFragmentToDescriptionFragment()
//        findNavController().navigate(destination)
//    }
//
//    private fun navigateToDetails() {
//        val destination = RelatedProductDetailsFragmentDirections.actionRelatedProductDetailsFragmentToSpecificationFragment()
//        findNavController().navigate(destination)
//    }

    private fun getDataForPhotoPager(): ArrayList<Int> {
        val list = arrayListOf<Int>()
        list.add(R.drawable.top)
        list.add(R.drawable.t_thirds)
        list.add(R.drawable.top_jins)

        return list
    }

    private fun generateSpecData(): List<SpModel> {
        val list = arrayListOf<SpModel>()
        var newList = listOf<SpModel>()

        list.add(SpModel.generateSize())
        list.add(SpModel.generateColor())
        list.add(SpModel.generateFrom())
        list.add(SpModel.generatePrise())

        newList = if (list.size >= 3) {
            list.subList(0, 3)
        } else {
            list
        }

        return newList
    }
}