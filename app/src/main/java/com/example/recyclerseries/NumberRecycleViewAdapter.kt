package com.example.recyclerseries

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NumberRecycleViewAdapter(var numberList: List<Int>):RecyclerView.Adapter<NumberRecycleViewAdapter.NumberViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.number_list_item, parent, false)
        return NumberViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {

        holder.tvNum.text = numberList.get(position).toString()

    }

    override fun getItemCount(): Int {
        return numberList.size
    }

    class NumberViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNum= itemView.findViewById<TextView>(R.id.tvNum)

    }

}

