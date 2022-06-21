package com.example.demoframelayoutnavigation.common.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBar
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.demoframelayoutnavigation.R
import com.example.demoframelayoutnavigation.common.adapter.MainViewPageAdapter
import com.example.demoframelayoutnavigation.databinding.FragmentMainViewpagerBinding
import com.example.demoframelayoutnavigation.home.ui.HomeFragment
import com.example.demoframelayoutnavigation.portfolio.Portfolio
import com.example.demoframelayoutnavigation.profile.AccountsFragment
import com.example.demoframelayoutnavigation.watchlist.WatchlistFragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class MainViewpagerFragment : Fragment() {
    // TODO: Rename and change types of parameters
    lateinit var binding:FragmentMainViewpagerBinding
    lateinit var navHostFragment:NavHostFragment
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentMainViewpagerBinding.inflate(layoutInflater, container, false)
        return binding.root;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val fragmentList= listOf<Fragment>(
            HomeFragment(),
            WatchlistFragment(),
            Portfolio(),
            AccountsFragment()
        );
        binding.viewPager.adapter= MainViewPageAdapter(requireActivity(),fragmentList)
        binding.viewPager.isUserInputEnabled=false


        super.onViewCreated(view, savedInstanceState)

        binding.mainBottomNav.setOnItemSelectedListener { item->
            when(item.itemId) {
                R.id.sparkFlutterFragment -> {
                    binding.viewPager.setCurrentItem(0)
                  requireActivity().actionBar ?.title="Home"

                }
                R.id.watchListActivitiesFragment -> {
                    binding.viewPager.setCurrentItem(1)
                    requireActivity(). actionBar?.title="Watchlist"

                }
                R.id.ordersHoldingFragment -> {
                    binding.viewPager.setCurrentItem(2)
                    requireActivity(). actionBar?.title="Portfolip"


                }
                R.id.accountFragment -> {
                    binding.viewPager.setCurrentItem(3)
                    requireActivity(). actionBar?.title="Acconts"

                }
            }
            true
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MianViewpagerFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MainViewpagerFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}