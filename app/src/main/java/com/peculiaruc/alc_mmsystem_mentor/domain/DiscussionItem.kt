package com.peculiaruc.alc_mmsystem_mentor.domain

/**
 * Discussion item
 *
 * @property id
 * @property title
 * @property description
 * @property time
 * @property owner
 * @constructor Create empty Discussion item
 */
data class DiscussionItem(
    val id : Int,
    val title : String,
    val description: String,
    val time : String,
    val owner : String,

)
