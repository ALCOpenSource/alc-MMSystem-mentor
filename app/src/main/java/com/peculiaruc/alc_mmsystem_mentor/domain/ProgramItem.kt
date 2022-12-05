package com.peculiaruc.alc_mmsystem_mentor.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Program item
 *
 * @property id
 * @property title
 * @property date
 * @property programImage
 * @property description
 * @property onDoneDrawable
 * @constructor Create empty Program item
 */
@Parcelize
data class ProgramItem(
    val id : Int,
    val title : String,
    val date : String,
    val programImage : Int,
    val description : String,
    val onDoneDrawable : Int ,
    ) : Parcelable
