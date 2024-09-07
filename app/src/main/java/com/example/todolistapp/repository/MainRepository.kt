package com.example.todolistapp.repository


import androidx.lifecycle.ViewModel
import com.example.todolistapp.data.UserData

class MainRepository: ViewModel() {

var slectedItem: UserData?=null
 var itemList: MutableList<UserData> = mutableListOf(
    /* UserData(0,  "Ahmed Mohsen", "ahmedMohsen@gmail.come",1, "0102456700"),
     UserData(1,  "Ahmed Mohsen", "ahmedMohsen@gmail.come",2, "01024567000"),
     UserData(2,  "Ahmed Mohsen", "ahmedMohsen@gmail.come",1, "01024567000"),
     UserData(2,  "Ahmed Mohsen", "ahmedMohsen@gmail.come",2, "01024567000"),
     UserData(4,  "Ahmed Mohsen", "ahmedMohsen@gmail.come",1, "01024567000"),
     UserData(5,  "Ahmed Mohsen", "ahmedMohsen@gmail.come",2, "01024567000"),
     UserData(6,  "Ahmed Mohsen", "ahmedMohsen@gmail.come",1, "01024567000"),
     UserData(7,  "Ahmed Mohsen", "ahmedMohsen@gmail.come",2, "01024567000"),*/
 )

    fun addData(user: UserData){
       itemList.add(user)
    }
}