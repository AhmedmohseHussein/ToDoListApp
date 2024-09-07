package com.example.todolistapp.activities

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.todolistapp.databinding.ActivityMainBinding
import com.example.todolistapp.models.UserViewModel

class MainActivity : AppCompatActivity() {
   lateinit var binding:ActivityMainBinding
   val userViewModel:UserViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        userViewModel.allUsers.observe(this, Observer {

        })
    }


}