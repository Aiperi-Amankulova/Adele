package com.example.adele

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpBottomView()
    }


    private fun setUpBottomView() {
        val navView = findViewById<BottomNavigationView>(R.id.bottomNav)

        val navIds = listOf(
            R.navigation.home,
            R.navigation.catalog,
            R.navigation.basket,
            R.navigation.profile
        )

        navView.run {

            setupWithNavController(
            navGraphIds = navIds,
            fragmentManager = supportFragmentManager,
            containerId = R.id.navView,
            intent = intent
        )
        }
    }
}