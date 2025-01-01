package com.example.roomdatabase

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.roomdatabase.Tables.StudentDetailTable
import com.example.roomdatabase.Tables.StudentTable

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val db = DBHolder.getInstance(this)
        findViewById<Button>(R.id.btInsertTable).setOnClickListener {
            val id = db.dao.insertStudent(StudentTable("ch Rehan", "mahi1009@gmail"))
            db.dao.insertStudent(StudentDetailTable(id.toInt(), 7))
        }

    }
}