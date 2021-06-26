package com.example.myapplication

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class EngYearAdapter(
    val list: List<ModelEngYear>
): RecyclerView.Adapter<EngYearAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val yr: TextView = itemView.findViewById(R.id.EngYearTitle)

        var currentModelEngYear: ModelEngYear? = null
        var currentPosition: Int = 0

        init {

            var mUserName: String? = null

            itemView.setOnClickListener {
                if (currentPosition == 0)
                {
                    val intent = Intent(itemView.context, EngObjEssay::class.java)
                    mUserName = intent.getStringExtra(Eng2010Constants.USER_NAME)
                    intent.putExtra(Eng2010Constants.USER_NAME, mUserName)
                    itemView.context.startActivity(intent)
                }

            }
        }

        fun setData(item: ModelEngYear?, position: Int) {
            this.currentModelEngYear = item
            this.currentPosition = position
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.eng_year_list_item, parent, false)

        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = list[position]
        holder.apply {
            yr.text = item.title
            setData(item, position)
        }
    }
}