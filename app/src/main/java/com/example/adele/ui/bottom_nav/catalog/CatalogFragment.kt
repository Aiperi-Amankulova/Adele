package com.example.adele.ui.bottom_nav.catalog

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.adele.R
import com.example.adele.data.common.BaseFragment
import com.example.adele.data.model.HomeModel
import com.example.adele.databinding.FragmentCatalogBinding
import com.example.adele.utils.extensions.viewBinding

class CatalogFragment : BaseFragment() {

    override fun resID() = R.layout.fragment_catalog

//    private val binding by viewBinding(FragmentCatalogBinding::bind)
//   private val adapter by lazy { CatalogAdapter(){
//        navigateToProductDetails()
//    } }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        setupExpListView()
//    }
//
//    private fun setupExpListView() {
//        binding.recyclerView.setAdapter(adapter)
//        adapter.update(generateMainData())
//    }
//
//    private fun navigateToProductDetails() {
//        val destination = CatalogFragmentDirections.actionCatalogFragmentToProductCategoryFragment()
//        findNavController().navigate(destination)
//    }
//
//    private fun generateMainData(): ArrayList<HomeModel> {
//        val list = arrayListOf<HomeModel>()
//
//        list.add(
//                HomeModel(
//                        title = "TV", subList = generateTVData()
//                )
//        )
//        list.add(
//                HomeModel(
//                        title = "Phones", subList = generatePhoneData()
//                )
//        )
//        list.add(
//                HomeModel(
//                        title = "Photo and Video", subList = generatePhotoVideoData()
//                )
//        )
//        list.add(
//                HomeModel(
//                        title = "Computers", subList = generateComputersData()
//                )
//        )
//
//        return list
//    }


}