package com.peculiaruc.alc_mmsystem_mentor.ui.messages.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.data.repositories.MessagesRepository
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentChatsBinding
import com.peculiaruc.alc_mmsystem_mentor.ui.messages.adapters.ChatListAdapter

/**
 * A [Fragment] that displays the chats messages ui.
 *
 *
 *
 */
class ChatsFragment : Fragment() {

    private var _binding: FragmentChatsBinding? = null

    private val binding get() = _binding!!

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentChatsBinding.inflate(inflater, container, false)
        recyclerView = binding.chatsRecyclerview
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        populateChats()

    }

    private fun populateChats() {

        val adapter = ChatListAdapter{
            val action = MessagesFragmentDirections.actionMessagesToChatFragment(it.chatOwner)
            findNavController().navigate(action)
        }

        adapter.submitList(MessagesRepository.allChats)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this.requireContext())

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {

        /**
         * creates a new instance of the ChatsFragment at runtime
         */
        @JvmStatic
        fun newInstance() = ChatsFragment()

    }

}