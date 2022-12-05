package com.peculiaruc.alc_mmsystem_mentor.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Report item
 *
 * @property id
 * @property title
 * @property owner
 * @property time
 * @property achievements
 * @property blocker
 * @property recommendations
 * @constructor Create empty Report item
 */
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
