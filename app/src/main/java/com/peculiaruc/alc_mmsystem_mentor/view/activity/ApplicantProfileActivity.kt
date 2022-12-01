package com.peculiaruc.alc_mmsystem_mentor.view.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.ActivityApplicantProfileBinding

class ApplicantProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityApplicantProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_applicant_profile)

        binding = ActivityApplicantProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backArrow.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.btnLogout.setOnClickListener {
            startActivity(Intent(this, LogInActivity::class.java))
        }

        binding.editProfileButton.setOnClickListener {
            startActivity(Intent(this, EditApplicantProfileActivity::class.java))
        }

    }

}
