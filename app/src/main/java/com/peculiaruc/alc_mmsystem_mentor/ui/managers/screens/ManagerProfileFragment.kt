package com.peculiaruc.alc_mmsystem_mentor.ui.managers.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentManagersBinding

class ManagerProfileFragment : Fragment() {


    private var _binding: FragmentManagersBinding? = null
    private val binding get() = _binding!!

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentManagersBinding
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

    }

}