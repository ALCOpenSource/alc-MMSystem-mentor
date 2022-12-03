package com.peculiaruc.alc_mmsystem_mentor.ui.managers.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.data.local.database.models.Manager
import com.peculiaruc.alc_mmsystem_mentor.databinding.ManagerItemBinding
import com.peculiaruc.alc_mmsystem_mentor.ui.managers.screens.ManagersFragmentDirections
import com.peculiaruc.alc_mmsystem_mentor.ui.messages.adapters.ChatListAdapter

/**
 * A [ManagersListAdapter] that manages the recyclerView for the selectProgramFragment.
 *
 * It implements the onBindViewHolder, the onCreateViewHolder and the getItemCount methods.
 */
class ManagersListAdapter(private val onManagerClicked: (Manager) -> Unit) :
    ListAdapter<Manager, ManagersListAdapter.ManagerViewHolder>(DiffCallBack) {

    /**
     * Holds the views for the adapter
     */
    class ManagerViewHolder(private var binding: ManagerItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        /**
         * Binds the managers views to the data
         */
        fun bind(manager: Manager) {
            binding.apply {
                managerName.text = manager.managerName
                managerTitle.text = manager.managerTitle
                messageManager.setOnClickListener {
                    val action =
                        ManagersFragmentDirections.actionMyManagersToChatFragment(manager.managerName)
                    itemView.findNavController().navigate(action)
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ManagerViewHolder {
        return ManagerViewHolder(
            ManagerItemBinding.inflate(
                LayoutInflater.from(parent.context)
            )
        )
    }

    override fun onBindViewHolder(holder: ManagerViewHolder, position: Int) {

        val current = getItem(position)

        holder.itemView.setOnClickListener {
            onManagerClicked(current)
        }
        holder.bind(current)
    }

    companion object {

        private val DiffCallBack = object : DiffUtil.ItemCallback<Manager>() {

            override fun areItemsTheSame(oldItem: Manager, newItem: Manager): Boolean {
                return oldItem === newItem
            }

            override fun areContentsTheSame(oldItem: Manager, newItem: Manager): Boolean {
                return oldItem.managerName == newItem.managerName
            }

        }

    }

}