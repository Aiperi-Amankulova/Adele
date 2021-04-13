package com.example.adele.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.adele.R
import com.example.adele.utils.extensions.setupWithNavController
import com.example.adele.utils.extensions.showLightStatusBar
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupBottomView()
        showLightStatusBar()
    }

    private fun setupBottomView() {
        val navView = findViewById<BottomNavigationView>(R.id.bottomNavigation)

        val navIds = listOf(
                R.navigation.home,
                R.navigation.catalog,
                R.navigation.basket,
                R.navigation.profile
        )
        navView.setupWithNavController(
                navGraphIds = navIds,
                fragmentManager = supportFragmentManager,
                containerId = R.id.navView,
                intent = intent
        )
    }
}