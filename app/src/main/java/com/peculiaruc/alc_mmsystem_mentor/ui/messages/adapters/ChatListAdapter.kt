package com.peculiaruc.alc_mmsystem_mentor.ui.messages.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.data.local.database.models.Chat
import com.peculiaruc.alc_mmsystem_mentor.databinding.ChatItemBinding

/**
 * A [ChatListAdapter] that manages the recyclerView for the selectProgramFragment.
 *
 * It implements the onBindViewHolder, the onCreateViewHolder and the getItemCount methods.
 */
class ChatListAdapter(private val onChatClicked: (Chat) -> Unit) :
    ListAdapter<Chat, ChatListAdapter.ChatViewHolder>(DiffCallBack) {

    /**
     * Holds the views for the adapter
     */
    class ChatViewHolder(private var binding: ChatItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        /**
         * Binds the chats views to the data
         */
        fun bind(chat: Chat) {
            val displayMessage = chat.messages.last().messageBody.take(25) + "..."
            val displayTimeSent = chat.messages.last().timeSent

            binding.apply {
                chatHeader.text = chat.chatOwner
                chatBody.text = displayMessage
                timeElapsed.text = displayTimeSent
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {

        return ChatViewHolder(
            ChatItemBinding.inflate(
                LayoutInflater.from(parent.context)
            )
        )

    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {

        val current = getItem(position)

        holder.itemView.setOnClickListener {
            onChatClicked(current)
        }
        holder.bind(current)

    }

    companion object {

        private val DiffCallBack = object : DiffUtil.ItemCallback<Chat>() {

            override fun areItemsTheSame(oldItem: Chat, newItem: Chat): Boolean {
                return oldItem === newItem
            }

            override fun areContentsTheSame(oldItem: Chat, newItem: Chat): Boolean {
                return oldItem.chatOwner == newItem.chatOwner
            }

        }

    }

}