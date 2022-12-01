package com.peculiaruc.alc_mmsystem_mentor.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.R

class NotificationAdapter(private val context: Context, var list: ArrayList<NotificationData>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        const val DATE_TYPE = 1
        const val MESSAGE_TYPE = 2
    }

    private inner class DateViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var date: TextView = itemView.findViewById(R.id.tvNotifDate)
        fun bind(position: Int) {
            val recyclerViewModel = list[position]
            date.text = recyclerViewModel.textData
        }
    }

    private inner class MessageViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var message: TextView = itemView.findViewById(R.id.tvNotifMessage)
        fun bind(position: Int) {
            val recyclerViewModel = list[position]
            message.text = recyclerViewModel.textData
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == DATE_TYPE) {
            DateViewHolder(
                LayoutInflater.from(context).inflate(R.layout.notif_date_view, parent, false)
            )
        } else {
            MessageViewHolder(
                LayoutInflater.from(context).inflate(R.layout.notif_message_view, parent, false)
            )
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (list[position].viewType == DATE_TYPE) {
            (holder as DateViewHolder).bind(position)
        } else {
            (holder as MessageViewHolder).bind(position)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return list[position].viewType
    }
}

