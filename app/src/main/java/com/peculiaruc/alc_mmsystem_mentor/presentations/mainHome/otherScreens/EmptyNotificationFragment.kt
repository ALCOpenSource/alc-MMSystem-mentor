package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.otherScreens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentEmptyNotificationBinding
import com.peculiaruc.alc_mmsystem_mentor.databinding.MentorCertsFragmentLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.MainHomeFragmentDirections
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.CertificatesAdapter
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.Navigator
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.UiData
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.mmController

class EmptyNotificationFragment : Fragment() {


    private var _binding: FragmentEmptyNotificationBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        FragmentEmptyNotificationBinding.inflate(inflater).let { _binding = it }
        _binding = FragmentEmptyNotificationBinding.inflate(layoutInflater)
        binding.ivNotificationsArrowBack.setOnClickListener {
            findNavController().navigateUp()
        }
        binding.ivNotificationsReload.setOnClickListener {
            findNavController().navigate(R.id.action_emptyNotificationFragment_to_notificationsFragment)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}