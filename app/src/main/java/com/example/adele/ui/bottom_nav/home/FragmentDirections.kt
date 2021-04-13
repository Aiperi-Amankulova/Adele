package com.example.adele.ui.bottom_nav.home

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.adele.R

class FragmentDirections private constructor() {
    companion object {
        fun actionMainFragmentToProductDetailsFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_mainFragment_to_productDetailsFragment)

        fun actionMainFragmentToProductCategoryFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_mainFragment_to_productCategoryFragment)
    }
}
