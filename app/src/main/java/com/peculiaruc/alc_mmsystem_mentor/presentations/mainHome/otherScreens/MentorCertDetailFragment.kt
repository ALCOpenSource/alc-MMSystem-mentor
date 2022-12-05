package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.otherScreens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.peculiaruc.alc_mmsystem_mentor.components.CertificateDownloadDialog
import com.peculiaruc.alc_mmsystem_mentor.databinding.MentorCertDetailFragmentLayoutBinding

/**
 * Mentor cert detail fragment
 *
 * @constructor Create empty Mentor cert detail fragment
 */
class MentorCertDetailFragment : Fragment() {
    private var _binding: MentorCertDetailFragmentLayoutBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        MentorCertDetailFragmentLayoutBinding.inflate(inflater).let { _binding = it }
        binding.ivCertDetailsArrowBack.setOnClickListener {
            findNavController().navigateUp()
        }
        binding.btnCertDownload.setOnClickListener {
            CertificateDownloadDialog().show(parentFragmentManager,"")
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}