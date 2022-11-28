package com.peculiaruc.alc_mmsystem_mentor.ui.reports.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.data.local.models.Course

class CourseRecyclerAdapter(private val courses: List<Course>) :
    RecyclerView.Adapter<CourseRecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_reports, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val course = courses[position]
        holder.textTitle.text = course.title
        holder.courseTitle.text = course.course
        holder.imageView.setImageResource(course.image)
        holder.imageView2.setImageResource(course.image2)

    }

    override fun getItemCount(): Int {
        return courses.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val courseTitle: TextView = itemView.findViewById<TextView?>(R.id.textReport)
        val textTitle: TextView = itemView.findViewById(R.id.reporter)
        val imageView: ImageView = itemView.findViewById(R.id.downloadIcon)
        val imageView2: ImageView = itemView.findViewById(R.id.shareIcon)

    }
}