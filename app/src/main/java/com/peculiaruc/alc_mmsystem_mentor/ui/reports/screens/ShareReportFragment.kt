package com.peculiaruc.alc_mmsystem_mentor.ui.reports.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentShareReportBinding

class ShareReportFragment : Fragment() {
    private var _binding: FragmentShareReportBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Retrieve and inflate the layout for this fragment
        _binding = FragmentShareReportBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navListener()
    }

    private fun navListener() {
        binding.btnOpenField.text = getString(R.string.open_email_app)
        binding.btnCancelField.text = getString(R.string.cancel)

        binding.btnOpenField.setOnClickListener {
            val action = ShareReportFragmentDirections.actionShareReportFragmentToComposeReportTasksFragment()
            binding.btnOpenField.findNavController().navigate(action)
        }

        binding.btnCancelField.setOnClickListener {
            val action = ShareReportFragmentDirections.actionShareReportFragmentToSelectProgramFragment()
            binding.btnCancelField.findNavController().navigate(action)
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