package com.peculiaruc.alc_mmsystem_mentor.ui.messages.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentChatBinding


class ChatFragment : Fragment() {

    companion object {
        var CONTACT_NAME = "contact_name"
    }

    private lateinit var contactName: String

    private var _binding: FragmentChatBinding? = null

    private val binding get() = _binding!!

    private lateinit var appBarConfiguration: AppBarConfiguration

    private lateinit var toolbar: androidx.appcompat.widget.Toolbar

    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            contactName = it.getString(CONTACT_NAME).toString()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentChatBinding.inflate(inflater, container, false)
        toolbar = binding.chatToolbar

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupNavigation()

        recyclerView = binding.chatRecyclerview
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

    }

    private fun setupNavigation() {
        toolbar.setupWithNavController(toolbar.findNavController())
        appBarConfiguration = AppBarConfiguration(toolbar.findNavController().graph)
    }


}