package com.peculiaruc.alc_mmsystem_mentor.ui.reports.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.data.local.database.models.Program

class SelectProgramAdapter(private val program: List<Program>) : RecyclerView.Adapter<SelectProgramAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_select_program, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val prog = program[position]
        holder.titleText.text = prog.title
        holder.image.setImageResource(prog.image)
    }

    override fun getItemCount(): Int {
        return program.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleText: TextView = itemView.findViewById(R.id.isp_txt)
        val image: ImageView = itemView.findViewById(R.id.google_icon)
    }
}