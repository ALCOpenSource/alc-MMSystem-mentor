package com.peculiaruc.alc_mmsystem_mentor.ui.reports.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.data.local.models.Course
import com.peculiaruc.alc_mmsystem_mentor.ui.reports.adapters.CourseRecyclerAdapter
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentMentorsReportBinding

/**
 * A [Fragment] that displays the mentors report cards.
 *
 * On clicking each cards it takes you to a more detailed page.
 *
 */
class MentorsReportFragment : Fragment() {

    private var _binding: FragmentMentorsReportBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMentorsReportBinding.inflate(inflater, container, false)
        val view = binding.root

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tool.toolbar2.findViewById<TextView>(R.id.toolbar_create_title).text = getString(R.string.report)

        val recyclerView = view.findViewById<RecyclerView>(R.id.mListItems)

        recyclerView.layoutManager = LinearLayoutManager(context)

        val data = ArrayList<Course>()

        for (i in 1..20) {
            data.add(
                Course(course = getString(R.string.google_africa_scholarship),
                title = getString(R.string.by_name),
                image = R.drawable.ic_download,
            image2 = R.drawable.ic_share_alt
                )
            )
        }

        val adapter = CourseRecyclerAdapter(requireContext(), data)

        recyclerView.adapter = adapter

        val fab = view.findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {
            val action = MentorsReportFragmentDirections.actionMentorsReportFragmentToComposeReportFragment()
            fab.findNavController().navigate(action)
        }

        binding.tool.actionBack.setOnClickListener {
            it.findNavController().navigateUp()
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