package com.peculiaruc.alc_mmsystem_mentor.mentortasks_ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.adapters.ItemTasks
import com.peculiaruc.alc_mmsystem_mentor.adapters.SelectTasksAdapter
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentMentorsReportSelectTasksBinding
import kotlinx.android.synthetic.main.fragment_compose_report_tasks.view.*
import kotlinx.android.synthetic.main.include_toolbar.*


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
        toolbar2.toolbar_create_title.text = getString(R.string.report)

        val recyclerView = view.findViewById<RecyclerView>(R.id.tListItems)

        recyclerView.layoutManager = LinearLayoutManager(context)

        val data = ArrayList<ItemTasks>()

        for (i in 1..20) {
            data.add(
                ItemTasks(
                title = getString(R.string.room_course),
                image = R.drawable.ic_task
                )
            )
        }

        val adapter = SelectTasksAdapter(data)

        recyclerView.adapter = adapter

    }


    /**
     * Frees the binding object when the Fragment is destroyed.
     */
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}