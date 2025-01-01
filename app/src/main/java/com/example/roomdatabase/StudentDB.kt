package com.example.roomdatabase

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.roomdatabase.Tables.StudentDetailTable
import com.example.roomdatabase.Tables.StudentTable

@Database(
    entities = [StudentTable::class, StudentDetailTable::class],
    version = 1
)
abstract class StudentDB: RoomDatabase() {
    abstract val dao: StudentDAO
}