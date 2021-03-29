package com.example.adele.ui.bottom_nav.home

import android.os.Bundle
import android.view.Gravity
import android.view.View
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.SnapHelper
import com.example.adele.R
import com.example.adele.data.common.BaseFragment
import com.example.adele.databinding.FragmentHomeBinding
import com.example.adele.utils.GravitySnapHelper
import com.example.adele.utils.ItemOffsetDecoration
import com.example.adele.utils.extensions.viewBinding
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class HomeFragment : BaseFragment() {

    override fun resID() = R.layout.fragment_home
    private val vm by sharedViewModel<HomeViewModel>()
    private val binding by viewBinding(FragmentHomeBinding::bind)

    private val hotSalesAdapter by lazy {
        DiscountsAdapter() {
            navigateToProductCategory()
        }
    }
    private val productCategoryAdapter by lazy {
        MainDiscountsAdepter() {
            navigateToProductCategory()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        setupViewModel()
        setupListeners()
    }

    private fun setupListeners() {
        binding.tv.setOnClickListener {
            navigateToProductCategory()
        }
    }

    private fun setupViewModel() {
        vm.dataSales.observe(viewLifecycleOwner, Observer {
            hotSalesAdapter.submitList(it)
        })

        vm.dataBest.observe(viewLifecycleOwner, Observer {
            productCategoryAdapter.submitList(it)
        })
    }

    private fun setupRecyclerView() {
        binding.recyclerView.adapter = hotSalesAdapter
        binding.recycler.adapter = productCategoryAdapter
        binding.recycler.layoutManager = GridLayoutManager(context, 2)


        val helper: SnapHelper = GravitySnapHelper(Gravity.START)
        helper.attachToRecyclerView(binding.recyclerView)

        binding.recyclerView.addItemDecoration(
                ItemOffsetDecoration(
                        itemLeftMargin = 10f,
                        itemRightMargin = 10f,
                        firstItemLeftMargin = 20f,
                        lastItemRightMargin = 20f
                )
        )

        binding.recycler.addItemDecoration(
                ItemOffsetDecoration(
                        itemLeftMargin = 12f,
                        itemRightMargin = 12f,
                        firstItemLeftMargin = 28f,
                        lastItemRightMargin = 28f
                )
        )

    }

    private fun navigateToProductCategory() {
        val destination = FragmentDirections.actionMainFragmentToProductCategoryFragment()
        findNavController().navigate(destination)
    }
}
