package com.example.android.zsgstenkasi.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.zsgstenkasi.Activity.StudentDetails
import com.example.android.zsgstenkasi.Adapter.StudentAdapter.MyViewHolder
import com.example.android.zsgstenkasi.R
import com.example.android.zsgstenkasi.Student


class StudentAdapter(val context: Context, val student: List<Student>): RecyclerView.Adapter<MyViewHolder>() {

    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        private val titleTextView = itemView.findViewById<TextView>(R.id.txtTitle)
        fun setData(student: Student, position: Int) {
            titleTextView.text = student.name
        }
        init {
            itemView.setOnClickListener {
                val pos = this.adapterPosition
                val intent= Intent(context, StudentDetails::class.java)
                intent.putExtra("name",student[pos].name)
                intent.putExtra("phone",student[pos].phone)
                intent.putExtra("email",student[pos].emailId)
                context.startActivity(intent)
            }
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

