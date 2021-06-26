package com.example.myapplication

import android.content.Intent
import android.graphics.ColorSpace
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class MainActivity2Adapter(
    val list:List<Picture>
): RecyclerView.Adapter<MainActivity2Adapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tv:TextView = itemView.findViewById(R.id.tvTitle)
        val image:ImageView = itemView.findViewById(R.id.ivImage)

        var currentPicture: Picture? = null
        var currentPosition: Int = 0

        init {

            itemView.setOnClickListener {
                if (currentPosition == 0)
                {
                    var mUserName: String?

                    val intent = Intent(itemView.context, Subjects::class.java)
                    mUserName = intent.getStringExtra(Eng2010Constants.USER_NAME)
                    intent.putExtra(Eng2010Constants.USER_NAME, mUserName)
                    itemView.context.startActivity(intent)
                }

            }
        }
        fun setData(item: Picture?, position: Int) {
            this.currentPicture = item
            this.currentPosition = position
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item2, parent, false)

        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = list[position]
        holder.apply {
            tv.text = item.name
            image.setImageResource(item.Image)
            setData(item, position)
        }
    }
}