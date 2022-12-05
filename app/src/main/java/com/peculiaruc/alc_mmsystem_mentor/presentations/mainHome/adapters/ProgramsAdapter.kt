package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.databinding.MentorProgramsFragmentLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.databinding.ProgramsListItemBinding
import com.peculiaruc.alc_mmsystem_mentor.domain.ProgramItem

/**
 * Programs adapter
 *
 * @property programsList
 * @property listener
 * @constructor Create empty Programs adapter
 */
class ProgramsAdapter(
    private val programsList : List<ProgramItem>,
    private val listener: OnClickListener
) : RecyclerView.Adapter<ProgramsAdapter.ProgramsViewHolder>()  {
    /**
     * Programs view holder
     *
     * @property binding
     * @constructor Create empty Programs view holder
     */
    inner class ProgramsViewHolder(val binding: ProgramsListItemBinding) : RecyclerView.ViewHolder(binding.root){
        /**
         * Bind item
         *
         * @param programItem
         */
        fun bindItem(programItem: ProgramItem){
            binding.tvProgramTitle.text = programItem.title
            binding.tvProgramDate.text = programItem.date
            binding.ivProgramLogo.setImageResource(programItem.programImage)
            binding.ivOnDone.setImageResource(programItem.onDoneDrawable)
            binding.programsItem.setOnClickListener {
                listener.onClick(programItem)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProgramsViewHolder {
            val binding = ProgramsListItemBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return ProgramsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProgramsViewHolder, position: Int) {
        val programs = programsList[position]
        holder.bindItem(programs)
    }

    override fun getItemCount(): Int {
        return programsList.size
    }

    interface OnClickListener{
        fun onClick(programItem: ProgramItem)
    }


}