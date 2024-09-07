package com.example.todolistapp.fragments

import android.content.Context.MODE_PRIVATE
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.activityViewModels
import com.example.todolistapp.repository.MainRepository
import com.example.todolistapp.databinding.FragmentDetailsBinding



class DetailsFragment : Fragment() {

    lateinit var binding:FragmentDetailsBinding
    val repository: MainRepository by activityViewModels()

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding=FragmentDetailsBinding.inflate(layoutInflater,container,false)
        return binding.root

    }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.detailsData=repository.slectedItem
        val sharedPreference= requireContext().getSharedPreferences("MyPref",MODE_PRIVATE)

    }
}