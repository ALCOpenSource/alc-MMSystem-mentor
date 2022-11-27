package com.peculiaruc.alc_mmsystem_mentor.ui.reports.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentComposeReportTasksBinding
import kotlinx.android.synthetic.main.fragment_compose_report_tasks.*
import kotlinx.android.synthetic.main.fragment_compose_report_tasks.view.*


class ComposeReportTasksFragment : Fragment() {

    private var _binding: FragmentComposeReportTasksBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Retrieve and inflate the layout for this fragment
        _binding = FragmentComposeReportTasksBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        crp_toolbar.toolbar_create_title.text = getString(R.string.compose_report)

        navListener()
    }

    private fun navListener() {
        crp_choose_txt.text = getString(R.string.choose_report)
        crp_txt.text = getString(R.string.program)
        crp_task.text = getString(R.string.task)
        btn_task_field.text = getString(R.string.select_task)
        btn_comp_task_field.text = getString(R.string.submit_report)

    }


    /**
     * Frees the binding object when the Fragment is destroyed.
     */
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}