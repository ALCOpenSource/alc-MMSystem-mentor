package com.peculiaruc.alc_mmsystem_mentor.ui.profile.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentBroadcastMessagesBinding
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding
            .inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupNavigation()

    }

    private fun setupNavigation() {

        binding.toolbar.setupWithNavController(binding.toolbar.findNavController())
        appBarConfiguration = AppBarConfiguration(binding.toolbar.findNavController().graph)
        NavigationUI.setupWithNavController(
            binding.bottomNavigation,
            binding.bottomNavigation.findNavController()
        )
    }

}