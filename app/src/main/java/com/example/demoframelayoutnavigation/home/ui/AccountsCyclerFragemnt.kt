package com.example.demoframelayoutnavigation.home.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demoframelayoutnavigation.R
import com.example.demoframelayoutnavigation.common.utils.NavigationUtils
import com.example.demoframelayoutnavigation.databinding.FragmentAccountsBinding
import com.example.demoframelayoutnavigation.databinding.FragmentHomeCyclerFragemntBinding
import com.example.demoframelayoutnavigation.home.`interface`.ItemClick
import com.example.demoframelayoutnavigation.home.data.RecyclerData
import com.example.demoframelayoutnavigation.home.viewModel.RecyclerAdapter

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeCyclerFragemnt.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeCyclerFragemnt : Fragment(),ItemClick {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
   lateinit var binding :FragmentHomeCyclerFragemntBinding
   lateinit var navigationUtils : NavigationUtils


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentHomeCyclerFragemntBinding.inflate(layoutInflater)
        navigationUtils= NavigationUtils()
        Log.d("CyclerCreate", "This is my CyclerCreate called");
        return binding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerview.layoutManager=LinearLayoutManager(requireContext())
         val data =  ArrayList<RecyclerData>()
        for(i in 1..3000){
            data.add(RecyclerData(R.drawable.ic_account_migration,"account" +i))
        }

        val adapter =RecyclerAdapter(data,this)
        binding.recyclerview.adapter=adapter

        binding.recyclerview.setOnClickListener {
       //     navigationUtils.replaceFragment(R.id.homeHost,cyclerItemWebFragemnt(),requireActivity().supportFragmentManager)
        }


    }


    override fun onResume() {
        Log.d("CyclerResume", "This is my CyclerResume called");
        super.onResume()
    }
    override fun onPause() {
        Log.d("CyclerPause", "This is my CyclerPause called");
        super.onPause()
    }

    override fun onDestroy() {
        Log.d("CyclerDestory", "This is my CyclerDestory called");
        super.onDestroy()
    }

    override fun onStop() {
        Log.d("CyclerStop", "This is my CyclerStop called");
        super.onStop()
    }

    companion object {

        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeCyclerFragemnt().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onClick( position: Int) {
        //navigationUtils.replaceFragment(R.id.homeHost,cyclerItemWebFragemnt(),requireActivity().supportFragmentManager)na
        findNavController().navigate(R.id.action_homeCyclerFragemnt_to_cyclerItemWebFragemnt)
        requireActivity().actionBar?.title="HomeWebView"
    }
}


