package com.peculiaruc.alc_mmsystem_mentor.ui.reports.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.data.local.models.ReportTask

/**
 * A [SelectTasksAdapter] that manages the recyclerView for the selectProgramFragment.
 *
 * It implements the onBindViewHolder, the onCreateViewHolder and the getItemCount methods.
 */
class SelectTasksAdapter(private val tasks: List<ReportTask>) : RecyclerView.Adapter<SelectTasksAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_mentor_select_tasks, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val task = tasks[position]
        holder.titleText.text = task.title
        holder.image.setImageResource(task.image)
    }

    override fun getItemCount(): Int {
        return tasks.size
    }

    /**
     * Holds the views for the adapter
     */
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleText: TextView = itemView.findViewById(R.id.ist_txt)
        val image: ImageView = itemView.findViewById(R.id.box_icon)
    }
}