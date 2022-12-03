package com.peculiaruc.alc_mmsystem_mentor.ui.reports.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.data.local.models.ReportTask
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentMentorsReportSelectTasksBinding
import com.peculiaruc.alc_mmsystem_mentor.ui.reports.adapters.SelectTasksAdapter

/**
 * A [Fragment] where a mentor can view assigned tasks, completed or the ones still in progress.
 *
 * It has fields to filter through the assigned and the completed tasks.
 *
 */
class MentorsReportSelectTasksFragment : Fragment() {

    private var _binding: FragmentMentorsReportSelectTasksBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Retrieve and inflate the layout for this fragment
        _binding = FragmentMentorsReportSelectTasksBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tool1.toolbar2.findViewById<TextView>(R.id.toolbar_create_title)
            .text = getString(R.string.report)

        val recyclerView = view.findViewById<RecyclerView>(R.id.tListItems)

        recyclerView.layoutManager = LinearLayoutManager(context)

        val data = ArrayList<ReportTask>()

        for (i in 1..20) {
            data.add(
                ReportTask(
                title = getString(R.string.room_course),
                image = R.drawable.ic_task
                )
            )
        }

        val adapter = SelectTasksAdapter(data)

        recyclerView.adapter = adapter

       binding.tool1.actionBack.setOnClickListener {
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