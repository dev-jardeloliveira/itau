package com.example.itau_kt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.itau_kt.Model.KeyboardPassword
import com.example.itau_kt.ViewModel.publicViewModel
import com.example.itau_kt.databinding.ActivityPublicBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class PublicActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    lateinit var binding: ActivityPublicBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPublicBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)
        var navHostController = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
       navController = navHostController.navController
        val bottoNavigatioView = findViewById<BottomNavigationView>(R.id.bntNavigation)
        NavigationUI.setupWithNavController(bottoNavigatioView, navController)


    }



}




