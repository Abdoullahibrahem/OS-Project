package com.projects.healthzone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.projects.healthzone.databinding.FragmentCalculatorBinding

class CalculatorFragment : Fragment() {
    private lateinit var binding: FragmentCalculatorBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentCalculatorBinding.inflate(inflater,container,false)



        return binding.root
    }


}