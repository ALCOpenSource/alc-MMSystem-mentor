package com.peculiaruc.alc_mmsystem_mentor.ui.messages.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.data.local.database.models.Message
import com.peculiaruc.alc_mmsystem_mentor.databinding.MessageItemBinding

/**
 * A [MessageListAdapter] that manages the recyclerView for the selectProgramFragment.
 *
 * It implements the onBindViewHolder, the onCreateViewHolder and the getItemCount methods.
 */
class MessageListAdapter:
    ListAdapter<Message, MessageListAdapter.MessageViewHolder>(DiffCallBack) {

    /**
     * Holds the views for the adapter
     */
    class MessageViewHolder(
        private var binding: MessageItemBinding,

        ) :
        RecyclerView.ViewHolder(binding.root) {

        /**
         * Binds the message views to the data
         */
        fun bind(message: Message) {

            binding.apply {
                messageBody.text = message.messageBody
                timeSent.text = message.timeSent
            }

            if (message.messageType == "sent" && message.isSeen == true) {
                binding.doubleTick.visibility = View.VISIBLE
                binding.singleTick.visibility = View.GONE
                binding.message.layoutDirection = View.LAYOUT_DIRECTION_RTL
            }

            if (message.messageType == "sent" && message.isSeen == false) {
                binding.doubleTick.visibility = View.GONE
                binding.singleTick.visibility = View.VISIBLE
                binding.message.layoutDirection = View.LAYOUT_DIRECTION_RTL
            }

            if (message.messageType == "received") {
                binding.singleTick.visibility = View.GONE
                binding.doubleTick.visibility = View.GONE
                binding.message.layoutDirection = View.LAYOUT_DIRECTION_LTR
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {

        return MessageViewHolder(
            MessageItemBinding.inflate(
                LayoutInflater.from(parent.context),
            ),
        )

    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {

        val current = getItem(position)
        holder.bind(current)

    }

    companion object {

        private val DiffCallBack = object : DiffUtil.ItemCallback<Message>() {

            override fun areItemsTheSame(oldItem: Message, newItem: Message): Boolean {
                return oldItem === newItem
            }

            override fun areContentsTheSame(oldItem: Message, newItem: Message): Boolean {
                return oldItem.messageId == newItem.messageId
            }

        }

    }

}