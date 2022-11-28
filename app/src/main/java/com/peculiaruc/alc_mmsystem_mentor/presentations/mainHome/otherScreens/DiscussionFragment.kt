package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.otherScreens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentDiscussionBinding
import com.peculiaruc.alc_mmsystem_mentor.databinding.SettingsFragmentLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.domain.DiscussionItem
import com.peculiaruc.alc_mmsystem_mentor.domain.ProgramItem
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.DiscussionsAdapter


class DiscussionFragment : Fragment() , DiscussionsAdapter.OnDiscussionsClickListener,  DiscussionsAdapter.OnCommentDiscussionsClickListener{
    private var _binding: FragmentDiscussionBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        FragmentDiscussionBinding.inflate(inflater).let { _binding = it }

        binding.ivDiscArrowBack.setOnClickListener {
            findNavController().navigateUp()
        }

        binding.floatingActionButton.setOnClickListener {

        }


        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onClick(discussionItem: DiscussionItem) {
        TODO("Not yet implemented")
    }

    override fun onCommentClick(discussionItem: DiscussionItem) {
        TODO("Not yet implemented")
    }


}