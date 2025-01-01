package com.example.roomdatabase

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.roomdatabase.Tables.StudentDetailTable
import com.example.roomdatabase.Tables.StudentTable

@Dao
interface StudentDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertStudent(student: StudentTable) : Long
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertStudent(student: StudentDetailTable)
    @Query("SELECT * FROM student")
    fun getAllStudents(): List<StudentTable>
    @Query("Delete from student where id = :stud")
    fun deleteStudent(stud : Int)
    @Query("Update student set name = :nameSt where id = :idSt")
    fun updateStudent(nameSt: String, idSt: Int)
}