package com.example.roomdatabase

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "student")
data class StudentTable(
    val name: String,
    val email: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)
