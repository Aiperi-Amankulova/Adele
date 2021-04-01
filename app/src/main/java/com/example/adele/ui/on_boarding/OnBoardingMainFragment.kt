package com.example.adele.ui.on_boarding

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager.widget.ViewPager
import com.example.adele.PreferenceHelper
import com.example.adele.R
import com.example.adele.data.model.OnBoardModel
import kotlinx.android.synthetic.main.activity_on_boarding.*

class OnBoardingMainFragment : Fragment(R.layout.activity_on_boarding) {

    private val list = arrayListOf<Fragment>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPager()
        setupListeners()
    }

    private fun setupListeners() {
        onBoardViewPager.setOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {}

            override fun onPageScrolled(
                    position: Int,
                    positionOffset: Float,
                    positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                if (isLastPage(position)) {
                    tvNext.text = getString(R.string.proceed)
                } else {
                    tvNext.text = getString(R.string.next)
                }
            }

        })

        tvNext.setOnClickListener {
            if (isLastPage(onBoardViewPager.currentItem)) {
                PreferenceHelper.setIsFirstLaunch()
                findNavController().navigate(R.id.splashScreenForOnBoard)
            }
            else {
                onBoardViewPager.currentItem += 1
            }
        }
    }

    private fun setupViewPager() {
        val adapter = OnBoardingAdapter(childFragmentManager)
        onBoardViewPager.adapter = adapter
        list.add(
                OnBoardingFragment.getInstance(
                        OnBoardModel(
                                getString(R.string.password),
                                R.drawable.onboard1
                        )
                )
        )
        list.add(
                OnBoardingFragment.getInstance(
                        OnBoardModel(
                                getString(R.string.password),
                                R.drawable.onboard2
                        )
                )
        )
        list.add(
                OnBoardingFragment.getInstance(
                        OnBoardModel(
                                getString(R.string.password),
                                R.drawable.onboard3
                        )
                )
        )

        adapter.update(list)
        onBoardTabLayout.setupWithViewPager(onBoardViewPager)
    }
    private fun isLastPage(position: Int) = position == list.size - 1
}