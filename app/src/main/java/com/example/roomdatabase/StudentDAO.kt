package com.example.roomdatabase

import androidx.room.Insert
import androidx.room.Query

interface StudentDAO {
    @Insert
    fun insertStudent(student: StudentTable)
    @Query("SELECT * FROM student")
    fun getAllStudents(): List<StudentTable>
}