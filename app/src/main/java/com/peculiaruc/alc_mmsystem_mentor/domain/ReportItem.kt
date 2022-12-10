package com.peculiaruc.alc_mmsystem_mentor.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ReportItem(
    val id : Int,
    val title : String,
    val owner : String,
    val time : String,
    val achievements : String,
    val blocker : String,
    val recommendations : String,

) : Parcelable
