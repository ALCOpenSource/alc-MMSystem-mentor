package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.databinding.DiscussionsListItemBinding
import com.peculiaruc.alc_mmsystem_mentor.domain.DiscussionItem
import com.peculiaruc.alc_mmsystem_mentor.domain.ProgramItem

/**
 * Discussions adapter
 *
 * @property discussionList
 * @property listener
 * @property commentListener
 * @constructor Create empty Discussions adapter
 */
class DiscussionsAdapter(
    private val discussionList: List<DiscussionItem>,
    private val listener: OnDiscussionsClickListener,
    private val commentListener : OnCommentDiscussionsClickListener
) : RecyclerView.Adapter<DiscussionsAdapter.DiscussionsViewHolder>() {
    /**
     * Discussions view holder
     *
     * @property binding
     * @constructor Create empty Discussions view holder
     */
    inner class DiscussionsViewHolder(val binding: DiscussionsListItemBinding) : RecyclerView.ViewHolder(binding.root){

        fun bindItem(discussionItem: DiscussionItem){
            binding.tvDiscussionTime.text = discussionItem.time
            binding.tvDiscussionTitle.text = discussionItem.title
            binding.tvDiscussionDescription.text = discussionItem.description
            binding.discussionItemHeaderLayout.homeProfileGreeting.text = discussionItem.owner
            binding.ivEditDiscussion.setOnClickListener {
                listener.onClick(discussionItem)
            }
            binding.discussionItem.setOnClickListener {
                commentListener.onCommentClick(discussionItem)
            }
        }
    }

    interface OnDiscussionsClickListener{
        fun onClick(discussionItem: DiscussionItem)
    }

    interface OnCommentDiscussionsClickListener{
        fun onCommentClick(discussionItem: DiscussionItem)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiscussionsViewHolder {
        val binding = DiscussionsListItemBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return DiscussionsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DiscussionsViewHolder, position: Int) {
        val discussions = discussionList[position]
        holder.bindItem(discussions)
    }

    override fun getItemCount(): Int {
        return discussionList.size
    }
}