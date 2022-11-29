package com.peculiaruc.alc_mmsystem_mentor.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TaskItem(
    val id : Int,
    val title : String,
    val progress : String,
    val time : String,
    val onStart : Boolean?= null,
    val onComplete: Boolean? =null,
    val description : String,

    ) : Parcelable
