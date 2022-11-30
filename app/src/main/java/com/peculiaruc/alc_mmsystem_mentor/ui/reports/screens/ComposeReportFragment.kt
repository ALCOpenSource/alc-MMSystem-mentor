package com.peculiaruc.alc_mmsystem_mentor.ui.reports.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentComposeReportProgramBinding

/**
 * A [Fragment] that displays the mentors report field.
 *
 * It has fields to take in information as regards the programs they supervise
 * and also a button to submit it to the server.
 */
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

        binding.toolbarCreateTitle.text = getString(R.string.compose_report)

        navListener()
    }

    private fun navListener() {
        binding.cpsChooseTxt.text = getString(R.string.choose_report)
        binding.programTxt.text = getString(R.string.program)
        binding.taskTxt.text = getString(R.string.task)
        binding.btnProgramField.text = getString(R.string.select_task)
        binding.btnComposeField.text = getString(R.string.submit_report)

        /**
         * Navigates from the compose report screen to the submitted form dialog.
         */
        binding.btnComposeField.setOnClickListener {
            val action = ComposeReportFragmentDirections.actionComposeReportFragmentToReportSubmittedFragment()
            binding.btnComposeField.findNavController().navigate(action)
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