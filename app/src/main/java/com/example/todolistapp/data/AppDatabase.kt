package com.example.todolistapp.data

import android.content.Context
import android.service.autofill.UserData
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.todolistapp.repository.UserDao

@Database(entities = [UserData::class], version = 1, exportSchema = false)
abstract class AppDatabase:RoomDatabase() {

    abstract fun userDao(): UserDao

    companion object{

        private val instance: AppDatabase?=null
        fun getDatabase(context:Context): AppDatabase {

            return instance ?: synchronized(this){
                val instance= Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "user_database"
                ).fallbackToDestructiveMigration().build()
                instance
            }
        }
    }
}