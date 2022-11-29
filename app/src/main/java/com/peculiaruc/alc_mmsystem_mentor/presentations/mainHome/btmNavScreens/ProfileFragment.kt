package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.btmNavScreens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.BtmProfileFragmentLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.MainHomeFragmentDirections
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.ProfileViewPagerAdapter
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.Navigator
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.mmController

class ProfileFragment : Fragment() {
    private lateinit var _binding: BtmProfileFragmentLayoutBinding
    private lateinit var adapter : ProfileViewPagerAdapter
    private var tabTitles = arrayListOf("About", "Programs", "Tasks", "Reports", " Certificates")

    private val binding
        get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        BtmProfileFragmentLayoutBinding.inflate(inflater).let { _binding = it }
        setUpTabLayoutWithViewPager()

        binding.ivProfileView.setOnClickListener {
            Navigator.navigate(
                mmController,
                MainHomeFragmentDirections.actionMainHomeFragmentToEditProfileFragment()
            )
        }
        return binding.root
    }


    private fun setUpTabLayoutWithViewPager() {
        _binding.viewpager.adapter = ProfileViewPagerAdapter(this)
        TabLayoutMediator(_binding.tabLayout, _binding.viewpager){ tab, position ->
            tab.text = tabTitles[position]
        }.attach()

        for (i in 0..4){
            val textView = LayoutInflater.from(requireContext()).inflate(R.layout.tab_title, null)
            as TextView
            _binding.tabLayout.getTabAt(i)?.customView = textView
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding
    }
}