package com.example.demoframelayoutnavigation.home.ui

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.dynamicfeatures.fragment.DynamicNavHostFragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.demoframelayoutnavigation.*
import com.example.demoframelayoutnavigation.common.utils.NavigationUtils





// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    lateinit var navController :NavController;
    lateinit var  homeHostFragment: NavHostFragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("HomeCreate", "This is my HomeCreate called");
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       homeHostFragment  = childFragmentManager.findFragmentById(R.id.homeHost) as NavHostFragment
        navController = homeHostFragment.navController
        navController.setGraph(R.navigation.homenavigation, null)
        navController.addOnDestinationChangedListener(this)
        navController.navigate(R.id.action_homeFragment_to_homeDetailFragment)
        requireActivity().actionBar?.title="HomeDetailPage"
       super.onViewCreated(view, savedInstanceState)
   }

    override fun onResume() {
        Log.d("HomeResume", "This is my HomeResume called");
        super.onResume()

    }

    override fun onPause() {
        Log.d("HomePause", "This is my HomePause called");
        super.onPause()
    }

    override fun onDestroy() {
        Log.d("HomeDestory", "This is my HomeDestory called");
        super.onDestroy()
    }

    override fun onStop() {
        Log.d("HomeStop", "This is my HomeStop called");
        super.onStop()
    }


    companion object {
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}

private fun NavController.addOnDestinationChangedListener(listener: HomeFragment) {

}








