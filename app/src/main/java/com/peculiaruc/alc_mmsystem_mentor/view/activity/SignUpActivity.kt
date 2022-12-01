package com.peculiaruc.alc_mmsystem_mentor.view.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.ActivitySignUpBinding
import com.peculiaruc.alc_mmsystem_mentor.view.fragment.BottomSheetFragment


class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // adding on click listener for our button.
        binding.btnSignUpApply.setOnClickListener {
            showBottomSheet(binding.root)
        }

    }


    private fun showBottomSheet(view: View?) {
        val bottomSheetFragment = BottomSheetFragment()
        bottomSheetFragment.show(supportFragmentManager, bottomSheetFragment.tag)

    }

}