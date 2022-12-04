package com.peculiaruc.alc_mmsystem_mentor.view.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.peculiaruc.alc_mmsystem_mentor.view.fragment.OnBoardingFragment

/**
 * This is an adapter class for creating OnBoarding fragments
 */
class OnBoardingAdapter(activity: AppCompatActivity, private val itemsCount: Int) :
    FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return itemsCount
    }

    override fun createFragment(position: Int): Fragment {
        return OnBoardingFragment.getInstance(position)
    }

}