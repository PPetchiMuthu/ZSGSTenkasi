package com.example.android.zsgstenkasi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class StudentAdapter(val context: Context, val student: List<Student>): RecyclerView.Adapter<StudentAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun setData(student: Student, position: Int) {
            val titleTextView = itemView.findViewById<TextView>(R.id.txtTitle)
            titleTextView.text = student.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val student = student[position]
        holder.setData(student,position)
    }

    override fun getItemCount(): Int {
        return student.size
    }
}