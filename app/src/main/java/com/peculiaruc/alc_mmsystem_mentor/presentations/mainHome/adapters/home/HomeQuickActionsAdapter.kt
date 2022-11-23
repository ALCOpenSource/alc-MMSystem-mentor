package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.databinding.BtmHomeQuickActionsListItemBinding
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.NavItems

class HomeQuickActionsAdapter {

    class Adapter(private val onItemClick: (NavItems) -> Unit) :
        RecyclerView.Adapter<ViewHolder>() {

        private val quickActions: MutableList<NavItems> = mutableListOf()

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val binding = BtmHomeQuickActionsListItemBinding.inflate(
                LayoutInflater.from(
                    parent.context
                )
            )
            return ViewHolder(binding)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind(holder.itemView.context, _actions = quickActions[position], onItemClick)
        }

        override fun getItemCount(): Int = quickActions.size

        fun add(_navItem: MutableList<NavItems>) {
            androidx.recyclerview.widget.DiffUtil.calculateDiff(
                DiffUtil(_navItem, quickActions),
                true
            ).dispatchUpdatesTo(this)
            quickActions.clear()
            quickActions.addAll(_navItem)
        }

    }

    internal class DiffUtil(
        private val _new: MutableList<NavItems>,
        private val _old: MutableList<NavItems>
    ) : androidx.recyclerview.widget.DiffUtil.Callback() {
        override fun getOldListSize(): Int = _old.size

        override fun getNewListSize(): Int = _new.size

        override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
            _old[oldItemPosition].icon == _new[newItemPosition].icon

        override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
            _old[oldItemPosition] == _new[newItemPosition]
    }

    class ViewHolder(private val binding: BtmHomeQuickActionsListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(context: Context, _actions: NavItems, onItemClick: (NavItems) -> Unit): View {
            binding.apply {
                itemView.setOnClickListener { onItemClick(_actions) }
                quickActionsIcon.setImageDrawable(
                    ResourcesCompat.getDrawable(
                        context.resources,
                        _actions.icon,
                        null
                    )
                )
                quickActionsLabel.text = context.getString(_actions.label)
            }
            return binding.root
        }

    }

}