package com.example.android.zsgstenkasi.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.android.zsgstenkasi.R

class StudentDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_details)
        val nameText:TextView = findViewById(R.id.name)
        nameText.text=intent.getStringExtra("name")

        val contact:TextView = findViewById(R.id.contact)
        contact.text = intent.getStringExtra("phone")

        val emailId:TextView = findViewById(R.id.email)
        emailId.text = intent.getStringExtra("email")
    }
}
