package com.peculiaruc.alc_mmsystem_mentor.view.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.ActivityForgotPasswordBinding


class PasswordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityForgotPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // adding on click listener for our button.
        binding.btnForgotPasswordDone.setOnClickListener {
            startActivity(Intent(this, NewPasswordActivity::class.java))
            finish()
        }

    }


}