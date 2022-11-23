package com.peculiaruc.alc_mmsystem_mentor.mentortasks_ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentMentorsAllTasksBinding

class MentorsAllTasksFragment : Fragment() {
    private var _binding: FragmentMentorsAllTasksBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Retrieve and inflate the layout for this fragment
        _binding = FragmentMentorsAllTasksBinding.inflate(inflater, container, false)
        return binding.root
    }


    /**
     * Frees the binding object when the Fragment is destroyed.
     */
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}