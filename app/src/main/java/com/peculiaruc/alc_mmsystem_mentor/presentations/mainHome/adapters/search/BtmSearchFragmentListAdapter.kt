package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.annotation.DrawableRes
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.databinding.BtmSearchCertListItemLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.databinding.BtmSearchProgramsListItemLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.databinding.BtmSearchReportListItemLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.databinding.BtmSearchTaskAssignedListItemLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.utils.SearchType
import com.peculiaruc.alc_mmsystem_mentor.utils.SearchTypes

/**
 * Btm search fragment list adapter
 *
 * @property onItemClick
 * @constructor
 *
 * @param context
 */
class BtmSearchFragmentListAdapter(context: Context, val onItemClick: (SearchItem?) -> Unit) :
    ArrayAdapter<SearchItem>(context, 0) {
    companion object {
        val TASK_VIEW = SearchType.Tasks.ordinal
        val CERT_VIEW = SearchType.Certificates.ordinal
        val REPORT_VIEW = SearchType.Reports.ordinal
        val PROGRAM_VIEW = SearchType.Programs.ordinal
    }

    override fun getItemViewType(position: Int): Int {
        val searchItem = getItem(position)
        return when (searchItem?.sourceLocation) {
            SearchType.Tasks -> TASK_VIEW
            SearchType.Certificates -> CERT_VIEW
            SearchType.Programs -> PROGRAM_VIEW
            SearchType.Reports -> REPORT_VIEW
            else -> position
        }
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val reportBinding = BtmSearchReportListItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context)
        )
        val programsBinding = BtmSearchProgramsListItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context)
        )
        val certBinding = BtmSearchCertListItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context)
        )
        val tasksBinding = BtmSearchTaskAssignedListItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context)
        )
        val searchItem = getItem(position)

        val viewType = getItemViewType(position)
        Log.e("TAG", "getViewType: $viewType count -> $viewTypeCount", )
        return when (viewType) {
            TASK_VIEW -> TaskListViewHolder(tasksBinding).bind(searchItem, onItemClick)
            REPORT_VIEW -> ReportListViewHolder(reportBinding).bind(searchItem, onItemClick)
            CERT_VIEW -> CertListViewHolder(certBinding).bind(searchItem, onItemClick)
            PROGRAM_VIEW -> ProgramListViewHolder(programsBinding).bind(searchItem, onItemClick)
            else -> convertView!!
        }
    }

    /**
     * Report list view holder
     *
     * @property binding
     * @constructor Create empty Report list view holder
     */
    internal class ReportListViewHolder(private val binding: BtmSearchReportListItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(_searchItem: SearchItem?, onItemClick: (SearchItem?) -> Unit): View {
            _searchItem?.let { searchItem ->
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

    internal class TaskListViewHolder(private val binding: BtmSearchTaskAssignedListItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(_searchItem: SearchItem?, onItemClick: (SearchItem?) -> Unit): View {
            _searchItem?.let { searchItem ->
                binding.apply {
                    btnSearchListItemContainer.setOnClickListener { onItemClick(searchItem) }
                    searchListItemTitle.text = searchItem.title
                    searchListItemDueDate.text = searchItem.taskDueDate

                }
            }
            return binding.root
        }
    }

    internal class CertListViewHolder(private val binding: BtmSearchCertListItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(_searchItem: SearchItem?, onItemClick: (SearchItem?) -> Unit): View {
            _searchItem?.let { searchItem ->
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

    internal class ProgramListViewHolder(private val binding: BtmSearchProgramsListItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(_searchItem: SearchItem?, onItemClick: (SearchItem?) -> Unit): View {
            _searchItem?.let { searchItem ->
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

    internal class SearchItemDiffUtilCallback(
        private val oldItem: MutableList<SearchItem>,
        private val newItem: MutableList<SearchItem>,
    ) : DiffUtil.Callback() {
        override fun getOldListSize(): Int =
            oldItem.size

        override fun getNewListSize(): Int = newItem.size

        override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
            oldItem[oldItemPosition].title == newItem[oldItemPosition].title

        override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
            oldItem[oldItemPosition] == newItem[oldItemPosition]

    }
}

/**
 * Search item
 *
 * @property img
 * @property title
 * @property taskDueDate
 * @property reportAuthor
 * @property reportFinishedDate
 * @property sourceLocation
 * @constructor Create empty Search item
 */
data class SearchItem(
    @DrawableRes
    val img: Int? = null,
    val title: String? = null,
    val taskDueDate: String? = null,
    val reportAuthor: String? = null,
    val reportFinishedDate: String? = null,
    @SearchTypes
    val sourceLocation: SearchType
)