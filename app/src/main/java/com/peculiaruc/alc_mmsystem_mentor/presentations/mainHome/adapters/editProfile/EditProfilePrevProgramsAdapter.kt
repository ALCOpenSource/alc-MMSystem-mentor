package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.editProfile

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil.Callback
import androidx.recyclerview.widget.DiffUtil.calculateDiff
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.EditProfilePrevProgramsListItemLayoutBinding

object EditProfilePrevProgramsAdapter {


    class Adapter(private val onRemove: (String) -> Unit) :
        RecyclerView.Adapter<ViewHolder>() {

        private val recyclingItems: MutableList<String> = mutableListOf()
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

            return ViewHolder(
                EditProfilePrevProgramsListItemLayoutBinding.bind(
                    LayoutInflater.from(
                        parent.context
                    ).inflate(R.layout.edit_profile_prev_programs_list_item_layout, parent, false).apply {
                        layoutParams = ViewGroup.LayoutParams(
                            ViewGroup.LayoutParams.MATCH_PARENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT
                        )
                    }
                )
            )
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind(recyclingItems[position], onRemove)
        }

        override fun getItemCount(): Int = recyclingItems.size

        fun add(_newItems: MutableList<String>) {
            calculateDiff(DiffUtil(_newItems, recyclingItems)).dispatchUpdatesTo(this)
            recyclingItems.clear()
            recyclingItems.addAll(_newItems)
        }

        private inner class DiffUtil(private val _new: MutableList<String>, private val _old: MutableList<String>) :
            Callback() {
            override fun getOldListSize(): Int = _old.size

            override fun getNewListSize(): Int = _new.size

            override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
                _old[oldItemPosition] == _new[newItemPosition]

            override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
                _old[oldItemPosition] == _new[newItemPosition]
        }

    }

    class ViewHolder(private val binding: EditProfilePrevProgramsListItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: String, onRemove: (String) -> Unit) {

            binding.editProfilePrevProgramsInput.text = item
            binding.editProfilePrevProgramsRemove.setOnClickListener { onRemove(item) }

        }

    }

}