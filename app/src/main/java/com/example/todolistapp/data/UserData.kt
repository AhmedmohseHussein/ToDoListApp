package com.example.todolistapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "user_table")
data class UserData(@PrimaryKey(autoGenerate = true) val id:Int?,
                    val name:String,
                    val mail:String,
                    val type:Int,
                    val phone:String)



