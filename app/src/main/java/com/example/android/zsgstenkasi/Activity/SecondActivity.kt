package com.example.android.zsgstenkasi.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.zsgstenkasi.R
import com.example.android.zsgstenkasi.Adapter.StudentAdapter
import com.example.android.zsgstenkasi.StudentData

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val recyclerView= findViewById<RecyclerView>(R.id.recyclerView)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        recyclerView.layoutManager = layoutManager

        val adapter = StudentAdapter(this, StudentData.student)
        recyclerView.adapter = adapter    }
}