package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.otherScreens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentNotificationsBinding
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.NotificationsAdapter
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.UiData


class NotificationsFragment : Fragment() {
    private var _binding: FragmentNotificationsBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        FragmentNotificationsBinding.inflate(inflater).let { _binding = it }
        _binding = FragmentNotificationsBinding.inflate(layoutInflater)
        val adapter = NotificationsAdapter(UiData.notificationsLIst)
        binding.notificationsRv .adapter = adapter
        binding.notificationsRv.layoutManager = LinearLayoutManager(activity)
        binding.ivNotificationsArrowBack.setOnClickListener {
            findNavController().navigateUp()
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}