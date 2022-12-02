package com.peculiaruc.alc_mmsystem_mentor.view.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.ActivityMainBinding
import com.peculiaruc.alc_mmsystem_mentor.view.fragment.ApplicantProfileFragment
import com.peculiaruc.alc_mmsystem_mentor.view.fragment.ProgramsFragment


/**
 * This class is the mentor's dashboard or landing page
 */
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // binding.bottomNav.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        setBottomNavigation()

        binding.ivProfileImg.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }

    private fun setBottomNavigation() {

        binding.bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu_home -> {

                }
                R.id.menu_search -> {

                }
                R.id.menu_programs -> {
                    val programsFragment = ProgramsFragment.newInstance()
                    openFragment(programsFragment)
                    return@setOnItemSelectedListener true
                }

                R.id.menu_message -> {

                }

                R.id.menu_profile -> {
                    val applicantProfileFragment = ApplicantProfileFragment.newInstance()
                    openFragment(applicantProfileFragment)
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
    }


    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }


}