package com.peculiaruc.alc_mmsystem_mentor.data.local.database.models

/**
 * A [Manager] class that holds the managers data information.
 *
 *
 */
data class Manager(

    val managerName: String,
    val managerTitle: String,
    val about: String,
    val address: String? = null,
    val memberSince: String,
    val technicalProficiency: String? = null,
    val tags: List<String>? = null,
    val github: String? = null,
    val linkedIn: String? = null,
    val instagram: String? = null,
    val twitter: String? = null,
    val website: String? = null

)
