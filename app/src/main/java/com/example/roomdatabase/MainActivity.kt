package com.example.roomdatabase

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val db = DBHolder.getInstance(this)
        findViewById<Button>(R.id.btInsertTable).setOnClickListener {
            db.dao.updateStudent("Aliya", 1)
            println( db.dao.getAllStudents())
        }

    }
}