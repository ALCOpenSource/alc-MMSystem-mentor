package com.peculiaruc.alc_mmsystem_mentor.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Task item
 *
 * @property id
 * @property title
 * @property progress
 * @property time
 * @property onStart
 * @property onComplete
 * @property description
 * @constructor Create empty Task item
 */
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
