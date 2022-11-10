package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.btmNavScreens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.peculiaruc.alc_mmsystem_mentor.databinding.BtmMessagesFragmentLayoutBinding

class MessagesFragment : Fragment() {
    private var _binding: BtmMessagesFragmentLayoutBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        BtmMessagesFragmentLayoutBinding.inflate(inflater).let { _binding = it }


        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}