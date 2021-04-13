package com.example.adele.ui.bottom_nav.home

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.adele.R
import com.example.adele.data.common.BaseFragment
import com.example.adele.data.model.SpModel
import com.example.adele.databinding.FragmentBodyBinding
import com.example.adele.ui.MultipleAdapter
import com.example.adele.utils.extensions.viewBinding

class SpFragment : BaseFragment() {
    override fun resID() = R.layout.fragment_body
    private val binding by viewBinding(FragmentBodyBinding::bind)
    private val specAdapter by lazy { MultipleAdapter() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        binding.recyclerViewBody.adapter = specAdapter
        specAdapter.update(generateSpecData())
    }
    }

    private fun generateSpecData(): List<SpModel> {
        val list = arrayListOf<SpModel>()
        var newList = listOf<SpModel>()

        list.add(SpModel.generateColor())
        list.add(SpModel.generateSize())
        list.add(SpModel.generateFrom())
        list.add(SpModel.generatePrise())

        newList = if (list.size >= 3) {
            list.subList(0, 3)
        } else {
            list
        }

        return newList
    }
