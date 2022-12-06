package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.otherScreens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentCreateDiscussionBinding
import com.peculiaruc.alc_mmsystem_mentor.databinding.SettingsFragmentLayoutBinding

/**
 * Create discussion fragment
 *
 * @constructor Create empty Create discussion fragment
 */
class CreateDiscussionFragment : Fragment() {
    private var _binding: FragmentCreateDiscussionBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        FragmentCreateDiscussionBinding.inflate(inflater).let { _binding = it }
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