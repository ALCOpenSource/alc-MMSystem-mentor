package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.otherScreens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentCommentsBinding
import com.peculiaruc.alc_mmsystem_mentor.databinding.MentorProgramsFragmentLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.databinding.SettingsFragmentLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.CommentsAdapter
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.ProgramsAdapter
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.UiData

/**
 * Comments fragment
 *
 * @constructor Create empty Comments fragment
 */
class CommentsFragment : Fragment() {
    private var _binding: FragmentCommentsBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        FragmentCommentsBinding.inflate(inflater).let { _binding = it }
        _binding = FragmentCommentsBinding.inflate(layoutInflater)
        val adapter = CommentsAdapter(UiData.commentsList)
        binding.commentsRv .adapter = adapter
        binding.commentsRv.layoutManager = LinearLayoutManager(activity)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}