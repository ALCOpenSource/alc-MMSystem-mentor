package com.peculiaruc.alc_mmsystem_mentor.ui.reports.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentMentorReportDetailsBinding
import kotlinx.android.synthetic.main.fragment_mentor_report_details.*

class MentorReportDetailsFragment : Fragment() {

    private var _binding: FragmentMentorReportDetailsBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Retrieve and inflate the layout for this fragment
        _binding = FragmentMentorReportDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navListener()
    }

    private fun navListener() {
        binding.btnShareField.text = getString(R.string.share)
        binding.btnDownloadField.text = getString(R.string.download)

        binding.btnDownloadField.setOnClickListener {
            val action = MentorReportDetailsFragmentDirections.actionMentorReportDetailsFragmentToReportDownloadFragment()
            binding.btnDownloadField.findNavController().navigate(action)
        }
        binding.btnShareField.setOnClickListener {
            val action = MentorReportDetailsFragmentDirections.actionMentorReportDetailsFragmentToShareReportFragment()
            binding.btnShareField.findNavController().navigate(action)
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