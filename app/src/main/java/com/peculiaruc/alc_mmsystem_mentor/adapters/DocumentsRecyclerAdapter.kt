package com.peculiaruc.alc_mmsystem_mentor.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.R


/**
 * Documents recycler adapter
 *
 * @property items
 * @constructor Create empty Documents recycler adapter
 */
class DocumentsRecyclerAdapter(private val items: ArrayList<String>)  : RecyclerView.Adapter<DocumentsRecyclerAdapter.ViewHolder>() {

    /**
     * Documents Adapter View holder
     *
     * @constructor
     *
     * @param itemView
     */
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val documentTittleTv : TextView =  itemView.findViewById(R.id.tvDocTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return  ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.document_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.documentTittleTv.text = items[position]
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
