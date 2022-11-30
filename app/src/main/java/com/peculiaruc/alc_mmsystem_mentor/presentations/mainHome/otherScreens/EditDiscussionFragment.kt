package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.otherScreens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.components.PostUpdateDialog
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentEditDiscussionBinding
import com.peculiaruc.alc_mmsystem_mentor.databinding.SettingsFragmentLayoutBinding


class EditDiscussionFragment : Fragment() {
    private var _binding: FragmentEditDiscussionBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        FragmentEditDiscussionBinding.inflate(inflater).let { _binding = it }

        binding.btnSaveChangesDiscussion.setOnClickListener {
            PostUpdateDialog().show(parentFragmentManager, "dialog")
        }
        binding.appbar.apply {
            screenTitle.text = getString(R.string.mms_new_topic)
            backBtn.setOnClickListener {
                findNavController().navigateUp()
            }
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}