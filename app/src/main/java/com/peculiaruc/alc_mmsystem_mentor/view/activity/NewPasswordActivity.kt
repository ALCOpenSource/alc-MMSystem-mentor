package com.peculiaruc.alc_mmsystem_mentor.view.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.ActivityNewPasswordBinding
import com.peculiaruc.alc_mmsystem_mentor.view.fragment.PasswordBottomSheetFragment

class NewPasswordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_password)

        binding = ActivityNewPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // adding on click listener for our button.
        binding.btnResetPassword.setOnClickListener {
            showBottomSheet(binding.root)
        }
    }

    private fun showBottomSheet(view: View?) {
        val passwordBottomSheetFragment = PasswordBottomSheetFragment()
        passwordBottomSheetFragment.show(supportFragmentManager, passwordBottomSheetFragment.tag)

    }

}