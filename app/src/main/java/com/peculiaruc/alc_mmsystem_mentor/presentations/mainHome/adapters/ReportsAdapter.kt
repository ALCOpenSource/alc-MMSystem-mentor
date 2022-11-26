package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.databinding.ProgramsListItemBinding
import com.peculiaruc.alc_mmsystem_mentor.databinding.ReportsListItemBinding
import com.peculiaruc.alc_mmsystem_mentor.domain.ProgramItem
import com.peculiaruc.alc_mmsystem_mentor.domain.ReportItem

class ReportsAdapter(
    private val reportsList: List<ReportItem>,
    private val listener: OnClickListener
) : RecyclerView.Adapter<ReportsAdapter.ReportsViewHolder>() {

    inner class ReportsViewHolder(val binding : ReportsListItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bindItem(reportItem: ReportItem){
            binding.tvReportTitle.text = reportItem.title
            binding.tvReportMentor.text = reportItem.owner
            binding.tvReportTime.text = reportItem.time
            binding.reportItem.setOnClickListener {
                listener.onClick(reportItem)
            }
        }
    }

    interface OnClickListener{
        fun onClick(reportItem: ReportItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReportsViewHolder {
        val binding = ReportsListItemBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return ReportsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ReportsViewHolder, position: Int) {
        val programs = reportsList[position]
        holder.bindItem(programs)

    }

    override fun getItemCount(): Int {
        return reportsList.size
    }
}