package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.databinding.NotificationsListItemBinding
import com.peculiaruc.alc_mmsystem_mentor.databinding.ProgramsListItemBinding
import com.peculiaruc.alc_mmsystem_mentor.domain.NotificationItem
import com.peculiaruc.alc_mmsystem_mentor.domain.ProgramItem

class NotificationsAdapter(
    private val notificationsList: List<NotificationItem>
) : RecyclerView.Adapter<NotificationsAdapter.NotificationsViewHolder>(){


    inner class NotificationsViewHolder(val binding: NotificationsListItemBinding)  : RecyclerView.ViewHolder(binding.root){
        fun bindItem(notificationItem: NotificationItem){
            binding.tvNotificationsTitle.text = notificationItem.title
            binding.tvNotificationsTime.text = notificationItem.time
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationsViewHolder {
        val binding = NotificationsListItemBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return NotificationsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NotificationsViewHolder, position: Int) {
        val programs = notificationsList[position]
        holder.bindItem(programs)
    }

    override fun getItemCount(): Int {
        return notificationsList.size
    }
}