package com.peculiaruc.alc_mmsystem_mentor.ui.tasks.adapters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.data.local.models.Task
import com.peculiaruc.alc_mmsystem_mentor.databinding.TaskListItemBinding

/**
 * A [TaskListAdapter] that manages the recyclerView for the selectProgramFragment.
 *
 * It implements the onBindViewHolder, the onCreateViewHolder and the getItemCount methods.
 */
class TaskListAdapter :
    ListAdapter<Task, TaskListAdapter.TaskViewHolder>(TasksComparator()) {

    private lateinit var taskList: ArrayList<Task>

    /**
     * Filters the list in the course array list
     */
    fun filterList(filterList: ArrayList<Task>) {
        // below line is to add our filtered
        // list in our course array list.
        taskList = filterList
        // below line is to notify our adapter
        // as change in recycler view data.
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        return TaskViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val current = getItem(position)
        holder.bind(current.title, current.assigned, current.completed)
        holder.itemView.setOnClickListener {
            val bundle: Bundle? = Bundle()
            bundle?.putInt("id", current.id)
            Navigation.createNavigateOnClickListener(
                R.id.action_taskFragment_to_taskDetailFragment,
                bundle
            ).onClick(holder.itemView)
        }
    }

    /**
     * Holds the views for the adapter
     */
    class TaskViewHolder(private val binding: TaskListItemBinding) : RecyclerView.ViewHolder(binding.root) {


        /**
         * Binds the chats views to the data
         */
        fun bind(title: String, assigned: Boolean, completed: Boolean) {
            binding.tvTaskTitle.text = title
            if (completed) {
                binding.tvTaskProgress.text = "Completed"
            }

            if (assigned) {
                binding.tvTaskProgress.text = "Assigned"
            }
        }

        companion object {
            /**
             * Inflates the task_list_item layout at runtime
             */
            fun create(parent: ViewGroup): TaskViewHolder {
                return TaskViewHolder(
                    TaskListItemBinding.bind(
                        LayoutInflater.from(parent.context).inflate(R.layout.task_list_item, parent, false).apply {

                        }
                    )
                )
            }
        }
    }

    /**
     * Compares the values of the contents within the recyclerView
     */
    class TasksComparator : DiffUtil.ItemCallback<Task>() {
        override fun areItemsTheSame(oldItem: Task, newItem: Task): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Task, newItem: Task): Boolean {
            return oldItem.id == newItem.id
        }
    }
}