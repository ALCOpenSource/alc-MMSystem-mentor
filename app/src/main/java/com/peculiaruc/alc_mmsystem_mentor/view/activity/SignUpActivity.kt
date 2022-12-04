package com.peculiaruc.alc_mmsystem_mentor.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.ActivitySignUpBinding
import com.peculiaruc.alc_mmsystem_mentor.view.fragment.SignUpBottomSheetFragment


/**
 * This class is for signing up to become a mentor
 */
class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // adding on click listener for our button.
        binding.btnSignUpApply.setOnClickListener {
            showBottomSheet()
        }

    }


    private fun showBottomSheet() {
        val signUpBottomSheetFragment = SignUpBottomSheetFragment()
        signUpBottomSheetFragment.show(supportFragmentManager, signUpBottomSheetFragment.tag)

    }

}