package com.example.roomdatabase

import androidx.room.Database
import androidx.room.RoomDatabase
@Database(
    entities = [StudentTable::class],
    version = 1
)
abstract class StudentDB: RoomDatabase() {
    abstract val dao: StudentDAO
}