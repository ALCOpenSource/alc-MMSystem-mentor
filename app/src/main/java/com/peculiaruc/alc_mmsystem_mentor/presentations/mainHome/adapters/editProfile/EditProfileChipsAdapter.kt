package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.editProfile

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil.Callback
import androidx.recyclerview.widget.DiffUtil.calculateDiff
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.databinding.EditProfileChipListItemLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.UiData

object EditProfileChipsAdapter {


    class Adapter(private val onItemClick: (String) -> Unit) : RecyclerView.Adapter<ViewHolder>() {

        private val recyclingItems: MutableList<String> = mutableListOf()
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

            return ViewHolder(
                EditProfileChipListItemLayoutBinding.inflate(
                    LayoutInflater.from(
                        parent.context
                    )
                )
            )
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind(recyclingItems[position], onItemClick)
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

    class ViewHolder(private val binding: EditProfileChipListItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: String, onItemClick: (String) -> Unit) {

            binding.root.setOnClickListener { onItemClick(item) }
            binding.root.text = item

        }

    }


}