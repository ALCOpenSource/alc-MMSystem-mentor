package com.peculiaruc.alc_mmsystem_mentor.view.adapter

import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

/**
 * This is an adapter class for creating view pagers
 */
class ViewPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    private val mFrgmentList = ArrayList<Fragment>()
    private val mFrgmentTitleList = ArrayList<String>()


    override fun getCount() = mFrgmentList.size

    override fun getItem(position: Int) = mFrgmentList[position]

    override fun getPageTitle(position: Int) = mFrgmentTitleList[position]

    // This function add fragment and title to the view pager adapter
    fun addFragment(fragment: Fragment, title: String) {
        mFrgmentList.add(fragment)
        mFrgmentTitleList.add(title)
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        super.destroyItem(container, position, `object`)
    }
}