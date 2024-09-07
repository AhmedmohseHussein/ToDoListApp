package com.example.todolistapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todolistapp.R
import com.example.todolistapp.repository.MainRepository
import com.example.todolistapp.databinding.FragmentListBinding
import com.example.todolistapp.models.MyAdapter



class ListFragment : Fragment() {

   lateinit var binding:FragmentListBinding
    val repository:MainRepository by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding=FragmentListBinding.inflate(layoutInflater,container,false)
        return binding.root


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerView.apply {

            layoutManager= LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
            adapter=MyAdapter(repository.itemList,{
                    item->
                repository.itemList.remove(item.first)
                adapter?.notifyItemRemoved(item.second)
            },{repository.slectedItem=it
                findNavController().navigate(R.id.action_listFragment_to_detailsFragment)}

            )
            }
           /* adapter=userAdapter
            userAdapter.setData(repository.itemList)*/

            /*adapter=MyAdapter{
                itemList.remove(it.first)
                adapter?.notifyItemRemoved(it.second)
            }*/




            }
        }







   /* override fun onDestroy() {
        super.onDestroy()
        itemList.clear()
    }*/


