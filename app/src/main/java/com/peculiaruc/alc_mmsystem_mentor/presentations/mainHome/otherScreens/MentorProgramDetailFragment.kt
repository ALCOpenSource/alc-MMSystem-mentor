package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.otherScreens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.peculiaruc.alc_mmsystem_mentor.databinding.MentorProgramDetailFragmentLayoutBinding

/**
 * Mentor program detail fragment
 *
 * @constructor Create empty Mentor program detail fragment
 */
class MentorProgramDetailFragment : Fragment() {
    private var _binding: MentorProgramDetailFragmentLayoutBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        MentorProgramDetailFragmentLayoutBinding.inflate(inflater).let { _binding = it }

        binding.ivDetailsArrowBack.setOnClickListener {
            findNavController().navigateUp()
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}