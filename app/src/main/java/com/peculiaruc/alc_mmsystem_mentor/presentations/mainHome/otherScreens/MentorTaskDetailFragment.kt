package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.otherScreens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.peculiaruc.alc_mmsystem_mentor.databinding.MentorTaskDetailFragmentLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.domain.TaskItem

/**
 * Mentor task detail fragment
 *
 * @constructor Create empty Mentor task detail fragment
 */
class MentorTaskDetailFragment : Fragment() {
    private var _binding: MentorTaskDetailFragmentLayoutBinding? = null

    private val taskItem : TaskItem? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        MentorTaskDetailFragmentLayoutBinding.inflate(inflater).let { _binding = it }

        binding.ivTaskDetailsArrowBack.setOnClickListener {
            findNavController().navigateUp()
        }
//        binding.tvTaskDetailsTitle.text = taskItem?.title

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}