package com.peculiaruc.alc_mmsystem_mentor.ui.home.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.fragment.findNavController
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var reportsCardView: CardView
    private lateinit var tasksCardView: CardView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(
            layoutInflater,
            container,
            false
        )
        reportsCardView = binding.reports
        tasksCardView = binding.tasksInProgress

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        reportsCardView.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToMentorsReportFragment()
            findNavController().navigate(action)
        }

        tasksCardView.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToTaskFragment()
            findNavController().navigate(action)
        }

    }

}