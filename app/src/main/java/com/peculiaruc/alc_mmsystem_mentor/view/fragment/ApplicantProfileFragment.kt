package com.peculiaruc.alc_mmsystem_mentor.view.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.peculiaruc.alc_mmsystem_mentor.databinding.ActivityApplicantProfileBinding
import com.peculiaruc.alc_mmsystem_mentor.view.activity.EditApplicantProfileActivity
import com.peculiaruc.alc_mmsystem_mentor.view.activity.LogInActivity
import com.peculiaruc.alc_mmsystem_mentor.view.activity.MainActivity

class ApplicantProfileFragment : Fragment() {

    private lateinit var binding: ActivityApplicantProfileBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ActivityApplicantProfileBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        binding.backArrow.setOnClickListener {
            startActivity(Intent(requireActivity(), MainActivity::class.java))
        }

        binding.btnLogout.setOnClickListener {
            startActivity(Intent(requireActivity(), LogInActivity::class.java))
        }

        binding.editProfileButton.setOnClickListener {
            startActivity(Intent(requireActivity(), EditApplicantProfileActivity::class.java))
        }


    }

    companion object {
        fun newInstance(): ApplicantProfileFragment = ApplicantProfileFragment()
    }


}
