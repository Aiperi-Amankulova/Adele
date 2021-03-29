package com.example.adele.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.adele.PreferenceHelper
import com.example.adele.R
import com.example.adele.data.common.BaseFragment
import com.example.adele.ui.main.MainActivity

class SplashFragment : BaseFragment() {

    override fun resID() = R.layout.activity_splash

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Handler().postDelayed({
            selectFragment()
        }, 3000)
    }

    private fun selectFragment() {
        if (PreferenceHelper.getIsFirstLaunch()) {
            findNavController().navigate(R.id.action_splashScreen2_to_onHomeFragment)
        } else {
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)
            activity?.onBackPressed()
        }
    }
}