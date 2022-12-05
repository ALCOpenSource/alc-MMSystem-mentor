package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.databinding.BtmHomeQuickActionsListItemBinding
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.NavItems

/**
 * Home quick actions adapter
 *
 * @constructor Create empty Home quick actions adapter
 */
class HomeQuickActionsAdapter {
    /**
     * Adapter
     *
     * @property onItemClick
     * @constructor Create empty Adapter
     */
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

        /**
         * Add
         *
         * @param _navItem
         */
        fun add(_navItem: MutableList<NavItems>) {
            androidx.recyclerview.widget.DiffUtil.calculateDiff(
                DiffUtil(_navItem, quickActions),
                true
            ).dispatchUpdatesTo(this)
            quickActions.clear()
            quickActions.addAll(_navItem)
        }

    }

    /**
     * Diff util
     *
     * @property _new
     * @property _old
     * @constructor Create empty Diff util
     */
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

    /**
     * View holder
     *
     * @property binding
     * @constructor Create empty View holder
     */
    class ViewHolder(private val binding: BtmHomeQuickActionsListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        /**
         * Bind
         *
         * @param context
         * @param _actions
         * @param onItemClick
         * @receiver
         * @return
         */
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