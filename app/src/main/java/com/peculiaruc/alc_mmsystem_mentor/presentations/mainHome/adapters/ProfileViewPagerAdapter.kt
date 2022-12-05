package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.otherScreens.*

/**
 * Profile view pager adapter
 *
 * @constructor
 *
 * @param fragment
 */
class ProfileViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 5


    override fun createFragment(position: Int): Fragment {
        return when(position){
             0 -> AboutFragment()
             1 -> MentorProgramsFragment()
             2 -> MentorTasksFragment()
             3 -> MentorReportsFragment()
            else -> MentorCertsFragment()
        }
    }


}