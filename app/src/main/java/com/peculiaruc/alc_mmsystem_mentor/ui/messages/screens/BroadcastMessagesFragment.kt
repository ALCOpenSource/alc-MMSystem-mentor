package com.peculiaruc.alc_mmsystem_mentor.ui.messages.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentBroadcastMessagesBinding

class BroadcastMessagesFragment : Fragment() {

    private lateinit var broadcastsBinding: FragmentBroadcastMessagesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        broadcastsBinding = FragmentBroadcastMessagesBinding
            .inflate(layoutInflater, container, false)
        return broadcastsBinding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() = BroadcastMessagesFragment()
    }

}