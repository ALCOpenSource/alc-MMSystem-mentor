package com.peculiaruc.alc_mmsystem_mentor.presentations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.peculiaruc.alc_mmsystem_mentor.R

/**
 * Main activity
 *
 * @constructor Create empty Main activity
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        Setup ViewBinding if further view manipulation(s) is need
        setContentView(R.layout.main_activity)
    }
}