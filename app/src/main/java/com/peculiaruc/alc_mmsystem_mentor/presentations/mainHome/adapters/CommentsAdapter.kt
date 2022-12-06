package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.databinding.CommentsListItemBinding
import com.peculiaruc.alc_mmsystem_mentor.domain.CommentItem

/**
 * Comments adapter
 *
 * @property commentsList
 * @constructor Create empty Comments adapter
 */
class CommentsAdapter(
    private val commentsList: List<CommentItem>
) : RecyclerView.Adapter<CommentsAdapter.CommentViewHolder>() {
    /**
     * Comment view holder
     *
     * @property binding
     * @constructor Create empty Comment view holder
     */
    inner class CommentViewHolder(val binding: CommentsListItemBinding) : RecyclerView.ViewHolder(binding.root){
        /**
         * Bind item
         *
         * @param commentItem
         */
        fun bindItem(commentItem: CommentItem){
            binding.tvCommentOwner.text = commentItem.owner
            binding.tvCommentDescription.text =commentItem.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentViewHolder {
        val binding = CommentsListItemBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return CommentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CommentViewHolder, position: Int) {
        val comments = commentsList[position]
        holder.bindItem(comments)
    }

    override fun getItemCount(): Int {
        return commentsList.size
    }

}