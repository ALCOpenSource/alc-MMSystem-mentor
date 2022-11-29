package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.databinding.BtmHomeActivityOverviewListItemBinding
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.ActivityOverview

class HomeActivitiesOverviewAdapter {

    class Adapter(private val onItemClick: (ActivityOverview) -> Unit) :
        RecyclerView.Adapter<ViewHolder>() {

        private val overview: MutableList<ActivityOverview> = mutableListOf()

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val binding = BtmHomeActivityOverviewListItemBinding.inflate(
                LayoutInflater.from(
                    parent.context
                )
            )
            return ViewHolder(binding)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind(_overview = overview[position], onItemClick)
        }

        override fun getItemCount(): Int = overview.size

        fun add(_navItem: MutableList<ActivityOverview>) {
            androidx.recyclerview.widget.DiffUtil.calculateDiff(
                DiffUtil(_navItem, overview),
                true
            ).dispatchUpdatesTo(this)
            overview.clear()
            overview.addAll(_navItem)
        }

    }

    internal class DiffUtil(
        private val _new: MutableList<ActivityOverview>,
        private val _old: MutableList<ActivityOverview>
    ) : androidx.recyclerview.widget.DiffUtil.Callback() {
        override fun getOldListSize(): Int = _old.size

        override fun getNewListSize(): Int = _new.size

        override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
            _old[oldItemPosition].category == _new[newItemPosition].category

        override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
            _old[oldItemPosition] == _new[newItemPosition]

    }

    class ViewHolder(private val binding: BtmHomeActivityOverviewListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(
            _overview: ActivityOverview,
            onItemClick: (ActivityOverview) -> Unit
        ): View {
            binding.apply {
                homeActivityOverviewCount.text = _overview.count.toString()
                homeActivityOverviewLabel.text = _overview.category._readableValue
                homeActivityOverviewAction.setOnClickListener { onItemClick(_overview) }
            }
            return binding.root
        }

    }

}