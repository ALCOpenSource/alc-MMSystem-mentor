package com.peculiaruc.alc_mmsystem_mentor.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import com.peculiaruc.alc_mmsystem_mentor.databinding.ActivityProgramsBinding
import com.peculiaruc.alc_mmsystem_mentor.view.adapter.ViewPagerAdapter

/**
 * This class defines the list of programs
 */
class ProgramsFragment : Fragment() {

    private lateinit var binding: ActivityProgramsBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ActivityProgramsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        binding.searchView.isActivated = false
        binding.searchView.queryHint = "Type program name"
        //binding.searchView.onActionViewExpanded()
        binding.searchView.isIconified = true
        binding.searchView.clearFocus()
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                // binding.viewPager.adapter.getFilter().filter(newText)
                return false
            }
        })

        initRecyclerView()

    }

    private fun initRecyclerView() {
        val viewPagerAdapter = ViewPagerAdapter(requireActivity().supportFragmentManager)

        viewPagerAdapter.addFragment(AllProgramFragment(), "All")
        viewPagerAdapter.addFragment(AssignedProgramFragment(), "Assigned")
        viewPagerAdapter.addFragment(CompletedProgramFragment(), "Completed")

        binding.viewPager.adapter = viewPagerAdapter
        binding.tbLayout.setupWithViewPager(binding.viewPager)

    }


    companion object {
        // Gets an instance of the programs fragment
        fun newInstance(): ProgramsFragment = ProgramsFragment()
    }
}
