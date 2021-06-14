package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.provider.CallLog.Calls.NEW
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView

import kotlinx.android.synthetic.main.list_item.view.*

class SubjectsAdapter(
    val context: Context,
    val subjects: List<Subject>
) : RecyclerView.Adapter<SubjectsAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener {

        var currentSubject: Subject? = null
        var currentPosition: Int = 0

        init {

            itemView.setOnClickListener {
                if (currentPosition == 0)
                      {
                            val intent = Intent(itemView.context, EngYear::class.java)
                            itemView.context.startActivity(intent)
                        }

            }
        }
        fun setData(subject: Subject?, position: Int) {
         itemView.txvTitle.text = subject!!.Title

            this.currentSubject = subject
            this.currentPosition = position
        }

        override fun onClick(v: View?) {
            val position: Int = absoluteAdapterPosition
            //listener.onItemClick(position)
        }

    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
     val view =  LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(view)

    }

    override fun getItemCount(): Int {

        return subjects.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val subject = subjects[position]
        holder.setData(subject, position)
    }
}