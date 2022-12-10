package com.peculiaruc.alc_mmsystem_mentor.view.activity


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.ActivityDashboardBinding
import com.peculiaruc.alc_mmsystem_mentor.view.fragment.ProfileFragment
import com.peculiaruc.alc_mmsystem_mentor.view.fragment.ProgramsFragment


/**
 * This class is the mentor's dashboard or landing page
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_dashboard)

        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setBottomNavigation()

        binding.ivProfileImg.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }

    private fun setBottomNavigation() {

        binding.bottomNav.setOnItemSelectedListener { item ->
            var selectedFragment: Fragment? = null
            when (item.itemId) {

                R.id.menu_home -> selectedFragment = Fragment()

                R.id.menu_search -> selectedFragment = Fragment()

                R.id.menu_programs -> selectedFragment = ProgramsFragment()

                R.id.menu_message -> selectedFragment = Fragment()

                R.id.menu_profile -> selectedFragment = ProfileFragment()

            }

            openFragment(selectedFragment!!)

            true
        }

    }


    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }


}