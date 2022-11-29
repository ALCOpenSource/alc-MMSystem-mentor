package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils

import android.app.Activity
import android.widget.Toast
import androidx.fragment.app.Fragment

fun Activity.showToast(msg: String, duration: Int = Toast.LENGTH_SHORT){
    Toast.makeText(this, msg, duration).show()
}

fun Fragment.showToast(msg: String, duration: Int = Toast.LENGTH_SHORT){
    requireActivity().showToast(msg, duration)
}