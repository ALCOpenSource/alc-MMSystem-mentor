package com.peculiaruc.alc_mmsystem_mentor.ui.managers.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.data.repositories.ManagersRepository
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentManagersBinding
import com.peculiaruc.alc_mmsystem_mentor.ui.managers.adapters.ManagersListAdapter


/**
 * A [Fragment] that displays the managers details screen ui.
 *
 *
 *
 */
class ManagersFragment : Fragment() {


    private var _binding: FragmentManagersBinding? = null
    private val binding get() = _binding!!

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentManagersBinding
            .inflate(layoutInflater, container, false)
        recyclerView = binding.recyclerview
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupNavigation()
        populateManagerList()

    }

    private fun setupNavigation() {

        binding.toolbar.setupWithNavController(binding.toolbar.findNavController())
        appBarConfiguration = AppBarConfiguration(binding.toolbar.findNavController().graph)

    }

    private fun populateManagerList() {

        val adapter = ManagersListAdapter {
            val action = ManagersFragmentDirections.actionMyManagersToManagerProfileFragment(it.managerName)
            this.findNavController().navigate(action)
        }

        adapter.submitList(ManagersRepository.allManagers)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this.context)

    }

}