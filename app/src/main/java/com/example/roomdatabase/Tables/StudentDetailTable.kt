package com.example.roomdatabase.Tables

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "studentDetail")
data class StudentDetailTable(
    val studId: Int,
    val phoneNumber: Long,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)
