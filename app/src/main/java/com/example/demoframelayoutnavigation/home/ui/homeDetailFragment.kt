package com.example.demoframelayoutnavigation.home.ui

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.demoframelayoutnavigation.R
import com.example.demoframelayoutnavigation.common.utils.NavigationUtils
import com.example.demoframelayoutnavigation.databinding.FragmentHomeDetailBinding
import com.example.demoframelayoutnavigation.profile.AccountsFragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [homeDetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class homeDetailFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var navController: NavController
    lateinit var binding :FragmentHomeDetailBinding;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentHomeDetailBinding.inflate(layoutInflater, container, false)
        Log.d("HomeDetailCreate", "This is my HomeDetailCreate called");
        return binding.root
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController= Navigation.findNavController(view)
        binding.aboutUsCV.setOnClickListener({
            findNavController().navigate(R.id.action_homeDetailFragment_to_accountsFragment2)
            requireActivity().actionBar?.title="RecyclerView"

        })
    }

    override fun onResume() {
        Log.d("HomeDetailResume", " HomeDetailResume called");
        super.onResume()
    }

    override fun onPause() {
        Log.d("HomeDetailPause", "This is my HomeDetailPause called");
        super.onPause()
    }

    override fun onDestroy() {
        Log.d("HomeDetailDestory", "This is my HomeDetailDestory called");
        super.onDestroy()
    }

    override fun onStop() {
        Log.d("HomeDetailStop", "This is my HomeDetailStop called");
        super.onStop()
    }

    companion object {
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            homeDetailFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}