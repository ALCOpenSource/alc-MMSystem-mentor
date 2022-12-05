package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.databinding.NotificationsListItemBinding
import com.peculiaruc.alc_mmsystem_mentor.databinding.ProgramsListItemBinding
import com.peculiaruc.alc_mmsystem_mentor.domain.NotificationItem
import com.peculiaruc.alc_mmsystem_mentor.domain.ProgramItem

/**
 * Notifications adapter
 *
 * @property notificationsList
 * @constructor Create empty Notifications adapter
 */
class NotificationsAdapter(
    private val notificationsList: List<NotificationItem>
) : RecyclerView.Adapter<NotificationsAdapter.NotificationsViewHolder>(){

    /**
     * Notifications view holder
     *
     * @property binding
     * @constructor Create empty Notifications view holder
     */
    inner class NotificationsViewHolder(val binding: NotificationsListItemBinding)  : RecyclerView.ViewHolder(binding.root){
        /**
         * Bind item
         *
         * @param notificationItem
         */
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