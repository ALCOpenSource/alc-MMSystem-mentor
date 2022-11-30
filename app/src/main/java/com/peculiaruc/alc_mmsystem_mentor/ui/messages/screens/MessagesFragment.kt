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

/**
 * A [Fragment] that displays the messages ui.
 *
 *
 *
 */
class MessagesFragment : Fragment() {

    private lateinit var messagesBinding: FragmentMessagesBinding
    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var toolbar: androidx.appcompat.widget.Toolbar


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        messagesBinding = FragmentMessagesBinding
            .inflate(layoutInflater, container, false)

        bottomNavigationView = messagesBinding.bottomNavigation
        toolbar = messagesBinding.toolbar

        return messagesBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupNavigation()

    }

    private fun setupNavigation() {
        toolbar.setupWithNavController(toolbar.findNavController())
        appBarConfiguration = AppBarConfiguration(toolbar.findNavController().graph)

        NavigationUI.setupWithNavController(
            bottomNavigationView,
            bottomNavigationView.findNavController())
    }

}