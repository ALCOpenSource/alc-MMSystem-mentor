package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.btmNavScreens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.peculiaruc.alc_mmsystem_mentor.databinding.BtmSearchFragmentLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.BtmSearchFragmentListAdapter
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.UiData

class SearchFragment : Fragment(), View.OnClickListener {
    private var _binding: BtmSearchFragmentLayoutBinding? = null
    private val binding
        get() = _binding!!
    private lateinit var adapter: BtmSearchFragmentListAdapter
    private val searchOptionViews: MutableList<View> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        BtmSearchFragmentLayoutBinding.inflate(inflater).let { _binding = it }


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUi()
    }

    private fun initUi() {
        context?.let { _context ->
            adapter = BtmSearchFragmentListAdapter(_context) { searchItem ->
                Toast.makeText(context, searchItem?.title, Toast.LENGTH_SHORT).show()
            }
        }
        binding.searchFilterView.apply {
            setOnClickListener {
                toggleFilterItems()
            }
        }
        initFilterItems()
        initRecyclerView()
    }

    private fun toggleFilterItems() {
        binding.btnSearchOptionsHandler.apply {
            if (isVisible) {
                visibility = View.GONE
                clearSearchFilterOptions()
            } else {
                visibility = View.VISIBLE
            }
            binding.searchFilterView.isChecked = isVisible
        }
    }

    private fun clearSearchFilterOptions() {
        searchOptionViews.forEach {
            (it as RadioButton).isChecked = false
        }
        (searchOptionViews.last() as RadioButton).isChecked = true
    }

    private fun initFilterItems() {
        binding.apply {
            searchOptionViews.addAll(
                mutableListOf(
                    btnSearchTypeAll,
                    btnSearchTypeCert,
                    btnSearchTypeMentManagers,
                    btnSearchTypeMents,
                    btnSearchTypeReports,
                    btnSearchTypeTasks,
                    btnSearchTypeProgams
                )
            )
            searchOptionViews.forEach {
                it.setOnClickListener(this@SearchFragment)
            }
        }
    }

    private fun initRecyclerView() {
        binding.apply {
            btmSearchLists.apply {
                adapter = this@SearchFragment.adapter.apply {
                    addAll(UiData.searchItems)
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onClick(view: View?) {
        view?.let { _view ->
            searchOptionViews.forEach { searchOption ->
                (searchOption as RadioButton).isChecked = _view.id == searchOption.id
            }
        }
    }
}