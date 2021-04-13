package com.example.adele.ui.bottom_nav.catalog

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.adele.R
import com.example.adele.data.common.BaseFragment
import com.example.adele.data.model.HomeModel
import com.example.adele.databinding.FragmentNextCatalogBinding
import com.example.adele.ui.bottom_nav.home.ProductCategoryFragmentDirections
import com.example.adele.utils.extensions.viewBinding

class NextCatalogFragment : BaseFragment() {

        override fun resID() = R.layout.fragment_next_catalog
        private val binding by viewBinding(FragmentNextCatalogBinding::bind)

        private val productCategoryAdapter by lazy {
                NextCatalogAdapter() {
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
                binding.recyclerNextCatalog.adapter = productCategoryAdapter
                productCategoryAdapter.submitList(generateBestData())
                binding.recyclerNextCatalog.layoutManager = GridLayoutManager(context, 2)
        }

        private fun navigateToProductDetails() {
                val destination = CatalogNewFragmentDirections.actionNewCatalogFragmentToProductNextDetailsFragment()
                findNavController().navigate(destination)
        }

        private fun generateBestData(): ArrayList<HomeModel> {
                val list = arrayListOf<HomeModel>()

                list.add(
                        HomeModel(
                                image = R.drawable.hoody, title = "Hoody"
                        )
                )
                list.add(
                        HomeModel(
                                image = R.drawable.sweaters, title = "Sweaters"
                        )
                )
                list.add(
                        HomeModel(
                                image = R.drawable.chords, title = "Shords"
                        )
                )
                list.add(
                        HomeModel(
                                image = R.drawable.t_thirsdd, title = "T-thirds"
                        )
                )
                list.add(
                        HomeModel(
                                image = R.drawable.tops, title = "Top"
                        )
                )
                list.add(
                        HomeModel(
                                image = R.drawable.shords_l, title = "Shords"
                        )
                )
                list.add(
                        HomeModel(
                                image = R.drawable.shords_p, title = "Shords"
                        )
                )
                list.add(
                        HomeModel(
                                image = R.drawable.shords_r, title = "Shords"
                        )
                )
                list.add(
                        HomeModel(
                                image = R.drawable.skirts, title = "Skirts"
                        )
                )

//        list.add(
//                HomeModel(
//                        image = R.drawable.grey, title = "defsd"
//                )
//        )
//        list.add(
//                HomeModel(
//                        image = R.drawable.grey, title = "dfvsd"
//                )
//        )
//        list.add(
//                HomeModel(
//                        image = R.drawable.t_thirds, title = "vfsfv"
//                )
//        )
//        list.add(
//                HomeModel(
//                        image = R.drawable.grey, title = "defsd"
//                )
//        )
//        list.add(
//                HomeModel(
//                        image = R.drawable.grey, title = "dfvsd"
//                )
//        )
                return list
        }
}