package com.example.adele.ui.on_boarding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.adele.R

class FirstFragmentActivity : AppCompatActivity() {

    private var host: NavController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        host = Navigation.findNavController(this, R.id.firstFragment)
    }
}