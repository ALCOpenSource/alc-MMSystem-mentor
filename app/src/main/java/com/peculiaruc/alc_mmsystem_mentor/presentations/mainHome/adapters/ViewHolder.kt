package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters

import android.view.View
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.peculiaruc.alc_mmsystem_mentor.databinding.BtmSearchCertListItemLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.databinding.BtmSearchProgramsListItemLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.databinding.BtmSearchReportListItemLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.databinding.BtmSearchTaskAssignedListItemLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.utils.SearchType

interface ViewHolder {
    fun <M> bind(viewType: Int, model: M, onItemClick: (M?) -> Unit): View
}

class SearchItemViewHolder(val binding: ViewBinding) : RecyclerView.ViewHolder(binding.root) {

    companion object {
        val TASK_VIEW = SearchType.Tasks.ordinal
        val CERT_VIEW = SearchType.Certificates.ordinal
        val REPORT_VIEW = SearchType.Reports.ordinal
        val PROGRAM_VIEW = SearchType.Programs.ordinal
    }

    fun bind(viewType: Int, model: SearchItem, onItemClick: (SearchItem) -> Unit) {
        when (viewType) {
            CERT_VIEW -> CertListViewHolder(binding as BtmSearchCertListItemLayoutBinding).bind(
                model,
                onItemClick
            )
            PROGRAM_VIEW -> ProgramListViewHolder(binding as BtmSearchProgramsListItemLayoutBinding)
            REPORT_VIEW -> ReportListViewHolder(
                binding as BtmSearchReportListItemLayoutBinding
            )
            else -> TaskListViewHolder(binding as BtmSearchTaskAssignedListItemLayoutBinding)
        }
    }

    internal class ReportListViewHolder(private val binding: BtmSearchReportListItemLayoutBinding) {
        fun bind(_searchItem: SearchItem, onItemClick: (SearchItem) -> Unit): View {
            _searchItem.let { searchItem ->
                binding.apply {
                    btnSearchListItemContainer.setOnClickListener { onItemClick(searchItem) }
                    searchListItemTitle.text = searchItem.title
                    searchListItemAuthor.text = searchItem.reportAuthor
                    searchListItemFinishedDate.text = searchItem.reportFinishedDate
                }
            }
            return binding.root
        }
    }

    inner class TaskListViewHolder(private val binding: BtmSearchTaskAssignedListItemLayoutBinding) {
        fun bind(_searchItem: SearchItem, onItemClick: (SearchItem) -> Unit): View {
            _searchItem.let { searchItem ->
                binding.apply {
                    btnSearchListItemContainer.setOnClickListener { onItemClick(searchItem) }
                    searchListItemTitle.text = searchItem.title
                    searchListItemDueDate.text = searchItem.taskDueDate

                }
            }
            return binding.root
        }
    }

    inner class CertListViewHolder(private val binding: BtmSearchCertListItemLayoutBinding) {
        fun bind(_searchItem: SearchItem, onItemClick: (SearchItem) -> Unit): View {
            _searchItem.let { searchItem ->
                binding.apply {
                    btnSearchListItemContainer.setOnClickListener { onItemClick(searchItem) }
                    searchListItemTitle.text = searchItem.title
                    searchListItemImg.setImageDrawable(
                        searchItem.img?.let { imgRes ->
                            ResourcesCompat.getDrawable(
                                binding.root.context.resources,
                                imgRes,
                                null
                            )
                        }
                    )
                }
            }
            return binding.root
        }
    }

    inner class ProgramListViewHolder(private val binding: BtmSearchProgramsListItemLayoutBinding) {
        fun bind(_searchItem: SearchItem, onItemClick: (SearchItem) -> Unit): View {
            _searchItem.let { searchItem ->
                binding.apply {
                    btnSearchListItemContainer.setOnClickListener { onItemClick(searchItem) }
                    searchListItemTitle.text = searchItem.title
                    searchListItemImg.setImageDrawable(
                        searchItem.img?.let { imgRes ->
                            ResourcesCompat.getDrawable(
                                binding.root.context.resources,
                                imgRes,
                                null
                            )
                        }
                    )
                }
            }
            return binding.root
        }
    }


}