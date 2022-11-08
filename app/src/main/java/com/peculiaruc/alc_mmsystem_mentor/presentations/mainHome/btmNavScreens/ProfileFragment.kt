package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.btmNavScreens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.peculiaruc.alc_mmsystem_mentor.databinding.BtmProfileFragmentLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.MainHomeFragmentDirections
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.Navigator
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.mmController

class ProfileFragment : Fragment() {
    private var _binding: BtmProfileFragmentLayoutBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        BtmProfileFragmentLayoutBinding.inflate(inflater).let { _binding = it }


        binding.editProfile.setOnClickListener {
            Navigator.navigate(
                mmController,
                MainHomeFragmentDirections.actionMainHomeFragmentToEditProfileFragment()
            )
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}