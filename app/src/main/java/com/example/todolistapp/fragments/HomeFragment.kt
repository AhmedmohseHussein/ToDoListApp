package com.example.todolistapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.todolistapp.R
import com.example.todolistapp.repository.MainRepository
import com.example.todolistapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    lateinit var binding:FragmentHomeBinding
    val repository:MainRepository by activityViewModels()
    lateinit var id:String
    lateinit var name:String
    lateinit var mail:String
    lateinit var phone:String
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

       binding=  FragmentHomeBinding.inflate(layoutInflater,container,false)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            loginPage.edit0.doAfterTextChanged {
                id=loginPage.edit0.text.toString()
            }

            loginPage.edit1.doAfterTextChanged {
                name=loginPage.edit1.text.toString()
            }

            loginPage.edit2.doAfterTextChanged {
                mail=loginPage.edit2.text.toString()
            }
            loginPage.edit3.doAfterTextChanged {
                phone=loginPage.edit3.text.toString()
            }

           fab.setOnClickListener{


               /*repository.addData(UserData(id.toInt(),name,mail,1,phone))*/

           }

            loginPage.login.setOnClickListener{
                findNavController().navigate(R.id.action_homeFragment_to_listFragment,
                    bundleOf("list" to repository.itemList)
                )
            }
        }



       /*binding.apply {


          loginPage.login.setOnClickListener(){
               findNavController().navigate(
                   R.id.action_blankFragment_to_blankFragment2, bundleOf(

               ))
           }

        *//*text1fragment1.setOnClickListener(){

               findNavController().navigate(R.id.blankFragment2)
           }*//*
       }*/

    }

}
