package com.peculiaruc.alc_mmsystem_mentor.view.activity

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.ActivityLoginBinding


class LogInActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.logInButton.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }


        binding.tvSignUp.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }

        binding.tvForgotPwd.setOnClickListener {
            startActivity(Intent(this, PasswordActivity::class.java))

        }

        val googleTextView: TextView = binding.googleSignIn.getChildAt(0) as TextView
        googleTextView.text = "Sign In with Google"

    }


}