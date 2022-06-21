package com.example.demoframelayoutnavigation.common.utils

import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.NavController
import com.example.demoframelayoutnavigation.home.ui.homeDetailFragment

class NavigationUtils {

    public fun addFragment(mainframe: Int, fragment: Fragment,manager: FragmentManager) {
        val transaction=manager.beginTransaction()
        transaction.add(mainframe,fragment)
        transaction.commitAllowingStateLoss()
    }

    public fun replaceFragment(mainframe: Int, fragment: Fragment,manager: FragmentManager) {
        val transaction=manager.beginTransaction()
        transaction.replace(mainframe,fragment)
        transaction.commit()
    }


    fun NavController.navigateTo(currentDestination: Int, action_id: Int, bundle: Bundle? = null) {
        try {
            if (this.currentDestination?.id == currentDestination) {
                if (bundle != null) {
                    this.navigate(action_id, bundle)
                } else {
                    this.navigate(action_id)
                }
            }
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }
}


