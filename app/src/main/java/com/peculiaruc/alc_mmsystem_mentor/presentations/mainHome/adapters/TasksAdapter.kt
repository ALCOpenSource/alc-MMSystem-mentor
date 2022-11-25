package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.databinding.TaskListItemBinding
import com.peculiaruc.alc_mmsystem_mentor.domain.ProgramItem
import com.peculiaruc.alc_mmsystem_mentor.domain.TaskItem

class TasksAdapter(
    private val taskList: List<TaskItem>,
    private val listener : OnTaskClickListener
) : RecyclerView.Adapter<TasksAdapter.TaskViewHolder>()  {


    inner class TaskViewHolder(val binding : TaskListItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bindItem(taskItem: TaskItem){
            binding.tvTaskTitle.text = taskItem.title
            binding.tvTaskProgress.text = taskItem.progress
            binding.tvTaskTime.text = taskItem.time
            binding.taskItem.setOnClickListener {
                listener.onClick(taskItem)
            }
        }
    }

    interface OnTaskClickListener{
        fun onClick(taskItem: TaskItem)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val binding = TaskListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TaskViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val tasks = taskList[position]
        holder.bindItem(tasks)

    }

    override fun getItemCount(): Int {
        return taskList.size
    }
}