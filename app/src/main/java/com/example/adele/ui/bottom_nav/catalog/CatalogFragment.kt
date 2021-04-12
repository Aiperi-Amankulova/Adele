package com.example.adele.ui.bottom_nav.catalog

import android.os.Bundle
import android.view.Gravity
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.SnapHelper
import com.example.adele.R
import com.example.adele.data.common.BaseFragment
import com.example.adele.data.model.HomeModel
import com.example.adele.databinding.FragmentCatalogBinding
import com.example.adele.databinding.FragmentHomeBinding
import com.example.adele.ui.bottom_nav.home.DiscountsAdapter
import com.example.adele.ui.bottom_nav.home.FragmentDirections
import com.example.adele.ui.bottom_nav.home.HomeViewModel
import com.example.adele.ui.bottom_nav.home.ProductAdapter
import com.example.adele.utils.GravitySnapHelper
import com.example.adele.utils.extensions.viewBinding
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class CatalogFragment : BaseFragment() {

    override fun resID() = R.layout.fragment_catalog
//    private val vm by sharedViewModel<HomeViewModel>()
//    private val binding by viewBinding(FragmentHomeBinding::bind)
//
//    private val newProductAdapter by lazy {
//        ProductAdapter() {
//            navigateToProductDetails()
//        }
//    }
//    private val destinationAdapter by lazy {
//        DiscountsAdapter() {
//            navigateToProductDetails()
//        }
//    }
//
//    private fun setupListeners() {
//        binding.tvCat.setOnClickListener {
//            navigateToProductCategory()
//        }
//    }
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        setupRecyclerView()
//        setupViewModel()
//        setupListeners()
//    }
//
//    private fun setupViewModel() {
//        vm.dataNews.observe(viewLifecycleOwner, Observer {
//            newProductAdapter.submitList(it)
//        })
//
//        vm.dataDiscounts.observe(viewLifecycleOwner, Observer {
//            destinationAdapter.submitList(it)
//        })
//    }
//
//    private fun setupRecyclerView() {
//        binding.recyclerView.adapter = newProductAdapter
//        binding.recycler.adapter = destinationAdapter
//        binding.recycler.layoutManager = GridLayoutManager(context, 3)
//        val helper: SnapHelper = GravitySnapHelper(Gravity.START)
//        helper.attachToRecyclerView(binding.recyclerView)
//    }
//
//    private fun navigateToProductCategory() {
//        val destination =  FragmentDirections.actionMainFragmentToProductCategoryFragment()
//        findNavController().navigate(destination)
//    }
//
//    private fun navigateToProductDetails() {
//        val destination =  FragmentDirections.actionMainFragmentToProductDetailsFragment()
//        findNavController().navigate(destination)
//    }
}