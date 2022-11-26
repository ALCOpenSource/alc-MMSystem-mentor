package com.peculiaruc.alc_mmsystem_mentor.ui.messages.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentMessagesBinding


class MessagesFragment : Fragment() {

    private lateinit var messagesBinding: FragmentMessagesBinding
    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var toolbar: androidx.appcompat.widget.Toolbar
    private lateinit var chats: TextView
    private lateinit var broadcasts: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        messagesBinding = FragmentMessagesBinding
            .inflate(layoutInflater, container, false)

        bottomNavigationView = messagesBinding.bottomNavigation
        toolbar = messagesBinding.toolbar
        chats = messagesBinding.chats
        broadcasts = messagesBinding.broadcastMessages

        return messagesBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupNavigation()
        toggleDisplays()

    }

    private fun setupNavigation() {
        toolbar.setupWithNavController(toolbar.findNavController())
        appBarConfiguration = AppBarConfiguration(toolbar.findNavController().graph)

        NavigationUI.setupWithNavController(
            bottomNavigationView,
            bottomNavigationView.findNavController())
    }

    private fun toggleDisplays() {
        chats.setOnClickListener {
            displayChats()
        }
        broadcasts.setOnClickListener {
            displayBroadcasts()
        }
    }

    private fun displayChats() {

        chats.setBackgroundColor(
            ContextCompat.getColor(requireActivity().applicationContext, R.color.white)
        )
        chats.setTextColor(
            ContextCompat.getColor(requireActivity().applicationContext, R.color.primary_color_2)
        )

        broadcasts.setBackgroundColor(
            ContextCompat.getColor(requireActivity().applicationContext, R.color.primary_color_2)
        )
        broadcasts.setTextColor(
            ContextCompat.getColor(requireActivity().applicationContext, R.color.white)
        )

        childFragmentManager.commit {
            setReorderingAllowed(true)
            replace(R.id.messages_container, ChatsFragment.newInstance())
            addToBackStack("Chats")
        }

    }

    private fun displayBroadcasts() {

        broadcasts.setBackgroundColor(
            ContextCompat.getColor(requireActivity().applicationContext, R.color.white)
        )
        broadcasts.setTextColor(
            ContextCompat.getColor(requireActivity().applicationContext, R.color.purple_500)
        )

        chats.setBackgroundColor(
            ContextCompat.getColor(requireActivity().applicationContext, R.color.purple_500)
        )
        chats.setTextColor(
            ContextCompat.getColor(requireActivity().applicationContext, R.color.white)
        )

        childFragmentManager.commit {
            setReorderingAllowed(true)
            replace(R.id.messages_container, BroadcastMessagesFragment.newInstance())
            addToBackStack("Broadcast Messages")
        }

    }

}