package com.example.roomdatabase

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
@Dao
interface StudentDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertStudent(student: StudentTable)
    @Query("SELECT * FROM student")
    fun getAllStudents(): List<StudentTable>
    @Query("Delete from student where id = :stud")
    fun deleteStudent(stud : Int)
}