package com.example.todolistapp.repository


import androidx.lifecycle.LiveData
import com.example.todolistapp.data.UserData

class UserRepository(private val userDao: UserDao) {

    val allUsers: LiveData<List<UserData>> = userDao.getAllUsers()

    suspend fun insertUser(user:UserData){
        userDao.insertUser(user)
    }
    suspend fun updateUser(user: UserData){
        userDao.updateUser(user)
    }
    suspend fun deleteUser(user: UserData){
        userDao.deleteUser(user)
    }
}