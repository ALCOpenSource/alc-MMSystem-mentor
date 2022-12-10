package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.otherScreens

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.peculiaruc.alc_mmsystem_mentor.components.DownloadDialog
import com.peculiaruc.alc_mmsystem_mentor.components.ShareDialog
import com.peculiaruc.alc_mmsystem_mentor.databinding.DownloadCustomDialogBinding
import com.peculiaruc.alc_mmsystem_mentor.databinding.MentorReportDetailFragmentLayoutBinding

class MentorReportDetailFragment : Fragment() {
    private var _binding: MentorReportDetailFragmentLayoutBinding? = null
    private val binding
        get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        MentorReportDetailFragmentLayoutBinding.inflate(inflater).let { _binding = it }


        binding.ivReportsCancel.setOnClickListener {
            findNavController().navigateUp()
        }
        binding.btnDownload.setOnClickListener {
            DownloadDialog(
            ).show(parentFragmentManager, "download dialog")
        }

        binding.btnShare.setOnClickListener {
            ShareDialog().show(parentFragmentManager, "share dialog")

        }

        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}