package com.peculiaruc.alc_mmsystem_mentor.ui.home.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(
            layoutInflater,
            container,
            false
        )

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupNavigation()
        setupActions()

    }

    private fun setupNavigation() {
        NavigationUI.setupWithNavController(
            binding.bottomNavigation,
            binding.bottomNavigation.findNavController()
        )
    }

    private fun setupActions() {

        binding.apply {
            tasksInProgress.setOnClickListener {
                val action = HomeFragmentDirections.actionHomeToTasksNavigation()
                findNavController().navigate(action)
            }
            chat.setOnClickListener {
                val action = HomeFragmentDirections.actionHomeToMessages()
                findNavController().navigate(action)
            }
            reports.setOnClickListener {
                val action = HomeFragmentDirections.actionHomeToReportsNavigation()
                findNavController().navigate(action)
            }
            certificates.setOnClickListener {
                val action = HomeFragmentDirections.actionHomeToCertificates()
                findNavController().navigate(action)
            }
        }

    }

}