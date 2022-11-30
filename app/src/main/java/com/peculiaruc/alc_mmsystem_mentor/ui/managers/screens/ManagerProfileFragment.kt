package com.peculiaruc.alc_mmsystem_mentor.ui.managers.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.peculiaruc.alc_mmsystem_mentor.data.repositories.ManagersRepository
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentManagerProfileBinding
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentManagersBinding
import kotlinx.android.synthetic.main.manager_item.*

/**
 * A [Fragment] that displays the managers profile ui.
 *
 *
 *
 */
class ManagerProfileFragment : Fragment() {

    private val args: ManagerProfileFragmentArgs by navArgs()
    private var _binding: FragmentManagerProfileBinding? = null
    private val binding get() = _binding!!

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val manager = ManagersRepository.getManager(args.name)

        _binding = FragmentManagerProfileBinding
            .inflate(layoutInflater, container, false)

        if (manager != null) {
            binding.apply {
                managerName.text = manager.managerName
                managerTitle.text = manager.managerTitle
                memberSince.text = manager.memberSince
            }
        }

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