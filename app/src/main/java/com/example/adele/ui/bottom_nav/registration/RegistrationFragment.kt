package com.example.adele.ui.bottom_nav.registration

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.adele.R
import com.example.adele.data.common.BaseFragment
import kotlinx.android.synthetic.main.activity_registration.*

class RegistrationFragment  : BaseFragment() {

    override fun resID() = R.layout.activity_registration

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
    }

    private fun setupListeners() {
        btn_sign_in.setOnClickListener {
            findNavController().navigate(R.id.action_onboarding_to_registration)
        }

        btn_sign_up.setOnClickListener {
            findNavController().navigate(R.id.action_registration_to_main)
        }
    }
}