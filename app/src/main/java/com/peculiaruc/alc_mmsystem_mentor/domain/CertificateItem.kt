package com.peculiaruc.alc_mmsystem_mentor.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CertificateItem(
    val id : Int,
    val title : String,
    val time : String,
    val certImage : Int,
) : Parcelable
