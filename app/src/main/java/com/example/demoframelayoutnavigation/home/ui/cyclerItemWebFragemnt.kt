package com.example.demoframelayoutnavigation.home.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.demoframelayoutnavigation.R
import com.example.demoframelayoutnavigation.databinding.FragmentCyclerItemWebFragemntBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [cyclerItemWebFragemnt.newInstance] factory method to
 * create an instance of this fragment.
 */
class cyclerItemWebFragemnt : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var  binding :FragmentCyclerItemWebFragemntBinding

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
        binding= FragmentCyclerItemWebFragemntBinding.inflate(layoutInflater)
        Log.d("WebCreate", "This is my WebCreate called");
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.itemWebView.loadUrl("https://www.google.in")
    }



    override fun onResume() {
        Log.d("WebResume", "This is my WebResume called");
        super.onResume()
    }

    override fun onPause() {
        Log.d("WebPause", "This is my WebPause called");
        super.onPause()
    }

    override fun onDestroy() {
        Log.d("WebDestory", "This is my WebDestory called");
        super.onDestroy()
    }

    override fun onStop() {
        Log.d("WebStop", "This is my WebStop called");
        super.onStop()
    }

    companion object {

        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            cyclerItemWebFragemnt().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}