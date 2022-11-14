package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.btmNavScreens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.peculiaruc.alc_mmsystem_mentor.databinding.BtmSearchFragmentLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.BtmSearchFragmentListAdapter
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.UiData

class SearchFragment : Fragment() {
    private var _binding: BtmSearchFragmentLayoutBinding? = null
    private val binding
        get() = _binding!!
    private lateinit var adapter: BtmSearchFragmentListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        BtmSearchFragmentLayoutBinding.inflate(inflater).let { _binding = it }


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = BtmSearchFragmentListAdapter(view.context) { searchItem ->
            Toast.makeText(view.context, searchItem?.title, Toast.LENGTH_SHORT).show()
        }

        initRecyclerView()
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
}