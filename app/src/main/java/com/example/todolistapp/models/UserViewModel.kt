package com.example.todolistapp.models

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.todolistapp.repository.UserRepository
import com.example.todolistapp.data.AppDatabase
import com.example.todolistapp.data.UserData
import kotlinx.coroutines.launch

class UserViewModel(application:Application):AndroidViewModel(application) {
    private val repository:UserRepository
    val allUsers:LiveData<List<UserData>>

    init {
        val userDao= AppDatabase.getDatabase(application).userDao()
        repository=UserRepository(userDao)
        allUsers=repository.allUsers
    }
    fun insert(user:UserData)=viewModelScope.launch {
        repository.insertUser(user)
    }fun update(user:UserData)=viewModelScope.launch {
        repository.updateUser(user)
    }fun delete(user:UserData)=viewModelScope.launch {
        repository.deleteUser(user)
    }
}