package com.peculiaruc.alc_mmsystem_mentor.view.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.ActivityCriteriaFormBinding
import com.peculiaruc.alc_mmsystem_mentor.view.fragment.CriteriaBottomSheetFragment

/**
 * This class is for completing application criteria form
 */
class CriteriaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCriteriaFormBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_criteria_form)

        binding = ActivityCriteriaFormBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnCriteriaSubmit.setOnClickListener {
            showBottomSheet()
        }



        binding.backArrow.setOnClickListener {
            startActivity(Intent(this, ProgramDetailActivity::class.java))
        }

    }

    private fun showBottomSheet() {
        val criteriaBottomSheetFragment = CriteriaBottomSheetFragment()
        criteriaBottomSheetFragment.show(supportFragmentManager, criteriaBottomSheetFragment.tag)

    }
}