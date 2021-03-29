package com.example.adele.ui.bottom_nav.home

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.adele.R

class FragmentDirections private constructor() {
    companion object {
        fun actionMainFragmentToProductCategoryFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_splashScreen2_to_onHomeFragment)
    }
}
