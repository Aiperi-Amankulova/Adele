package com.example.adele.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.adele.R
import com.example.adele.databinding.ActivityMainBinding
import com.example.adele.utils.extensions.setupWithNavController
import com.example.adele.utils.extensions.showLightStatusBar
import com.example.adele.utils.extensions.viewBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    private val binding by viewBinding(ActivityMainBinding::inflate)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupBottomNav()
    }

    private fun setupBottomNav() {
        val navGraphId = listOf(
                R.navigation.home,
                R.navigation.catalog,
                R.navigation.basket,
                R.navigation.profile
        )
        binding.bottomNavigation.setupWithNavController(
                navGraphIds = navGraphId,
                fragmentManager = supportFragmentManager,
                containerId = R.id.bottomNavigation,
                intent = intent
        )
    }
}