package com.peculiaruc.alc_mmsystem_mentor.view.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.databinding.CardViewProgramBinding
import com.peculiaruc.alc_mmsystem_mentor.view.activity.ProgramDetailActivity

/**
 * This is an adapter class for creating programs
 */
class ProgramsAdapter(var context: Context, private var programList: ArrayList<ProgramModel>) :
    RecyclerView.Adapter<ProgramsAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            CardViewProgramBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    // This function binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(
            programList[position]
        )


    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return programList.size
    }


    /**
     * This class holds the views for adding it to image and text
     */
    inner class ViewHolder(private var item: CardViewProgramBinding) :
        RecyclerView.ViewHolder(item.root) {

        // This function binds programs to views
        fun bind(program: ProgramModel) {
            item.tvPrgName.text = context.getString(program.prgName)
            item.ivPrgImg.setImageResource(program.imgResId)

            item.cvProgram.setOnClickListener {
                val intent = Intent(context, ProgramDetailActivity::class.java)
                intent.putExtra("program_name", program.prgName)
                intent.putExtra("program_img", program.imgResId)
                context.startActivity(intent)
            }
        }

    }
}
