package com.peculiaruc.alc_mmsystem_mentor.ui.reports.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentComposeReportProgramBinding
import kotlinx.android.synthetic.main.fragment_compose_report_program.*
import kotlinx.android.synthetic.main.fragment_compose_report_tasks.view.*


class ComposeReportFragment : Fragment() {
    private var _binding: FragmentComposeReportProgramBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Retrieve and inflate the layout for this fragment
        _binding = FragmentComposeReportProgramBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cps_toolbar.toolbar_create_title.text = getString(R.string.compose_report)

        navListener()
    }

    private fun navListener() {
        cps_choose_txt.text = getString(R.string.choose_report)
        program_txt.text = getString(R.string.program)
        task_txt.text = getString(R.string.task)
        btn_program_field.text = getString(R.string.select_task)
        btn_compose_field.text = getString(R.string.submit_report)

        btn_compose_field.setOnClickListener {
            val action = ComposeReportFragmentDirections.actionComposeReportFragmentToReportSubmittedFragment()
            btn_compose_field.findNavController().navigate(action)
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