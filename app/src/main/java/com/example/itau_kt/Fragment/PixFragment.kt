package com.example.itau_kt.Fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.itau_kt.R
import com.example.itau_kt.databinding.FragmentPixBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class PixFragment : Fragment() {

    private var binding: FragmentPixBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPixBinding.inflate(inflater,container,false)
        val view = binding!!.root

        Init()
        BackButtom()
        return view
    }
    private fun Init(){
        val menu = activity?.findViewById<BottomNavigationView>(R.id.bntNavigation)
        menu?.visibility = View.INVISIBLE
    }
    private fun BackButtom(){
        binding?.toolbarPIX?.setOnClickListener {
            val menu = activity?.findViewById<BottomNavigationView>(R.id.bntNavigation)
            menu?.visibility = View.VISIBLE
            requireActivity().onBackPressed()
        }
    }
}