package com.peculiaruc.alc_mmsystem_mentor.view.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.peculiaruc.alc_mmsystem_mentor.R

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    /*
    *  Application entry point
    */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val timeDelay: Long = 3000

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, OnBoardingActivity::class.java)
            startActivity(intent)
            finish()
        }, timeDelay)
    }
}