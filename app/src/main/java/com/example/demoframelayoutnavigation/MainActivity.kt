package com.example.demoframelayoutnavigation

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.dynamicfeatures.fragment.DynamicNavHostFragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.example.demoframelayoutnavigation.common.adapter.MainViewPageAdapter
import com.example.demoframelayoutnavigation.common.utils.NavigationUtils
import com.example.demoframelayoutnavigation.databinding.ActivityMainBinding
import com.example.demoframelayoutnavigation.databinding.FragmentHomeDetailBinding
import com.example.demoframelayoutnavigation.home.ui.HomeCyclerFragemnt
import com.example.demoframelayoutnavigation.home.ui.HomeFragment
import com.example.demoframelayoutnavigation.home.ui.cyclerItemWebFragemnt
import com.example.demoframelayoutnavigation.home.ui.homeDetailFragment
import com.example.demoframelayoutnavigation.portfolio.Portfolio
import com.example.demoframelayoutnavigation.profile.AccountsFragment
import com.example.demoframelayoutnavigation.watchlist.WatchlistFragment


class MainActivity : AppCompatActivity() {

  lateinit var   binding :ActivityMainBinding;
    var _navUtils=NavigationUtils()
   lateinit var navHostFragment :NavHostFragment
    lateinit var  navController: NavController

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val actionBar: ActionBar?
        actionBar = supportActionBar

        navHostFragment = supportFragmentManager
            .findFragmentById(R.id.mainHost) as NavHostFragment
        navController = navHostFragment.navController
        //navController?.let { setupActionBarWithNavContr
        val colorDrawable = ColorDrawable(Color.parseColor(getString(R.color.disabled_grey)))
        actionBar?.setBackgroundDrawable(colorDrawable)
        actionBar?.title="Home"

    }

    override fun onBackPressed() {

        findNavController(R.id.homeHost).popBackStack()
      //  super.onBackPressed()
    }





}