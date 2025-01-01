package com.example.roomdatabase

import android.content.Context
import androidx.room.Room


object DBHolder {
    fun getInstance(context :Context): StudentDB {
        val db = Room.databaseBuilder(
            context,
            StudentDB::class.java, "StudentDB"
        ).allowMainThreadQueries().build()
        return db
    }
}