package com.peculiaruc.alc_mmsystem_mentor.ui.messages.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.data.local.database.models.Chat
import com.peculiaruc.alc_mmsystem_mentor.data.repositories.MessagesRepository
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentChatBinding
import com.peculiaruc.alc_mmsystem_mentor.ui.messages.adapters.ChatListAdapter
import com.peculiaruc.alc_mmsystem_mentor.ui.messages.adapters.MessageListAdapter
import kotlinx.android.synthetic.main.chat_item.*


/**
 * A [Fragment] that displays the chats ui.
 *
 *
 *
 */
class ChatFragment : Fragment() {

    private val args: ChatFragmentArgs by navArgs()

    private var _binding: FragmentChatBinding? = null

    private val binding get() = _binding!!

    private lateinit var appBarConfiguration: AppBarConfiguration

    private lateinit var recyclerView: RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentChatBinding.inflate(inflater, container, false)
        recyclerView = binding.messagesRecyclerview

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupNavigation()
        displayMessages()

    }

    private fun setupNavigation() {
        binding.chatToolbar.setupWithNavController(binding.chatToolbar.findNavController())
        appBarConfiguration = AppBarConfiguration(binding.chatToolbar.findNavController().graph)
    }

    private fun displayMessages() {

        val adapter = MessageListAdapter()

        adapter.submitList(MessagesRepository.getChatMessages(args.name))

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this.requireContext())

    }
}