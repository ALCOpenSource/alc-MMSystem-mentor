package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.databinding.CertificateListItemBinding
import com.peculiaruc.alc_mmsystem_mentor.domain.CertificateItem

/**
 * Certificates adapter
 *
 * @property certificatesList
 * @property listener
 * @constructor Create empty Certificates adapter
 */
class CertificatesAdapter(
    private val certificatesList : List<CertificateItem>,
    private val listener: OnClickListener

)  : RecyclerView.Adapter<CertificatesAdapter.CertificateViewHolder>()  {
    /**
     * Certificate view holder
     *
     * @property binding
     * @constructor Create empty Certificate view holder
     */
    inner class CertificateViewHolder(val binding : CertificateListItemBinding) : RecyclerView.ViewHolder(binding.root){
        /**
         * Bind item
         *
         * @param certificateItem
         */
        fun bindItem(certificateItem: CertificateItem){
            binding.tvCertTitle.text = certificateItem.title
            binding.ivCertLogo.setImageResource(certificateItem.certImage)

            binding.certificateItem.setOnClickListener {
                listener.onClick(certificateItem)
            }
        }

    }

    /**
     * On click listener
     *
     * @constructor Create empty On click listener
     */
    interface OnClickListener{
        /**
         * On click
         *
         * @param certificateItem
         */
        fun onClick(certificateItem: CertificateItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CertificateViewHolder {
        val binding = CertificateListItemBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return CertificateViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CertificateViewHolder, position: Int) {
        val programs = certificatesList[position]
        holder.bindItem(programs)
    }

    override fun getItemCount(): Int {
        return certificatesList.size
    }
}