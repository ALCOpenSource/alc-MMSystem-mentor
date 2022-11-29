package com.peculiaruc.alc_mmsystem_mentor.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ProgramItem(
    val id : Int,
    val title : String,
    val date : String,
    val programImage : Int,
    val description : String,
    val onDoneDrawable : Int ,
    ) : Parcelable
