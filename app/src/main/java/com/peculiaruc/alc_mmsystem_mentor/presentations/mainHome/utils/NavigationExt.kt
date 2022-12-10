package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils

import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.peculiaruc.alc_mmsystem_mentor.R

/**
 * mmBtmController
 * Get a reference to MainHomeFragment Bottom Nav and returns a NavHostFragment for use in navigation
 */
val Fragment.mmBtmController: NavHostFragment
    get() = childFragmentManager.findFragmentById(R.id.nav_host_fragment_bottom_nav) as NavHostFragment


/**
 * mmController
 * Get a reference to MainHomeFragment Bottom Nav and returns a NavHostFragment for use in navigation
 */
val Fragment.mmController: NavController
    get() = requireActivity().findNavController(R.id.nav_host_fragment_activity)
