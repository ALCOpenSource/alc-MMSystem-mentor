package com.peculiaruc.alc_mmsystem_mentor.mentortasks_ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.adapters.CourseInfo
import com.peculiaruc.alc_mmsystem_mentor.adapters.CourseRecyclerAdapter
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentMentorsReportBinding
import kotlinx.android.synthetic.main.include_toolbar.*
import kotlinx.android.synthetic.main.include_toolbar.view.*

class MentorsReportFragment : Fragment() {

    private var _binding: FragmentMentorsReportBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMentorsReportBinding.inflate(inflater, container, false)
        val view = binding.root

        return view



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        toolbar2.toolbar_create_title.text = getString(R.string.report)

        val recyclerView = view.findViewById<RecyclerView>(R.id.mListItems)

        recyclerView.layoutManager = LinearLayoutManager(context)

        val data = ArrayList<CourseInfo>()

        for (i in 1..20) {
            data.add(
                CourseInfo(course = getString(R.string.google_africa_scholarship),
                title = getString(R.string.by_name),
                image = R.drawable.ic_download,
            image2 = R.drawable.ic_share_alt
                )
            )
        }

        val adapter = CourseRecyclerAdapter(data)

        recyclerView.adapter = adapter

        val fab = view.findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {
            val action = MentorsReportFragmentDirections.actionMentorsReportFragmentToMentorReportDetailsFragment()
            fab.findNavController().navigate(action)
        }

    }

    /**
     * Frees the binding object when the Fragment is destroyed.
     */
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}